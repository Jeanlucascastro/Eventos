package com.gedal.eventos.servicies;

import com.gedal.eventos.entities.Topico;
import com.gedal.eventos.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public List<Topico> findAll() {
        return topicoRepository.findAll();
    }

    public Topico findById(Long id) {
        Optional<Topico> obj = topicoRepository.findById(id);
        return obj.get();
    }
}