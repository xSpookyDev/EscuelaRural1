package cl.praxis.escuelaRural.controller;

import cl.praxis.escuelaRural.model.entities.Estudiante;
import cl.praxis.escuelaRural.model.service.EstudianteService;
import cl.praxis.escuelaRural.model.service.CursoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
    private final EstudianteService estudianteService;
    private final CursoService cursoService;

    public EstudianteController(EstudianteService estudianteService, CursoService cursoService) {
        this.estudianteService = estudianteService;
        this.cursoService = cursoService;
    }

    @GetMapping()
    public String findAll(Model model) {
        System.out.println(estudianteService.findAll());
        model.addAttribute("estudiantes", estudianteService.findAll());
        return "estudianteList";
    }

    @GetMapping("/{id}")
    public String findOne(@PathVariable("id") int id, Model model) {
        model.addAttribute("estudiante", estudianteService.findOne(id));
        model.addAttribute("cursos", cursoService.findAll());
        return "estudianteEdit";
    }

    @PostMapping()
    public String update(@ModelAttribute Estudiante estudiante) {
        boolean result = estudianteService.update(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/new")
    public String toCreate(Model model) {
        model.addAttribute("cursos", cursoService.findAll());
        return "estudianteNew";
    }

    @PostMapping("/new")
    public String create(@ModelAttribute Estudiante estudiante) {
        boolean result = estudianteService.create(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/{id}/del")
    public String delete(@PathVariable("id") int id) {
        boolean result = estudianteService.delete(id);
        return "redirect:/estudiantes";
    }
}
