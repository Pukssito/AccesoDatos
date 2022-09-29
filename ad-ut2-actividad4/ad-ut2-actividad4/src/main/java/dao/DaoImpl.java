package dao;

import entity.Path;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DaoImpl implements DAO {


    @Override
    public void mostrarFichero() throws IOException {
        Path path = new Path();

        RandomAccessFile raf = new RandomAccessFile(path.ruta(), "r");
        raf.read();

    }

    @Override
    public int escribeEntero(int num) throws FileNotFoundException {
        Path path = new Path();
        RandomAccessFile raf = new RandomAccessFile(path.ruta(), "rw");
        try {
            raf.writeInt(num);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return num;
    }

}





