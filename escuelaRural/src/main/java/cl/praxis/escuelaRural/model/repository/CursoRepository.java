package cl.praxis.escuelaRural.model.repository;

import cl.praxis.escuelaRural.model.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
