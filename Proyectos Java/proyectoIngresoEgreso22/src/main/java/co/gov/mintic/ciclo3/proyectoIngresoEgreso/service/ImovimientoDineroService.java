package co.gov.mintic.ciclo3.proyectoIngresoEgreso.service;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.movimientoDinero;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ImovimientoDineroService {
    public movimientoDinero findById(long id);

    public movimientoDinero CreateNuevoMovimiento(movimientoDinero movimientoDinero2, long id);

    public movimientoDinero updateMovimiento (long id, movimientoDinero nuevoMovimiento);

    public void deleteMovimiento(long id);
}
