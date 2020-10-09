package com;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import  org.springframework.boot.SpringApplication ;
import  org.springframework.boot.autoconfigure.SpringBootApplication ;

import java.io.IOException;

@SpringBootApplication
    public  class  Application implements CommandLineRunner {
        public  static  void  main ( String [] args ) {
            SpringApplication.run(Application.class, args);
        }

        @Override
        public void run(String[] args) throws IOException {

            ObjectMapper objectMapper = new ObjectMapper();

//            ComputerLanguage language = objectMapper.readValue(new File("language.json"), ComputerLanguage.class);

//            System.out.println(language);
        }
}
