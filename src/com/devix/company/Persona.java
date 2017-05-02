package com.devix.company;

/**
 * Created by carlosjoseanguiano on 02/05/17.
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private int altura;

    public Persona(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", altura=" + altura +
                '}';
    }
}
