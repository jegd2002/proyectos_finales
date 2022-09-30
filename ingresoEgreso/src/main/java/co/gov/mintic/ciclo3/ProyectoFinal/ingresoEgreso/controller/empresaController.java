package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.controller;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service.IempresaService;
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
public class empresaController {
    @Autowired
    private IempresaService empresaService;

    private final Logger LOG = Logger.getLogger(""+empresaController.class);

    @GetMapping("/empresa/listaEmpresas")
    public String getlistEmpresa(Model modelo){
        LOG.log(Level.INFO,"getlistempresa");
        List<empresa> empresas = empresaService.findAll2();
        modelo.addAttribute("empresas",empresas);
        return "empresa/listaEmpresas";
    }

    @GetMapping("/empresa/modificarEmpresa")
    public String createEmpresa(Model createModel){
        LOG.log(Level.INFO,"createEmpresa");
        //empresa
        empresa newEmpresa = new empresa();
        createModel.addAttribute("newEmpresa",newEmpresa);
        return "empresa/modificarEmpresa";
    }

    @PostMapping("/guardarEmpresa")
    public String guardarEmpresa (empresa nuevaEmpresa, Errors errores){
        LOG.log(Level.INFO,"guardarEmpresa");
        nuevaEmpresa = empresaService.createEmpresa(nuevaEmpresa);
        return "redirect:/empresa/listaEmpresas";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editEmpresa(@PathVariable("id") long id,Model model){
        LOG.log(Level.INFO,"editEmpresa");
        empresa empresa = empresaService.findById(id);
        model.addAttribute("newEmpresa",empresa);
        return "empresa/modificarEmpresa";
    }
    @RequestMapping(value = "/clean/{id}", method = RequestMethod.GET)
    public String deleteEmpresa(@PathVariable("id")long id,Model modelo){
        LOG.log(Level.INFO,"deleteEmpresa");
        empresaService.deleteEmpresa(id);
        return "redirect:/empresa/listaEmpresas";
    }
}
