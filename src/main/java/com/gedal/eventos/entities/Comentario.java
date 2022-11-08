package com.gedal.eventos.entities;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_comentario")
public class Comentario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private String name;
    @Getter @Setter private String conteudo;
    @Getter @Setter private Instant momento;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    @Getter @Setter Topico topico;


    public Comentario(){

    }

    public Comentario(Long id, String name, String conteudo, Instant momento, Topico topico) {
        this.id = id;
        this.name = name;
        this.conteudo = conteudo;
        this.momento = momento;
        this.topico = topico;
    }
}
