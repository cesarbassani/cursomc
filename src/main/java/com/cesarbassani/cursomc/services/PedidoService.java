package com.cesarbassani.cursomc.services;

import com.cesarbassani.cursomc.domain.Pedido;
import com.cesarbassani.cursomc.repositories.PedidoRepository;
import com.cesarbassani.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido find(Integer id) {
        Optional<Pedido> objPedido = pedidoRepository.findById(id);
        return objPedido.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
