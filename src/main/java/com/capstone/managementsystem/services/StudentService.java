package com.capstone.managementsystem.services;

import com.capstone.managementsystem.models.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student("Philip",
                        "Owusu-Afriyie",
                        "kwabena",
                        "philip@gmail.com",
                        "password",
                        LocalDate.of(1997, Month.SEPTEMBER, 16)
                ),
                new Student("Philip",
                        "Owusu-Afriyie",
                        "kwabena",
                        "philip@gmail.com",
                        "password",
                        LocalDate.of(1997, Month.SEPTEMBER, 16)
                ),
                new Student("Philip",
                        "Owusu-Afriyie",
                        "kwabena",
                        "philip@gmail.com",
                        "password",
                        LocalDate.of(1997, Month.SEPTEMBER, 16)
                )
        );
    }
}
