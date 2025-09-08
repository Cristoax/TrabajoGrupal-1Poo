package models;


public class Inventario {
    private Producto[] productos;
    int index;

    public Inventario() {
        this.productos = new Producto[10];
        this.index = 0;
    }

    public void agregarProducto(Producto prod) {
        if (index < productos.length) {
            productos[index] = prod;
            index++;
            System.out.println("Producto agregado...");
        } else {
            System.out.println("Inventario lleno");
        }
    }

    public void buscarProducto(String codigo) {
        for (int i = 0; i < index; i++) {
            if (productos[i].getCodigo().equals(codigo)) {
                System.out.println("El producto encontrado es: " + productos[i]);
                return;
            }
        }
        System.out.println("Producto no encontrado...");
    }

    public void mostrarProductosStockBajo() {
        System.out.println("Productos stock bajo:");
        for (int i = 0; i < index; i++) {
            if(productos[i].getCantidad() < 5) {
                System.out.println(productos[i]);
            }
        }
    }
}
