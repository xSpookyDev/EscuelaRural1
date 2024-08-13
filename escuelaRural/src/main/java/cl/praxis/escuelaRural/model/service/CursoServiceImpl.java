package cl.praxis.escuelaRural.model.service;

import cl.praxis.escuelaRural.model.entities.Curso;
import cl.praxis.escuelaRural.model.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso findOne(int id) {
        return cursoRepository.findById(id).orElse(null);
    }
}
