package Ejercicio6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ciudad ciudad = new Ciudad();

        System.out.println("\nREGISTRO DE TEMPERATURAS (4 Semanas y sus respectivos dias)");

        for (int semana = 0; semana < 4; semana++) {
            System.out.println("\nSemana " + (semana + 1));
            for (int dia = 0; dia < 7; dia++) {
                double temp = -999;
                while (true) {
                    System.out.println("\nDia " + (dia + 1) + "- Temperatura (°C): ");
                    if (sc.hasNextDouble()) {
                        temp = sc.nextDouble();
                        if (ciudad.registroTemperatura(semana, dia, temp)) break;
                        else System.out.println("Valor fuera de rango (-50 y 60). Por favor vuelve a intentarlo");
                    } else {
                        System.out.println("Entrada invalida, debe digitar unicamente numeros.");
                        sc.nextLine();
                    }
                }
            }
        }
        ciudad.mostrarMatriz();

        System.out.println ("\nPromedios semanales: ");
        for (int semana = 0; semana < 4; semana++) {
            double promedio = ciudad.promedioSemanal(semana);
            System.out.println ("Semana " + (semana + 1) + String.format("%.2f", promedio) + "°C");
        }
        System.out.println("\nTemperatura maxima del mes: " + String.format("%.2f", ciudad.temperaturaMaximaMes()) + "°C");
        System.out.println(ciudad.diaMasFrio());
        sc.close();
    }
}