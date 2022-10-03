package service;

import java.util.Scanner;

public class PideNumero {


    public int pideNumero(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        return num;
    }

}
