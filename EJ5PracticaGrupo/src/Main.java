import Models.AnalizadorTexto;

public class Main {
    public static void main(String[] args) {
        AnalizadorTexto analizador = new AnalizadorTexto();
        analizador.setTexto("Habia una vez una vaca muy bonita");
        analizador.setKeyword("VACA");
        analizador.setPalabra("fea");
        analizador.setPalabraReemplazada("bonita");
        analizador.Contar();
        analizador.reemplazarPalabras();
    }
}
