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

        //Creamos un ArrayList de logros
        ArrayList<String> logros = new ArrayList<>();
        logros.add("tres copas de europa");
        logros.add("una copa intercontinental");
        logros.add("Campeón del mundo con la Selección Español");

        //Creamos nuestro objeto inicial
        JugadorBaloncesto jugador_original = new JugadorBaloncesto("Rudy Fernandez", 38, "Real Madrid",logros);
        System.out.println(jugador_original);

        //Lo pasamos a json
        json_original = gson.toJson(jugador_original, JugadorBaloncesto.class);
        System.out.println(json_original);

        //Creamos un fichero y guardamos el JSON
        FileWriter file = new FileWriter("output.json");
        file.write(json_original);
        file.close();
    }
}