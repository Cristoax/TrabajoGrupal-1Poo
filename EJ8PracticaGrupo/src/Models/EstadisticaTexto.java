package Models;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * La clase EstadisticaTexto permite realizar análisis
 * sobre un conjunto de palabras almacenadas en una lista.
 * Funcionalidades:
 * - Contar el número total de palabras.
 * - Identificar palabras únicas (no repetidas).
 * - Determinar la palabra más larga y la más corta.
 * Esta clase forma parte del ejercicio 8 de la práctica de POO en Java con arreglos.
 */
public class EstadisticaTexto {

    /** Lista principal de palabras a analizar. */
    private ArrayList<String> texto = new ArrayList<>(Arrays.asList("Urna", "Arbol", "Arbol", "Mueble", "Computadora"));

    /** Lista auxiliar para comparación  */
    private ArrayList<String> comp = new ArrayList<>(Arrays.asList(""));

    /** Constructor por defecto.  */
    public EstadisticaTexto() {
    }

    /** @return la lista de palabras almacenadas en 'texto'. */
    public ArrayList<String> getTexto() {
        return texto;
    }

    /**
     * Establece una nueva lista de palabras.
     * @param texto lista de palabras a asignar.
     */
    public void setTexto(ArrayList<String> texto) {
        this.texto = texto;
    }

    /** @return la lista auxiliar 'comp'. */
    public ArrayList<String> getComp() {
        return comp;
    }

    /**
     * Establece una nueva lista auxiliar.
     * @param comp lista auxiliar a asignar.
     */
    public void setComp(ArrayList<String> comp) {
        this.comp = comp;
    }

    /**
     * Muestra la cantidad total de palabras en la lista 'texto'.*/

    public void Mostrar() {
        ArrayList<String> PalabrasNoRep = new ArrayList<>();
        comp.set(0, texto.get(0));
        System.out.println("Hay: " + texto.size() + " Palabras");
    }

    /**
     * Determina e imprime la palabra más larga y la más corta en la lista 'texto'.
     */
    public void LargaCorta() {
        String La = texto.get(0); // Palabra más larga
        String Ca = texto.get(0); // Palabra más corta

        for (int i = 0; i < texto.size(); i++) {
            if (texto.get(i).length() > La.length()) {
                La = texto.get(i);
            }
            if (texto.get(i).length() < Ca.length()) {
                Ca = texto.get(i);
            }
        }

        System.out.println("Palabra más larga: " + La);
        System.out.println("Palabra más corta: " + Ca);
    }

    /**
     * Identifica y muestra las palabras únicas (que aparecen solo una vez)
     * dentro de la lista 'texto'.
     */
    public void mostrarUnicas() {
        ArrayList<String> unicas = new ArrayList<>();

        for (int i = 0; i < texto.size(); i++) {
            String palabra = texto.get(i);
            int contador = 0;

            for (int j = 0; j < texto.size(); j++) {
                if (palabra.equals(texto.get(j))) {
                    contador++;
                }
            }

            if (contador == 1) {
                unicas.add(palabra);
            }
        }

        System.out.println("Palabras únicas: " + unicas);
    }
}
