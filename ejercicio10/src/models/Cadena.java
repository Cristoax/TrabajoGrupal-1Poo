package models;

public class Cadena {
    private String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    public void convertirMayuscula() {
        System.out.println("Cadena en mayusculas: " + cadena.toUpperCase());
    }

    public void convertirMinuscula() {
        System.out.println("Cadena en minusculas: " + cadena.toLowerCase());
    }

    public void invertirCadena() {
        String cadenaInvertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    public boolean esPalindromo(String palabra) {
        int i = 0, j = palabra.length() - 1;
        while (i < j) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public void procesarPalindromo() {
        int contador = 0;
        String[] palabras = cadena.toLowerCase().split(" ");

        for (String palabra : palabras) {
            if (esPalindromo(palabra)) {
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("No Es palindromo");
        } else if (contador == 1) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("Tiene " + contador + " palabras palindromos");
        }
    }

    public void contarVocalesConsonantes() {
        int vocales = 0;
        int consonantes = 0;
        char letra;

        for (int i = 0; i < cadena.length(); i++) {
            letra = Character.toLowerCase(cadena.charAt(i));
            if (esVocal(letra)) {
                vocales++;
            }
            else if (Character.isLetter(letra)) {
                consonantes++;
            }
        }
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }

    public boolean esVocal(char vocal) {
        return "aeiou".indexOf(vocal) != -1; // -1 si no esta en la cadena "aeiou"
    }
}
