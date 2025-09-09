package package1;

public class Main {

    public static void main(String[] args) {
        double[][] notas = {
                {85, 90, 78},
                {92, 88, 95},
                {70, 75, 80},
                {88, 85, 84}
        };

        Curso curso = new Curso("Programación", notas);

   
        curso.setNombre("POO en Java");

        System.out.println("Nombre del curso: " + curso.getNombre());

        curso.mostrarResultados();
    }
}
