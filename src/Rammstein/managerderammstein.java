package Rammstein;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class managerderammstein {
    private ArrayList<Miembrobanda> banda;

    public managerderammstein () {
        banda = new ArrayList<>();
    }

    public void cargarDesdeCSV(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String rol = datos[1];
                
                if (rol.equals("Vocalista")) {
                    banda.add(new vocalista(nombre, Integer.parseInt(datos[2])));
                } else if (rol.equals("Guitarrista")) {
                    banda.add(new Guitarrista(nombre, datos[2]));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public ArrayList<Miembrobanda> getBanda() {
        return banda;
    }
}


