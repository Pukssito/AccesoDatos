package org.iesfm.app;

import org.iesfm.service.Fileservice;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;


public class Actividad1 {

    public static void main(String[] args){


        List<String> lista = new ArrayList<>();
        Fileservice fl = new Fileservice();
        try {
            fl.fileEntity();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}





