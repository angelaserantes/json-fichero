package com.daw.json;
import java.util.ArrayList;

public class JugadorBaloncesto {

    private String nombre;
    private int edad;
    private String equipo;
    private ArrayList<String> logros;

    public JugadorBaloncesto(String nombre, int edad, String equipo, ArrayList<String> logros) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.logros = logros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public ArrayList<String> getLogros() {
        return logros;
    }

    public void setLogros(ArrayList<String> logros) {
        this.logros = logros;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Jugador de baloncesto: " +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", equipo='" + equipo + '\'' +
                ", logros=");

        for (String logro : logros) {
            info.append(" ").append(logro);
        }

        return info.toString();
    }
}