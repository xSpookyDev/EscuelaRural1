package cl.praxis.escuelaRural.model.repository;

import cl.praxis.escuelaRural.model.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
