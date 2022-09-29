package service;

import java.util.Scanner;

public class PidePosicion {

   public int pidePosicion(){

       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce una posicion");
       int pos = sc.nextInt();
       return pos;
   }
}
