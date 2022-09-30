package co.gov.mintic.ciclo3.proyectoIngresoEgreso.controller;


import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.empleado;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.service.empleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Todas las actualizaciones estan funcionando de forma correcta
@RestController
@RequestMapping("/api")
public class empleadoRestController {
    @Autowired
    public empleadoService serviciosEmpleado;

    @GetMapping("/users")
    public List<empleado> findAll3(){
        return serviciosEmpleado.findAll3();
    }
    @PostMapping("/users")
    public empleado createEmpleado(@RequestBody empleado crearEmpleado){
        return this.serviciosEmpleado.createEmpleado(crearEmpleado);
    }
    @GetMapping("/users/{id}")
    public empleado findById(@PathVariable long id) {
        return this.serviciosEmpleado.findById(id);
    }

    @PutMapping("/users/{id}")
    public empleado updateEmpleado(@PathVariable long id, @RequestBody empleado datosEmpleado){
        return serviciosEmpleado.updateEmpleado(id, datosEmpleado);
    }


    @DeleteMapping("/users/{id}")
    public void deleteEmpresa(@PathVariable long id){
        this.serviciosEmpleado.deleteEmpresa(id);
    }
}
