package com.sofka.naveproject.application;


import com.sofka.naveproject.domain.model.Nave;
import com.sofka.naveproject.domain.model.Tripulada;
import com.sofka.naveproject.domain.service.NaveServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/naves")
public class NaveController {


    private final NaveServiceImpl naveService;

    public NaveController(NaveServiceImpl naveService) {
        this.naveService = naveService;
    }

    @PostMapping("")
    public ResponseEntity<Nave> guardar(@RequestBody Tripulada tripulada){
            return new ResponseEntity<>(  this.naveService.guardar(tripulada), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Nave> consultarPorId(@PathVariable(value="id") Long id ){
        return new ResponseEntity<>(this.naveService.consultar(id), HttpStatus.OK);
    }


}
