package test;

import dominio.AnimalCarnivoro;
import dominio.AnimalHerbivoro;
import dominio.Planta;
import java.util.Scanner;

public class TestSerVivo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AnimalCarnivoro AC = new AnimalCarnivoro();
        AnimalHerbivoro AH = new AnimalHerbivoro();
        Planta P = new Planta();
        String enter;
        int opc = 0;
        boolean salir = false;
        while (!salir) {

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("----------------- MENU -----------------");
            System.out.println("SI QUIERES SABER DE QUE SE ALIEMNTA ");
            System.out.println("1.-UN SER VIVO\n2.-UNA PLANTA\n3.-UN ANIMAL \n4.-UN ANIMAL CARNIVORO\n5.-UN ANIMAL HERBIVORO");
            System.out.println("\nSI QUIERES SALIR DEL MENU\n6.-SALIR");
            opc = entrada.nextInt();
            if (opc == 1) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("NO SE PUEDE DEFINIR LA ALIMETACION DE UN SER VIVO");
                System.out.println("ESTE ES METODO ABSTRACTO");
                System.out.println("\n\nVolver al menu << C >>");
                enter = entrada.next();
            }
            if (opc == 2) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                P.alimenta();
                System.out.println("\n\nVolver al menu << C >>");
                enter = entrada.next();

            }
            if (opc == 3) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("NO SE PUEDE DEFINIR LA ALIMETACION DE UN ANIMAL");
                System.out.println("ESTE ES METODO ABSTRACTO");
                System.out.println("\n\nVolver al menu << C >>");
                enter = entrada.next();
            }
            if (opc == 4) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                AC.alimenta();
                System.out.println("\n\nVolver al menu << C >>");
                enter = entrada.next();
            }
            if (opc == 5) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                AH.alimenta();
                System.out.println("\n\nVolver al menu << C >>");
                enter = entrada.next();
            }
            if (opc == 6) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                salir = true;
                System.out.println("---------- FIN DEL PROGRAMA ----------");
            }
        }

    }
}
