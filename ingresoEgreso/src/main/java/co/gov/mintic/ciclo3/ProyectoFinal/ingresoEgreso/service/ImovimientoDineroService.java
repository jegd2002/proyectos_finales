package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.movimientoDinero;

import java.util.List;

public interface ImovimientoDineroService {

    public List<movimientoDinero> findAll();

    public movimientoDinero findById(long id);

    public movimientoDinero create(movimientoDinero crearMovimiento);

    public movimientoDinero CreateNuevoMovimiento(movimientoDinero movimientoDinero2, long id);

    public movimientoDinero updateMovimiento (long id, movimientoDinero nuevoMovimiento);

    public void deleteMovimiento(long id);
}
