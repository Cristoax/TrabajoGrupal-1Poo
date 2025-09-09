package Ejercicio2;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;


public class Funciones {
    Libros libros = new Libros();
    private ArrayList<Libros> listalibros;

    public Funciones(){
        listalibros = new ArrayList<>();
    }

    public void MenuLibros(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Menu Virtual Biblioteca");
            System.out.println("1) Agregar libro");
            System.out.println("2) Buscar libro");
            System.out.println("3) Eliminar libro");
            System.out.println("4) Ver todos los libros");
            System.out.println("5) Salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:AgregarLibro();
                break;
                case 2:BuscarLibro();
                break;
                case 3:EliminarLibro();
                break;
                case 4:Vertodosloslibros();

            }



        }while(opcion!=5);


    }

    public void AgregarLibro(){
        Scanner sc = new Scanner(System.in);

        Libros libros1 = new Libros();
        System.out.println("Ingrese el titulo del libro: ");
        libros1.setTitulo(sc.nextLine());
        System.out.println("Ingrese el Autor del libro: ");
        libros1.setAutor(sc.nextLine());
        System.out.println("Ingrese el Año de publicacion del libro: ");
        libros1.setAnio(sc.nextInt());
        listalibros.add(libros1);
        System.out.println("Libro agregado exitosamente ");
        System.out.println(" ");
    }

    public void BuscarLibro(){
            Scanner sc = new Scanner(System.in);

            if (listalibros.isEmpty()) {
                System.out.println("Lista vacia");
                return;
            }

            System.out.println("¿Como desea buscar?");
            System.out.println("1) Por Autor");
            System.out.println("2) Por Titulo");
            System.out.print("Elija opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine(); //Para que no de error al agregar Datos tipo int

            boolean encontrado = false;

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el Autor del libro: ");
                    String autorbuscado = sc.nextLine().trim();

                    for (Libros libro : listalibros) {
                        if (libro.getAutor().equalsIgnoreCase(autorbuscado)) { // usar getID()
                            System.out.println("Libro encontrado:");
                            System.out.println("Titulo: " + libro.getTitulo());
                            System.out.println("Autor: " + libro.getAutor());
                            System.out.println("Anio: " + libro.getAnio());
                            encontrado = true;
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el titulo del libro: ");
                    String tituloBuscado = sc.nextLine().trim();

                    for (Libros libro : listalibros) {
                        if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                            System.out.println("Libro encontrado:");
                            System.out.println("Titulo: " + libro.getTitulo());
                            System.out.println("Autor: " + libro.getAutor());
                            System.out.println("Anio: " + libro.getAnio());
                            encontrado = true;
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    return;
            }

            if (!encontrado) {
                System.out.println("No se encontro ningun libro.");
            }
        }
    public void EliminarLibro() {
        Scanner sc = new Scanner(System.in);

        if (listalibros.isEmpty()) {
            System.out.println("Lista vacía\n");
            return;
        }

        System.out.println("Ingrese el título del libro a eliminar: ");
        String tituloeliminar = sc.nextLine().trim();

        boolean eliminado = false;


        for (int i = 0; i < listalibros.size(); i++) {
            if (listalibros.get(i).getTitulo().equalsIgnoreCase(tituloeliminar)) {
                listalibros.remove(i);
                System.out.println("Libro eliminado exitosamente");
                System.out.println(" ");
                eliminado = true;
                break;
            }
        }


        if (!eliminado) {
            System.out.println("Libro no encontrado");
            System.out.println(" ");
        }
    }

    public void Vertodosloslibros() {
        Scanner sc = new Scanner(System.in);


        if (listalibros.isEmpty()) {
            System.out.println("Lista vacía");
            System.out.println(" ");
            return;
        }

        // 🔹 Ordenamos la lista por año de publicación (descendente: más nuevo primero)
        Collections.sort(listalibros, new Comparator<Libros>() {
            @Override //Sirve para indicar que el método que estás escribiendo está sobrescribiendo (overriding) un método que ya existe en una clase padre o en una interfaz.
            public int compare(Libros a, Libros b) {
                // b - a → más reciente primero
                return Integer.compare(b.getAnio(), a.getAnio());
            }
        });


        System.out.println("Lista de libros ordenados (más recientes primero):");
        for (Libros libro : listalibros) {
            System.out.println(libro.getTitulo() + " (" + libro.getAnio() + ")");
        }

        System.out.println();
    }


}




