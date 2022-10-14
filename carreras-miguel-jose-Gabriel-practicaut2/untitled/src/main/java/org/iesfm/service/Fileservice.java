package org.iesfm.service;

import org.iesfm.entity.FileEntity;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Fileservice {

    public void fileEntity() throws IOException {

        FileEntity fileEntity = new FileEntity();
        List<String> fieldList = showCsv();
       /* for (String lista : fieldList)
        {
            //System.out.println(lista);
        }*/

        for (int i = 7; i > fieldList.size(); i +=7) {
            fileEntity.setArticulo(fieldList.get(i));
            fileEntity.setTipo(fieldList.get(i+1));
            fileEntity.setFechaVenta(fieldList.get(i+2));
            fileEntity.setPrecioDeVenta(Float.parseFloat(fieldList.get(i+3)));
            fileEntity.setCosteDerivados(Float.parseFloat(fieldList.get(i+4)));
            fileEntity.setCosteProduccion(Float.parseFloat(fieldList.get(i+5)));
            fileEntity.setImpuestos(Float.parseFloat(fieldList.get(i+6)));
            fileEntity.setCoste(fileEntity.getCosteDerivados() + fileEntity.getCosteProduccion() + fileEntity.getImpuestos());
            fileEntity.setBeneficio(fileEntity.getPrecioDeVenta() - fileEntity.getCoste());
            System.out.println(fileEntity.toString());

            
        }







    }

    public List<String> showCsv() throws IOException {
        BufferedReader br;

        br = new BufferedReader(new FileReader("src/main/resources/invoice_202009.csv"));
        String line = br.readLine();
        List<String> fieldList = new ArrayList<>();
        while (line != null) {
            String[] field = line.split(";");
            for (String date : field) {
                fieldList.add(date);
            }
            line = br.readLine();
        }
        return fieldList;
    }
}
