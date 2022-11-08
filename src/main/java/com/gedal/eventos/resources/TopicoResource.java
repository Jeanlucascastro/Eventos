package com.gedal.eventos.resources;


import com.gedal.eventos.entities.Topico;
import com.gedal.eventos.servicies.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/topicos")
public class TopicoResource {

    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public ResponseEntity<List<Topico>> findAll() {
        List<Topico> list = topicoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Topico> findById(@PathVariable Long id) {
        Topico topico = topicoService.findById(id);
        return ResponseEntity.ok().body(topico);
    }
}

