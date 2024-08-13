package cl.praxis.escuelaRural.model.entities;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Tipo tipo;

    @OneToMany(mappedBy = "curso")
    private List<Estudiante> estudiantes;

    public enum Tipo {
        DIA, NOCHE
    }

    public Curso() {
    }

    public Curso(Long id, String nombre, Tipo tipo, List<Estudiante> estudiantes) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estudiantes = estudiantes;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}