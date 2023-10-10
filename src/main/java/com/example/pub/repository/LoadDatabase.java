package com.example.pub.repository;

import com.example.pub.entities.Drinker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {


    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);


    @Bean
    CommandLineRunner initDatabase(DrinkerRepository repository){

        return args -> {
            log.info("Preloading " + repository.save(new Drinker(null,"Santiago","1234","Beer",10000,
                    null,null,10000)));
            log.info("Preloading " + repository.save(new Drinker(null,"Daniela","5678","Aguardiente",5000,
                    null,null,5000)));
        };
    }
}
