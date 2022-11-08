package com.gedal.eventos.repositories;

import com.gedal.eventos.entities.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
