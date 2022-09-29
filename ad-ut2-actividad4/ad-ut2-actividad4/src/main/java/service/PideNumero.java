package service;

import java.util.Scanner;

public class PideNumero {


    public int pideNumero(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        return numero;
    }

}
