package app;

import service.ClientService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ClientService clientService = new ClientService
                ();

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Introduce DNI: ");
            String dni = sc.nextLine();
            System.out.println("Introduce contraseña: ");
            String password = sc.nextLine();
            clientService.login(dni, password);


        }
    }
}