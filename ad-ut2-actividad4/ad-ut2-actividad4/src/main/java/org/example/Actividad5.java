package org.example;

import dao.DaoImpl;
import service.PideNumero;
import service.PidePosicion;

import java.io.File;
import java.io.IOException;

public class Actividad5 {
    private static final String path = "/home/gabriel/clase/git/accesoDatos/ad-ut2-actividad4/ad-ut2-actividad4/src/enteros.dat";

    public static void main(String[] args) {

        PideNumero numero = new PideNumero();
        PidePosicion pos = new PidePosicion();
        File fichero = new File(path);
        DaoImpl dao = new DaoImpl();

        try {
            dao.mostrarFichero(fichero);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            dao.modificaFichero(fichero, numero.pideNumero(), pos.pidePosicion());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            dao.mostrarFichero(fichero);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
