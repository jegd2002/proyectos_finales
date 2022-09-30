package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.movimientoDinero;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.repository.IMovimientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class movimientoDineroService implements ImovimientoDineroService{
    @Autowired
    public IMovimientosRepository movimientosRepository;


    @Override
    public List<movimientoDinero> findAll() {
        List<movimientoDinero> movimientos = (List<movimientoDinero>) movimientosRepository.findAll();
        return movimientos;
    }

    @Override
    public movimientoDinero findById(long id) {
        Optional<movimientoDinero> byIdMovimiento = movimientosRepository.findById(id);
        return byIdMovimiento.get();
    }

    @Override
    public movimientoDinero create(movimientoDinero crearMovimiento) {
        movimientoDinero newMovimiento = movimientosRepository.save(crearMovimiento);
        return newMovimiento;
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
