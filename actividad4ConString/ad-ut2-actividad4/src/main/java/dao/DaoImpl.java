package dao;

import java.io.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;

public class DaoImpl implements DAO {

    private static final String path = "/home/gabriel/clase/git/accesoDatos/actividad4ConString/ad-ut2-actividad4/src/enteros.dat";


    @Override
    public void mostrarFichero() throws IOException {
        String cadena = new String(Files.readAllBytes(Paths.get(path)));

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena);
        }

    }}













