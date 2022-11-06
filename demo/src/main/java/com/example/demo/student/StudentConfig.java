package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student anza = new Student("Anza", "anza@maill.com",
                    LocalDate.of(2000, Month.JANUARY, 23) );
            Student usman = new Student("usman", "anza123@maill.com",
                    LocalDate.of(2000, Month.JANUARY, 23));
            studentRepository.saveAll(List.of(usman, anza));
        };
    }
}
