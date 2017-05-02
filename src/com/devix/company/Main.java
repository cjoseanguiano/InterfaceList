package com.devix.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Persona> personaList = new ArrayList<Persona>();
        Random random = new Random();
        Persona persona = null;
        int sumaAltura = 0;

        for (int i = 0; i < 20; i++) {
            personaList.add(new Persona(i, "Persona" + i, random.nextInt(100) + 100));
        }
        Iterator<Persona> iterator = personaList.iterator();

        while (iterator.hasNext()) {
            persona = iterator.next();
            System.out.println(persona);
            sumaAltura += persona.getAltura();
        }
        System.out.println("Medida de altura del conjunto de Persona es: " + sumaAltura / personaList.size());
    }
}
