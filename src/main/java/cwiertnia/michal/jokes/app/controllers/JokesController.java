package cwiertnia.michal.jokes.app.controllers;

import cwiertnia.michal.jokes.app.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"", "/"})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
