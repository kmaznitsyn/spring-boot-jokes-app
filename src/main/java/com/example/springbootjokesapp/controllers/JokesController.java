package com.example.springbootjokesapp.controllers;

import com.example.springbootjokesapp.services.JokeProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeProviderService jokeProviderService;

    public JokesController(JokeProviderService jokeProviderService) {
        this.jokeProviderService = jokeProviderService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeProviderService.provideJoke());

        return "index";
    }
}
