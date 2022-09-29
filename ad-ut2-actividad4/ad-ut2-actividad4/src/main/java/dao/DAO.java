package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public interface DAO {

    void mostrarFichero(File fichero) throws IOException;

    void escribeEntero(File fichero , int num) throws IOException;

    void modificaFichero(File fichero, int num, int pos) throws IOException;
}
