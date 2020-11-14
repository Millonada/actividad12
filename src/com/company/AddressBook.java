package com.company;

import java.io.*;
import java.util.HashMap;

public class AddressBook {
    HashMap<String,String> registros = new HashMap<String, String>();


    public void load(){
        File file = null;
        FileReader fr= null;
        BufferedReader br = null;

        try {
            file = new File ("/home/angel/IdeaProjects/act12java/contactos.txt");
            fr = new FileReader (file);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)

                System.out.println(linea);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
    public static void save(HashMap registro) {
       try {
           FileWriter fw = new FileWriter("contactos.txt" , true);
           BufferedWriter bw = new BufferedWriter(fw);
           PrintWriter pw = new PrintWriter(bw);

           pw.print(registro);
           pw.close();
           System.out.println("Registro completo");
       }catch (Exception e){
           e.printStackTrace();
       }

    }


    public void list(){
        System.out.println("Contactos:");
        System.out.println(registros);
    }
    public void create(String numero,String nombre){
        registros.put(numero,nombre);
        save(registros);
        System.out.println("Se creo el registro");
    }
    public void delete(String numero){

        registros.remove(numero);
        System.out.println("Se elimino el registro con exito");
    }

}
