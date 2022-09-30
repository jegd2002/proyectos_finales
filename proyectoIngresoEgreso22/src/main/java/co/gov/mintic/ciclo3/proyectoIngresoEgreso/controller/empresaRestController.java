package co.gov.mintic.ciclo3.proyectoIngresoEgreso.controller;


import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.empresa;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Todas las actualizaciones estan funcionando de forma correcta
@RestController
@RequestMapping("/api")
public class empresaRestController {
    @Autowired
    public EmpresaService restEmpresa;
    @GetMapping("/enterprises")
    public List<empresa> findAll2(){

        return this.restEmpresa.findAll2();
    }
    @PostMapping("/enterprises")
    public empresa createEmpresa(@RequestBody empresa crearEmpresa){
        return this.restEmpresa.createEmpresa(crearEmpresa);
    }
    @GetMapping("/enterprises/{id}")
    public empresa findById(@PathVariable long id){
        return this.restEmpresa.findById(id);
    }
    @PutMapping("/enterprises/{id}")
    public empresa updateEmpresa(@PathVariable long id, @RequestBody empresa datos) {
        return this.restEmpresa.updateEmpresa(id,datos);
    }
    @DeleteMapping("/enterprises/{id}")
    public void deleteEmpresa(@PathVariable long id){
        this.restEmpresa.deleteEmpresa(id);
    }
}
