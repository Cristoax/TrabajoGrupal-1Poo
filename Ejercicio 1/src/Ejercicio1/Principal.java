package Ejercicio1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorEstudiante gestor = new GestorEstudiante();

        System.out.println("\nCuantos estudiantes desea agregar a la lista?:");
        int cantidad =  sc.nextInt();
        sc.nextLine();

        for ( int i = 0; i < cantidad; i++) {
            System.out.println("\n Estudiante # " + ( i + 1));

            System.out.print("Nombre del estudiante: ");
            String nombre = sc.nextLine();

            System.out.print("Edad del estudiante: ");
            int edad = sc.nextInt();
            sc.nextLine();

            double nota = -1;
            while (nota < 0 || nota > 10) {
                System.out.print("Nota (0.00 a 10.00.): ");
                if (sc.hasNextDouble()) {
                    nota = sc.nextDouble();
                    sc.nextLine();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota invalida. Debe ubicarse entre el range de 0.00 y 10.00.");
                    }
                } else {
                    System.out.println("Nota invalida.");
                    sc.nextLine();
                }
            }
            gestor.agregarEstudiante(nombre, edad, nota);
        }
        gestor.mostrarEstudiante();
        sc.close();
    }
}
