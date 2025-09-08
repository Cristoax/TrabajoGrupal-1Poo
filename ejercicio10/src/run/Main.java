package run;

import models.Cadena;

public class Main {
    public static void main(String[] args) {

        Cadena c = new Cadena("Ana");

        c.convertirMayuscula();
        c.convertirMinuscula();
        c.invertirCadena();
        c.procesarPalindromo();
        c.contarVocalesConsonantes();
    }
}
