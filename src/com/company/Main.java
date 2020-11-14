package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner read = new Scanner(System.in);
        int opcion;
        String numero,nombre;
        boolean salir=false;
        AddressBook agenda = new AddressBook();
        do{

            System.out.println("Agenda");
            System.out.println("Seleccione una opcion");
            System.out.println("1-Listar los nuevos registros");
            System.out.println("2-Listar agenda");
            System.out.println("3-Insertar nuevo registro ");
            System.out.println("4-Eliminar registro ");
            System.out.println("5-Salir ");

            opcion = read.nextInt();

            switch (opcion){
                case 1:
                    //Listar agenda
                    agenda.list();
                break;
                case 2:
                    agenda.load();
                    break;
                case 3:
                    // crear
                    System.out.println("Ingresa el numero telefonico:");

                    numero=read.next();
                    System.out.println("Ingresa el nombre");
                    nombre= read.next();

                    agenda.create(numero,nombre);
                    break;
                case 4:
                    //eliminar
                    System.out.println("Ingresa numero telefonico a eliminar");
                    numero= read.next();
                    agenda.delete(numero);
                    break;
                case 5:
                    // salir
                    salir = true;
                    break;
            }

        }while (salir != true);


    }

}
