package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa;

import java.util.List;

public interface IempresaService {

    public List<empresa> findAll2();

    public empresa createEmpresa(empresa crearEmpresa);

    public empresa findById(long id);

    public empresa updateEmpresa(long id, empresa datos);

    public void deleteEmpresa(long id);
}
