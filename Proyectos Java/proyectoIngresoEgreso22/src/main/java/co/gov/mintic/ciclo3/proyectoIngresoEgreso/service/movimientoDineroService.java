package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.movimientoDinero;
import co.gov.mintic.ciclo3.proyectoIngresoEgreso.repository.IMovimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class movimientoDineroService implements ImovimientoDineroService{
    @Autowired
    public IMovimientosRepository movimientosRepository;
    @Override
    public movimientoDinero findById(long id) {
        Optional<movimientoDinero> byIdMovimiento = movimientosRepository.findById(id);
        return byIdMovimiento.get();
    }

    @Override
    public movimientoDinero CreateNuevoMovimiento(movimientoDinero movimientoDinero2, long id) {
        movimientoDinero create = movimientosRepository.save(movimientoDinero2);
        return create;
    }

    @Override
    public movimientoDinero updateMovimiento(long id, movimientoDinero nuevoMovimiento) {
        movimientoDinero  update = movimientosRepository.save(nuevoMovimiento);
        return update;
    }

    @Override
    public void deleteMovimiento(long id) {
        movimientosRepository.deleteById(id);
    }
}
