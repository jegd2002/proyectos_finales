package co.gov.mintic.ciclo3.proyectoIngresoEgreso.repository;

import co.gov.mintic.ciclo3.proyectoIngresoEgreso.entities.empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaRepository extends CrudRepository<empresa, Long> {
}
