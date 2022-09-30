package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.controller;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.repository.IMovimientosRepository;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.IEmpleadoService;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.IempresaService;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.ImovimientoDineroService;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.movimientoDinero;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
@Controller
public class movimientoController {
    private final Logger LOG = Logger.getLogger(""+movimientoController.class);
    @Autowired
    private ImovimientoDineroService movimientosDinero;

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IempresaService empresaService;


    @GetMapping("/movimientos/listaMovimientos") //Get de Datos
    public String getListMovimientos(Model model){
        LOG.log(Level.INFO, "getListEmpleados");
        List<movimientoDinero> movimientos = movimientosDinero.findAll();
        model.addAttribute("movimientosDinero", movimientos);
        return "movimientos/listaMovimientos";
    }
    @GetMapping("/movimientos/modificarMovimiento")
    public String createEmpleado(Model model){
        LOG.log(Level.INFO,"createEmpleado");
        //movimiento
        movimientoDinero movimiento = new movimientoDinero();
        model.addAttribute("movimientoDinero",movimiento);
        //empleado
        List<empleado> empleados = empleadoService.findAll3();
        model.addAttribute("empleados",empleados);
        //empresa
        List<empresa> empresas = empresaService.findAll2();
        model.addAttribute("empresas",empresas);
        return "movimientos/modificarMovimiento";
    }
    @PostMapping("/guardarMovimiento")
    public String guardarMovimiento(movimientoDinero movimientoDinero){
        LOG.log(Level.INFO,"GuardarMovimiento");
        movimientoDinero = movimientosDinero.create(movimientoDinero);
        return "redirect:/movimientos/listaMovimientos";
    }
    @RequestMapping(value = "/editarMovimiento/{id}",method = RequestMethod.GET)
    public String editMovimiento(@PathVariable("id") long id,Model model){
        LOG.log(Level.INFO,"editMovimiento");
        movimientoDinero editMovimiento = movimientosDinero.findById(id);
        model.addAttribute("movimientoDinero",editMovimiento);
        //empleado
        List<empleado> empleados = empleadoService.findAll3();
        model.addAttribute("empleados",empleados);
        //empresa
        List<empresa> empresas = empresaService.findAll2();
        model.addAttribute("empresas",empresas);
        return "movimientos/modificarMovimiento";
    }
    @RequestMapping(value = "/eliminarMovimiento/{id}", method = RequestMethod.GET)
    public String deleteMovimiento(@PathVariable("id")long id,Model modelo){
        LOG.log(Level.INFO,"deleteMovimiento");
        movimientosDinero.deleteMovimiento(id);
        return "redirect:/movimientos/listaMovimientos";
    }

}
