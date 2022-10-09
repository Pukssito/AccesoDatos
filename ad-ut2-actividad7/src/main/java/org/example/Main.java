package org.example;


import java.io.*;
import java.nio.file.Files;
import java.util.Random;


public class Main {



    public static void main(String[] args) {
        File archivo = new File(args[0]);
        File[] pathnames = archivo.listFiles();
        FileWriter fichero = null;
        PrintWriter pw;

        try {
            fichero = new FileWriter(args[0] + "/Ejercicio7.txt");
            pw = new PrintWriter(fichero);
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
            fichero.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}