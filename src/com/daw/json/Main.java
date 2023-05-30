package com.daw.json;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 Utilización de la libreria para parseo de JSON
 https://github.com/google/gson
 Volcamos a un fichero los datos
*/
public class Main {

    public static void main(String[] args) throws IOException {
        //objeto para trabajar con el parseo de json
        Gson gson = new Gson();
        //Cadena json
        String json_original;

        //Creamos un ArrayList de JugadorBaloncesto
        ArrayList<JugadorBaloncesto> jugadores = new ArrayList<>();

        //Creamos un ArrayList de logros
        ArrayList<String> logros1 = new ArrayList<>();
        logros1.add("tres copas de europa");
        logros1.add("una copa intercontinental");
        logros1.add("Campeón del mundo con la Selección Española");

        //Creamos primer jugador y lo añadimos a la lista jugadores
        JugadorBaloncesto jugador1 = new JugadorBaloncesto("Rudy Fernandez", 38, "Real Madrid",logros1);
        jugadores.add(jugador1);

        //Creamos el segundo jugador y lo añadimos a la lista
        ArrayList<String> logros2 = new ArrayList<>();
        logros2.add("tres copas de europa");
        logros2.add("Campeón del mundo con la Selección Española");
        logros2.add("7 títulos ACB");
        JugadorBaloncesto jugador2 = new JugadorBaloncesto("Sergio Llull", 35, "Real Madrid", logros2);
        jugadores.add(jugador2);

        //Lo pasamos a json
        json_original = gson.toJson(jugadores);
        System.out.println(json_original);

        //Creamos un fichero y guardamos el JSON
        FileWriter file = new FileWriter("output.json");
        file.write(json_original);
        file.close();
    }
}