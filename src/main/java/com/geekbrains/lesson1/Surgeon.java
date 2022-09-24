package com.geekbrains.lesson1;

import com.geekbrains.lesson1.interfaces.Doctor;
import com.geekbrains.lesson1.interfaces.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("surgeon")
public class Surgeon implements Doctor {

    private Patient patient;

    @Override
    public void acceptPatient() {
        patient.speakOut();
    }

    @Autowired
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
