package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.repository;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa;
import org.springframework.data.repository.CrudRepository;

public interface IEmpresaRepository extends CrudRepository<empresa, Long> {
}
