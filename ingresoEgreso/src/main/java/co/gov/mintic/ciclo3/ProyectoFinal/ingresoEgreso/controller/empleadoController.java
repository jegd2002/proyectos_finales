package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.controller;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.idRol;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.IEmpleadoService;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.IempresaService;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.IidRolService;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.empleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class empleadoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @Autowired
    private IidRolService rolService;
    @Autowired
    private IempresaService empresaService;

    private final Logger LOG = Logger.getLogger(""+empleadoController.class);

    @GetMapping("/empleado/listaUsuarios") //Get de Datos
    public String getListEmpleados(Model model){
        LOG.log(Level.INFO, "getListEmpleados");
        List<empleado> empleados = empleadoService.findAll3();
        model.addAttribute("empleados", empleados);
        return "empleado/listaUsuarios";
    }

    @GetMapping("/empleado/modificarEmpleado")
    public String createEmpleado(Model createModel){
        LOG.log(Level.INFO, "createEmpleados");
        //Empleado
        empleado usuario = new empleado();
        createModel.addAttribute("usuario", usuario);
        //Rol seleccion
        List<idRol> roles = rolService.findAll();
        createModel.addAttribute("roles" , roles);
        //Empresa seleccion
        List<empresa> empresas = empresaService.findAll2();
        createModel.addAttribute("empresas",empresas);
        return "empleado/modificarEmpleado";
    }
    @PostMapping("/guardar")
    public String guardarUsuario(empleado user, Errors errores){
        LOG.log(Level.INFO, "guardarEmpleados");
        user = empleadoService.createEmpleado(user);
        return "redirect:/empleado/listaUsuarios";
    }
    @RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
    public String editUsuario(@PathVariable("id") long id, Model model){
        LOG.log(Level.INFO,"edit user");
        empleado empleado = empleadoService.findById(id);
        model.addAttribute("usuario",empleado);
        //roles
        List<idRol> roles = rolService.findAll();
        model.addAttribute("roles" , roles);
        //Empresa seleccion
        List<empresa> empresas = empresaService.findAll2();
        model.addAttribute("empresas",empresas);
        return "empleado/modificarEmpleado";
    }
    @RequestMapping(value = "/eliminar/{id}",method = RequestMethod.GET)
    public String deleteUsuario(@PathVariable("id")long id,Model modelo){
        LOG.log(Level.INFO,"deleteUsuario");
        empleadoService.deleteEmpleado(id);
        return "redirect:/empleado/listaUsuarios";
    }
}