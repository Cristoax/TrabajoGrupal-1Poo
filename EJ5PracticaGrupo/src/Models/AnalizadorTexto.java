package Models;

import java.util.Locale;

/**
 * La clase AnalizadorTexto permite realizar operaciones básicas sobre un texto,
 * como contar palabras, buscar ocurrencias de una palabra clave, y reemplazar palabras específicas.
 *
 * Todas las entradas se normalizan a minúsculas para facilitar comparaciones.
 */
public class AnalizadorTexto {

    /** Texto principal sobre el que se realizarán los análisis. */
    private String texto;

    /** Palabra clave que se busca dentro del texto. */
    private String Keyword;

    /** Palabra que se desea insertar como reemplazo. */
    private String palabra;

    /** Palabra que se desea reemplazar dentro del texto. */
    private String palabraReemplazada;

    /** Constructor por defecto.  */
    public AnalizadorTexto() {}

    /**
     * @return el texto actual almacenado.
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Establece el texto a analizar, convirtiéndolo a minúsculas.
     * @param texto el texto completo a asignar.
     */
    public void setTexto(String texto) {
        this.texto = texto.toLowerCase(Locale.ROOT);
    }

    /**
     * @return la palabra clave que se busca en el texto.
     */
    public String getKeyword() {
        return Keyword;
    }

    /**
     * Establece la palabra clave a buscar, en minúsculas.
     * @param keyword palabra clave a asignar.
     */
    public void setKeyword(String keyword) {
        Keyword = keyword.toLowerCase(Locale.ROOT);
    }

    /**
     * @return la palabra que se usará como reemplazo.
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * Establece la palabra que se usará como reemplazo, en minúsculas.
     * @param palabra nueva palabra a insertar.
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra.toLowerCase(Locale.ROOT);
    }

    /**
     * @return la palabra que se desea reemplazar en el texto.
     */
    public String getPalabraReemplazada() {
        return palabraReemplazada;
    }

    /**
     * Establece la palabra que se desea reemplazar, en minúsculas.
     * @param palabraReemplazada palabra original que será sustituida.
     */
    public void setPalabraReemplazada(String palabraReemplazada) {
        this.palabraReemplazada = palabraReemplazada.toLowerCase(Locale.ROOT);
    }

    /**
     * Cuenta cuántas palabras hay en el texto y cuántas veces aparece la palabra clave.
     * Imprime los resultados en consola.
     */
    public void Contar() {
        System.out.println("Cantidad de palabras en el texto: " + texto.split(" ").length);
        String[] compare = texto.split(" ");
        int i = 0;
        int acum = 0;
        while (i < compare.length) {
            if (compare[i].equals(Keyword)) {
                acum++;
            }
            i++;
        }
        System.out.println("Palabra " + Keyword + " encontrada: " + acum + " veces");
    }

    /**
     * Reemplaza todas las ocurrencias de una palabra específica por otra dentro del texto.
     * Imprime el texto original y el texto modificado.
     */
    public void reemplazarPalabras() {
        String[] compare = texto.split(" ");
        int i = 0;
        String OraReem = "";
        while (i < compare.length) {
            if (compare[i].equals(palabraReemplazada)) {
                OraReem = texto.replace(palabraReemplazada, palabra);
            }
            i++;
        }
        System.out.println("Oración inicial: " + texto);
        System.out.println("Oración con palabra reemplazada: " + OraReem);
    }
}
