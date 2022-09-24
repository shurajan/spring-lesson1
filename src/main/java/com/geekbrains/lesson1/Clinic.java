package com.geekbrains.lesson1;

import com.geekbrains.lesson1.interfaces.Doctor;
import com.geekbrains.lesson1.interfaces.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Clinic {
    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext(Clinic.class);

        Doctor doctor = context.getBean("surgeon", Surgeon.class);
        Patient patient = context.getBean("patient", AppendixPatient.class);
        doctor.acceptPatient();
    }
}
