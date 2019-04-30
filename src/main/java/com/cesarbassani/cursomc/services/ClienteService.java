package com.cesarbassani.cursomc.services;

import com.cesarbassani.cursomc.domain.Categoria;
import com.cesarbassani.cursomc.domain.Cliente;
import com.cesarbassani.cursomc.repositories.CategoriaRepository;
import com.cesarbassani.cursomc.repositories.ClienteRepository;
import com.cesarbassani.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id) {
        Optional<Cliente> objCliente = clienteRepository.findById(id);
        return objCliente.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }
}
