package com.gedal.eventos.servicies;

import com.gedal.eventos.entities.Comentario;
import com.gedal.eventos.entities.Topico;
import com.gedal.eventos.repositories.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Autowired
    private TopicoService topicoService;

    public List<Comentario> findAll() {
        return comentarioRepository.findAll();
    }

    public Comentario findById(Long id) {
        Optional<Comentario> obj = comentarioRepository.findById(id);
        return obj.get();
    }

    public Comentario insert(Long id, Comentario comentario) {
        Topico topico = topicoService.findById(id);
        comentario.setTopico(topico);
        return comentarioRepository.save(comentario);
    }
}