package package1;

public class Curso {
    private String nombre;
    private double[][] notas;


    public Curso(String nombre, double[][] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }


    public double[] promedioPorEstudiante() {
        double[] promedios = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            promedios[i] = suma / notas[i].length;
        }
        return promedios;
    }


    public double[] promedioPorEvaluacion() {
        int evaluaciones = notas[0].length;
        double[] promedios = new double[evaluaciones];
        for (int j = 0; j < evaluaciones; j++) {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            promedios[j] = suma / notas.length;
        }
        return promedios;
    }


    public int mejorEstudiante() {
        double[] promedios = promedioPorEstudiante();
        int mejor = 0;
        for (int i = 1; i < promedios.length; i++) {
            if (promedios[i] > promedios[mejor]) {
                mejor = i;
            }
        }
        return mejor;
    }


    public void mostrarResultados() {
        System.out.println("Curso: " + nombre);

        double[] promEstudiantes = promedioPorEstudiante();
        for (int i = 0; i < promEstudiantes.length; i++) {
            System.out.println("Promedio del Estudiante " + (i + 1) + ": " + promEstudiantes[i]);
        }

        double[] promEvaluaciones = promedioPorEvaluacion();
        for (int j = 0; j < promEvaluaciones.length; j++) {
            System.out.println("Promedio de la Evaluación " + (j + 1) + ": " + promEvaluaciones[j]);
        }

        int mejor = mejorEstudiante();
        System.out.println("El mejor estudiante es el #" + (mejor + 1) + " con promedio " + promEstudiantes[mejor]);
    }
}

