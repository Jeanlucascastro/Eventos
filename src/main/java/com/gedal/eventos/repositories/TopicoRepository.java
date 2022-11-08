package com.gedal.eventos.repositories;

import com.gedal.eventos.entities.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
