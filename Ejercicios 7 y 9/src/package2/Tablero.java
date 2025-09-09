package package2;

public class Tablero {
    private char[][] tablero = new char[3][3];

    public Tablero() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                tablero[i][j] = ' ';
    }

    public void mostrar() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);
            if (i < 2) System.out.println("---+---+---");
        }
    }

    public boolean colocar(int fila, int col, char ficha) {
        if (tablero[fila][col] == ' ') {
            tablero[fila][col] = ficha;
            return true;
        }
        return false;
    }

    public char ganador() {

        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != ' ' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) return tablero[i][0];
            if (tablero[0][i] != ' ' && tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) return tablero[0][i];
        }

        if (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) return tablero[0][0];
        if (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) return tablero[0][2];
        return ' ';
    }

    public boolean lleno() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tablero[i][j] == ' ') return false;
        return true;
    }
}
}
