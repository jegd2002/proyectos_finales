package co.gov.mintic.ciclo3.proyectoIngresoEgreso.repository;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<empleado, Long> {
}
