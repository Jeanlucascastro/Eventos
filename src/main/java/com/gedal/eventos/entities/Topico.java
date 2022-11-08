package com.gedal.eventos.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_topico")
public class Topico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;
    @Getter @Setter private String titulo;
    @Getter @Setter private Instant momento;
    @Getter @Setter private String conteudo;
    @Getter @Setter private String localizacao;
    @Getter @Setter private String comoObservar;

    public Topico() {

    }

    public Topico(Long id, String titulo, Instant momento, String conteudo, String localizacao, String comoObservar) {
        this.id = id;
        this.titulo = titulo;
        this.momento = momento;
        this.conteudo = conteudo;
        this.localizacao = localizacao;
        this.comoObservar = comoObservar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topico topico = (Topico) o;
        return Objects.equals(id, topico.id) && Objects.equals(titulo, topico.titulo) && Objects.equals(momento, topico.momento) && Objects.equals(conteudo, topico.conteudo) && Objects.equals(localizacao, topico.localizacao) && Objects.equals(comoObservar, topico.comoObservar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, momento, conteudo, localizacao, comoObservar);
    }
}
