package com.gedal.eventos.config;

import com.gedal.eventos.entities.Topico;
import com.gedal.eventos.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TopicoRepository topicoRepository;


    @Override
    public void run(String... args) throws Exception {
        Topico t1 = new Topico(null, "primeiro evento", Instant.parse("2022-11-20T19:53:07Z"), "ola", "aqui", "Olhando"  );
        Topico t2 = new Topico(null, "Segundo evento", Instant.parse("2022-11-20T19:53:07Z"), "ola", "aqui", "Olhando" );

        topicoRepository.saveAll(Arrays.asList(t1, t2));
    }
}
