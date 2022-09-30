package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado;

import java.util.List;

public interface IEmpleadoService {
    public List<empleado> findAll3();

    public empleado createEmpleado(empleado crearEmpleado);

    public empleado findById(long id);

    public empleado updateEmpleado( long id, empleado datosEmpleado);

    public void deleteEmpleado(long id);
}
