package org.example;

import dao.DaoImpl;
import service.PideNumero;
import service.PidePosicion;

import java.io.File;
import java.io.IOException;

public class Actividad5 {
    private static final String path = "/home/gabriel/clase/git/accesoDatos/actividad4ConString/ad-ut2-actividad4/src/enteros.dat";

    public static void main(String[] args) {



        File fichero = new File(path);
        DaoImpl dao = new DaoImpl();

        try {
            dao.mostrarFichero();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
