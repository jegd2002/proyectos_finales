package co.gov.mintic.ciclo3.proyectoIngresoEgreso.controller;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.idRol;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.service.idRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class idRolRestController {

    @Autowired
    public idRolService rolService;

    @GetMapping("/idUsers")
    public List<idRol> findAll(){
        return rolService.findAll();
    }

    @PostMapping("/idUsers")
    public idRol createRol(@RequestBody idRol rol1){
        return rolService.createRol(rol1);
    }

    @GetMapping("/idUsers/{id}")
    public idRol findById(@PathVariable long id){

        return rolService.findById(id);
    }

    @PutMapping("/idUsers/{id}")
    public idRol updateRol(@PathVariable long id, @RequestBody idRol rol){

        return rolService.updateRol(id, rol);
    }
    //delete en direccion (/entreprise/{id})
    @DeleteMapping("/idUsers/{id}")
    public void deleteidRol(@PathVariable long id){
        rolService.deleteidRol(id);
    }

}
