package Ejercicio1;

import java.util.ArrayList;

public class GestorEstudiante {

    private ArrayList<Estudiante> lista = new ArrayList<>();

    public void agregarEstudiante(String nombre, int edad, double nota){
        lista.add(new Estudiante(nombre, edad, nota));
    }

    public void mostrarEstudiante(){
        System.out.println("\nEstudiantes con promedio superior a 8: ");
        for (Estudiante e : lista){
            if (e.getNota() > 8){
                System.out.println(e);
            }
        }
        System.out.println("\nEstudiantes con promedio menor o igual a 8: ");
        for (Estudiante e : lista){
        if (e.getNota() <= 8) {
            System.out.println(e);
        }
        }
    }

    public int cantidadEstudiantes(){
        return lista.size();
    }

}
