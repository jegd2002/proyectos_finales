package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.idRol;

import java.util.List;

public interface IidRolService {

    public List<idRol> findAll();

    public idRol createRol(idRol rol1);

    public idRol findById(long id);

    public idRol updateRol(long id, idRol rol);

    public void deleteidRol(long id);
}
