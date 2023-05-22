package com.tpe.controller;

import com.tpe.service.FilmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/film")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public String getFilmCount() {
        String numberOfFilm =  filmService.getFilmCount();
        return "Film tablosundaki film sayisi : " + numberOfFilm ;
    }

}
