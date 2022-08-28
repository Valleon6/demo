package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student valentine = new Student(
                    "Valentine",
                    "val.ekechukwu@gmail.com",
                    LocalDate.of(1996, FEBRUARY, 14) );

            Student mariam = new Student(
                    "Mariam",
                    "mariam.dalu@gmail.com",
                    LocalDate.of(2000, JANUARY, 18)
                    );

            studentRepository.saveAll(List.of(valentine, mariam));

        };
    }
}
