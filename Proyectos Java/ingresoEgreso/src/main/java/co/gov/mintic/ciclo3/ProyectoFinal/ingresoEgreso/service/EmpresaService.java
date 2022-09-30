package co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.service;

import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.entities.empresa;
import co.gov.mintic.ciclo3.ProyectoFinal.ingresoEgreso.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IempresaService{

    @Autowired
    public IEmpresaRepository empresaRepository;
    @Override
    public List<empresa> findAll2() {
        List<empresa> roles2 = (List<empresa>) empresaRepository.findAll();
        return roles2;
    }

    @Override
    public empresa createEmpresa(empresa crearEmpresa) {
        empresa newEmpresa = empresaRepository.save(crearEmpresa);
        return newEmpresa;

    }

    @Override
    public empresa findById(long id) {
        Optional<empresa> findIdEmpresa = empresaRepository.findById(id);
        return findIdEmpresa.get();
    }

    @Override
    public empresa updateEmpresa(long id, empresa datos) {
        empresa updateEmpresa1 = empresaRepository.save(datos);
        return updateEmpresa1;
    }

    @Override
    public void deleteEmpresa(long id) {
       empresaRepository.deleteById(id);
    }
}
