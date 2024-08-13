package cl.praxis.escuelaRural.model.service;

import cl.praxis.escuelaRural.model.entities.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<Estudiante> findAll();
    Estudiante findOne(int id);
    boolean create(Estudiante e);
    boolean update(Estudiante e);
    boolean delete(int id);
}
