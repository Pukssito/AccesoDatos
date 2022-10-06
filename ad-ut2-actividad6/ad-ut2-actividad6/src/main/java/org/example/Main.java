package org.example;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public final static String path = "/home/gabriel/clase/git/accesoDatos/ad-ut2-actividad6/ad-ut2-actividad6/Excel de superHeroes.xlsx";

    /**
     * Método que crea un libro de excel
     * @throws FileNotFoundException
     */
    public static void crearExcel() throws FileNotFoundException {


    Workbook libro = new XSSFWorkbook();

    Sheet hoja = libro.createSheet("Hoja 1");

    Row primeraFila = hoja.createRow(0);

    Cell primeraCelda = primeraFila.createCell(0);
    primeraCelda.setCellValue("Super Heroes");

    File directorioActual = new File(path);
    FileOutputStream fileOut = new FileOutputStream(directorioActual);
    try {
        libro.write(fileOut);
        libro.close();
        System.out.println("Excel creado correctamente");
    } catch (IOException e) {
        System.out.println("Error al crear el excel");
        throw new RuntimeException(e);
    }


}



    public static void main(String[] args) {


        try {
            crearExcel();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}