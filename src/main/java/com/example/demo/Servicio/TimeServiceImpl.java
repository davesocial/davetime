package com.example.demo.Servicio;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;

/**
 * TimeServiceImpl
 */
@Service
public class TimeServiceImpl implements TimeService{

    private Calendar c;

    @Override
    public String getTime() {
        Calendar c = new GregorianCalendar();
        return c.getTime().toString();
    }

    public TimeServiceImpl(){
        c = new GregorianCalendar();
        
    }

    @Override
    public String Edad(int d, int m, int a) {
        Calendar fNacimiento = new GregorianCalendar(a, m -1, d);

        int edad = c.get(Calendar.YEAR) - fNacimiento.get(Calendar.YEAR);

        if (fNacimiento.get(Calendar.DAY_OF_YEAR) > c.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        return "La edad es " + edad;

    }

}