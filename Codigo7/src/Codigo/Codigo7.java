package Codigo;

import java.util.HashMap;//Importar libre
import java.util.Scanner;//importar libreria 

public class Codigo7 {
     public static void main(String[] args) { //colocar el main para ejecutar
    Scanner s = new Scanner(System.in);// faltaba colocar adentro de  los  parentesis el System.in

    HashMap<String, String> capitales = new HashMap<>(); //se acompleta a capitales, y se cambia el hashmap a String

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador","San Salvador"); //se acompleta con los dos Strings
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = ""; //Faltaba la r de String
    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");//faltaba el out de print
      c = s.nextLine(); // Se cambia a Line 
      
      if (!c.equals("salir")) {//faltaba la s
        if (capitales.containsValue(c)) { //se acompleta capitales
          System.out.print("La capital de " + c);//faltaba el out.
          System.out.println(" es " + capitales.get(c)); // es get para mandar
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          String ca = s.nextLine();
          capitales.put(c, ca);
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir"));//faltaba parentesís y la "h" de while
  
     s.close();//Cerramos el Scanner
}
}