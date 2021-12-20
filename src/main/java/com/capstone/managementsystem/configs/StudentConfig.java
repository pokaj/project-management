package com.capstone.managementsystem.configs;

import com.capstone.managementsystem.models.Student;
import com.capstone.managementsystem.repositories.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo){
        return args -> {
            Student philip = new Student(
                    "Philip",
                "Owusu-Afriyie",
                "kwabena",
                "philip@gmail.com",
                "password",
                    LocalDate.of(1997, Month.SEPTEMBER, 16)
            );
            Student akosua = new Student(
                    "Akosua",
                "Boatemaa",
                "akosua",
                "akosua@gmail.com",
                "password",
                    LocalDate.of(1998, Month.JANUARY, 2)
            );
            studentRepo.saveAll(List.of(philip, akosua));
        };
    }
}
