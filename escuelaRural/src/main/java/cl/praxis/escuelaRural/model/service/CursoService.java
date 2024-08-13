package cl.praxis.escuelaRural.model.service;

import cl.praxis.escuelaRural.model.entities.Curso;

import java.util.List;

public interface CursoService {
    List<Curso> findAll();
    Curso findOne(int id);
}
