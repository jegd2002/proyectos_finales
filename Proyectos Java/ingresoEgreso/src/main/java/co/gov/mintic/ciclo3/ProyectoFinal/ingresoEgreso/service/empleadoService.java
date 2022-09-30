package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empleado;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class empleadoService implements IEmpleadoService{

    @Autowired
    public IEmpleadoRepository empleadoRepository;
    @Override
    public List<empleado> findAll3() {
        List<empleado> employed = (List<empleado>) empleadoRepository.findAll();
        return employed;
    }

    @Override
    public empleado createEmpleado(empleado crearEmpleado) {
        empleado newEmpleado = empleadoRepository.save(crearEmpleado);
        return newEmpleado;
    }

    @Override
    public empleado findById(long id) {
        Optional<empleado> findIdEmpleado = empleadoRepository.findById(id);
        return findIdEmpleado.get();
    }

    @Override
    public empleado updateEmpleado(long id, empleado datosEmpleado) {
        empleado updateEmpleado1 = empleadoRepository.save(datosEmpleado);
        return  updateEmpleado1;
    }

    @Override
    public void deleteEmpleado(long id) {
        empleadoRepository.deleteById(id);
    }
}
