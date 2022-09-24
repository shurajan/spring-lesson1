package com.geekbrains.lesson1;


import com.geekbrains.lesson1.interfaces.Patient;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("patient")
@Scope("prototype")
public class AppendixPatient implements Patient {
    private int id = 0;
    private Random random = new Random();

    public AppendixPatient(){
        id = random.nextInt();
    }
    @Override
    public void speakOut() {
        System.out.println("Пациент " + id);
        System.out.println("Живот болит!");
    }
}
