package com.puce.libreria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libros")
public class LibroController {

    @GetMapping("/formulario")
    public String mostrarFormulario() {
        return "pages/libroForm";
    }

    @GetMapping("/home")
    public String mostrarindex() {
        return "index";
    }
}