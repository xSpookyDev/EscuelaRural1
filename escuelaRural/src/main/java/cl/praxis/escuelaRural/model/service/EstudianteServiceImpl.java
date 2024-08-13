package cl.praxis.escuelaRural.model.service;

import java.util.List;
import java.util.Optional;

import cl.praxis.escuelaRural.model.entities.Estudiante;
import cl.praxis.escuelaRural.model.repository.EstudianteRepository;
import cl.praxis.escuelaRural.model.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findOne(int id) {
      return  estudianteRepository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Estudiante e) {
        try {
            estudianteRepository.save(e);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean update(Estudiante e) {
   Estudiante estu = estudianteRepository.save(e);
   return estu != null;
    }

    @Override
    public boolean delete(int id) {
        boolean exist = estudianteRepository.existsById(id);
        if (exist){
            estudianteRepository.deleteById(id);
        }
        return exist;
    }
}
