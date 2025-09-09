package package2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jugador j1 = new Jugador("Jugador 1", 'X');
        Jugador j2 = new Jugador("Jugador 2", 'O');
        Tablero t = new Tablero();
        Jugador actual = j1;

        while (true) {
            t.mostrar();
            System.out.println(actual.getNombre() + " (" + actual.getFicha() + ") elige fila y columna (0-2): ");
            int f = sc.nextInt();
            int c = sc.nextInt();

            if (!t.colocar(f, c, actual.getFicha())) {
                System.out.println("Casilla ocupada, intenta otra vez.");
                continue;
            }

            char g = t.ganador();
            if (g != ' ') {
                t.mostrar();
                System.out.println("Ganó " + actual.getNombre() + "!");
                break;
            }
            if (t.lleno()) {
                t.mostrar();
                System.out.println("Empate");
                break;
            }
            actual = (actual == j1) ? j2 : j1;
        }
        sc.close();
    }
}

