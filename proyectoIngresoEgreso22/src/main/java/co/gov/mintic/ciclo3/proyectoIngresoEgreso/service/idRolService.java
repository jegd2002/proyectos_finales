package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;


import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.idRol;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class idRolService implements IidRolService{

    @Autowired
    private IRolRepository rolRepository;
    @Override
    public List<idRol> findAll() {
        List<idRol> roles = (List<idRol>) rolRepository.findAll();
        return roles;
    }

    @Override
    public idRol createRol(idRol rol1) {
        idRol newrol = rolRepository.save(rol1);
        return newrol;
    }

    @Override
    public idRol findById(long id) {
        Optional<idRol> rol = rolRepository.findById(id);
        return rol.get();
    }

    @Override
    public idRol updateRol(long id, idRol rol) {
        idRol putRol = rolRepository.save(rol);
        return putRol;
    }

    @Override
    public void deleteidRol(long id) {
        rolRepository.deleteById(id);
    }
}
