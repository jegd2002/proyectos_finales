package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.repository;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends JpaRepository<empleado, Long> {

    empleado findByUsername(String username);
}
