package dao;

import java.io.*;

public class DaoImpl implements DAO {


    @Override
    public void mostrarFichero(File fichero) throws IOException {

        RandomAccessFile raf = new RandomAccessFile(fichero, "r");
        if (fichero.isFile())
        {
           try{
               raf.seek(0);
                while (true)
                {
                     System.out.println(raf.readInt());
                }
           }catch (EOFException e){
           }
        }else System.out.println("No es un fichero");

    }

    @Override
    public void escribeEntero(File fichero, int num) throws IOException {

            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            if (fichero.isFile())
            {
                try {
                    raf.seek(raf.length());
                    raf.writeInt(num);
                } catch (IOException e) {
                    throw new FileNotFoundException();
                }
            }else System.out.println("No es un fichero");

    }

    @Override
    public void modificaFichero(File fichero, int num, int pos) throws IOException {

            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            if (fichero.isFile())
            {
                raf.seek(pos*4);
                raf.writeInt(num);
            }else System.out.println("No es un fichero");

    }


}





