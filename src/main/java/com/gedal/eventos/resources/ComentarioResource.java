package com.gedal.eventos.resources;


import com.gedal.eventos.entities.Comentario;
import com.gedal.eventos.servicies.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/comentarios")
public class ComentarioResource {

    @Autowired
    private ComentarioService comentarioService;


    @GetMapping
    public ResponseEntity<List<Comentario>> findAll() {
        List<Comentario> list = comentarioService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Comentario> findById(@PathVariable Long id) {
        Comentario comentario = comentarioService.findById(id);
        return ResponseEntity.ok().body(comentario);
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<Comentario> insert(@PathVariable Long id, @RequestBody Comentario comentario) {
        comentario = comentarioService.insert(id, comentario);
        return ResponseEntity.ok().body(comentario);
    }
}

