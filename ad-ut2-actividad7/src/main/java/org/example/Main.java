package org.example;


import java.io.*;
import java.nio.file.Files;
import java.util.Random;
import java.util.regex.Pattern;


public class Main {


    public static void main(String[] args) {
        File archivo = new File(args[0]);
        File file = new File(args[0] + "/ficheros.txt");
        File directory = new File(args[0] + "/directorios.txt");
        File[] pathnames = archivo.listFiles();
        FileWriter fileW = null;
        PrintWriter pw;

        try {
            fileW = new FileWriter(args[0] + "/Ejercicio7.txt");
            pw = new PrintWriter(fileW);
            for (File pathname : pathnames) {
                pw.write(pathname.getName());
                pw.write(";");
                if (pathname.isDirectory()) {
                    pw.write("D");
                } else if (pathname.isFile()) {
                    pw.write("F");
                }
                pw.write(";[");
                if (pathname.canRead()) {
                    pw.write("R/");
                }
                if (pathname.canWrite()) {
                    pw.write("W");
                }
                if (pathname.canExecute()) {
                    pw.write("/X");
                }
                pw.write("];");
                long bytes = pathname.length();
                String str = Long.toString(bytes);
                pw.write(str);

                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File ficheroEjercicio7 = new File(args[1]);
        FileReader fr;
        try {
            fr = new FileReader(ficheroEjercicio7);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(fr);
        String linea;
        int count = 0;
        while (true) {
            try {
                if (!((linea = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(linea);
            if (linea.contains(";F;")) {
                try {
                    pw = new PrintWriter(file);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }


            }
        }
        System.out.println(count + " Ficheros");
    }
}