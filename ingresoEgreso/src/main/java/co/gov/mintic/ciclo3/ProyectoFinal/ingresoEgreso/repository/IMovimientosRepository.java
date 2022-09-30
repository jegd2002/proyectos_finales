package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.repository;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.movimientoDinero;
import org.springframework.data.repository.CrudRepository;

public interface IMovimientosRepository extends CrudRepository<movimientoDinero, Long> {
}
