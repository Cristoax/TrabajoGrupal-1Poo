package run;

import models.Inventario;
import models.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        int numProductos = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el numero de productos a agregar: ");
        numProductos = input.nextInt();

        for(int i = 0; i < numProductos; i++) {
            System.out.println("Producto #" + (i + 1));
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = input.next();
            System.out.print("Ingrese el codigo del producto: ");
            String codigo = input.next();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = input.nextInt();

            inventario.agregarProducto(new Producto(nombre, codigo, cantidad));
        }

//        Producto producto = new Producto("Apple", "1", 3);
//        inventario.agregarProducto(producto);
        inventario.buscarProducto("1");

        inventario.mostrarProductosStockBajo();

    }
}
