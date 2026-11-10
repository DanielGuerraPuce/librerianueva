package com.puce.libreria.service;

import com.puce.libreria.entity.Libro;
import com.puce.libreria.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    //Guardar
    public Libro guardarLibro(Libro libro){
        libroRepository.save(libro);
        return libro;
    }
}
