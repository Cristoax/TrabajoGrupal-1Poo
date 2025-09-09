package Ejercicio1;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(){}

    public Estudiante (String nombre, int edad, double nota){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(){
        this.edad = edad;
    }
    public double getNota(){
        return nota;
    }
    public void setNota(){
        this.nota = nota;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nNota: " + String.format("%.2f", nota) + "\n";
    }
}
