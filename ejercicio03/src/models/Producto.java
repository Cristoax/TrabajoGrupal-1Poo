package models;

public class Producto {
    private String nombre;
    private String codigo;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto(String nombre, String codigo, int cantidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Codigo: " + codigo + ", Stock: " + cantidad;
    }
}
