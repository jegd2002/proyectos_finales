package co.gov.mintic.ciclo3.proyectoIngresoEgreso.repository;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.movimientoDinero;
import org.springframework.data.repository.CrudRepository;

public interface IMovimientosRepository extends CrudRepository<movimientoDinero, Long> {
}
