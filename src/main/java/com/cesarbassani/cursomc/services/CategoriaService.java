package com.cesarbassani.cursomc.services;

import com.cesarbassani.cursomc.domain.Categoria;
import com.cesarbassani.cursomc.repositories.CategoriaRepository;
import com.cesarbassani.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id) {
        Optional<Categoria> objCategoria = categoriaRepository.findById(id);
        return objCategoria.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}