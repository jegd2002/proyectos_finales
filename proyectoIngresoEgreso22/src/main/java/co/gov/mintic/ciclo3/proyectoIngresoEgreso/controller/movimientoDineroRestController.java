package co.gov.mintic.ciclo3.proyectoIngresoEgreso.controller;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.movimientoDinero;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.service.movimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class movimientoDineroRestController {
    @Autowired
    public movimientoDineroService newService2;

    @GetMapping("/movimiento/{id}")
    public movimientoDinero findById(@PathVariable long id) {

        return newService2.findById(id);
    }
    @PostMapping("/movimiento/{id}")
    public movimientoDinero CreateNuevoMovimiento(@RequestBody movimientoDinero movimientoDinero2, @PathVariable long id){

        return newService2.CreateNuevoMovimiento(movimientoDinero2,id);
    }

    @PutMapping("/movimiento/{id}")
    public movimientoDinero updateMovimiento (@PathVariable long id, @RequestBody movimientoDinero nuevoMovimiento){

        return newService2.updateMovimiento(id,nuevoMovimiento);
    }
    @DeleteMapping("/movimiento/{id}")
    public void deleteMovimiento(@PathVariable long id){
        newService2.deleteMovimiento(id);
    }

}
