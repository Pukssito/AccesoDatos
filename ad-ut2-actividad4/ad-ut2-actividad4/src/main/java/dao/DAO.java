package dao;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DAO {

    public void mostrarFichero() throws IOException;

    int escribeEntero(int num) throws FileNotFoundException;
}
