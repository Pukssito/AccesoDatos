package org.example;

import dao.DaoImpl;
import entity.Path;
import service.PideNumero;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Path path = new Path();
        PideNumero pideNumero = new PideNumero();
        int numero = pideNumero.pideNumero();
        File file = new File(path.ruta());
        DaoImpl dao = new DaoImpl();

        try {
            dao.escribeEntero(numero);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
    }
}