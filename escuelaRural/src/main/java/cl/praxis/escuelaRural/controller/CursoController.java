package cl.praxis.escuelaRural.controller;

import cl.praxis.escuelaRural.model.service.CursoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursos")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping()
    public String findAll(Model model) {
        model.addAttribute("cursos", cursoService.findAll());
        return "cursoList";
    }
}
