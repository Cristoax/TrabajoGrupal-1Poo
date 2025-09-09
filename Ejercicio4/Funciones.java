package Ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {
    Clientes clientes = new Clientes();
    private ArrayList<Clientes> listaClientes = new ArrayList<>();



    public void MenuClientes(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Menu Clientes");
            System.out.println("1. Ver Clientes");
            System.out.println("2. Buscar Clientes");
            System.out.println("3. agregar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Editar datos de cliente");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:verclientes();break;
                case 2:buscarcliente();break;
                case 3:agregarcliente();break;
                case 4:eliminarcliente();break;
                case 5:editarcliente();break;


            }

        }while(opcion!=6);

    }

    public void verclientes(){
        if(listaClientes.isEmpty()){
            System.out.println("No hay clientes registrados.");
            System.out.println(" ");
            return;
        }
        System.out.println("Lista de Clientes:");
        for(Clientes c : listaClientes){
            System.out.println("Nombre: " + c.getNombre() +
                    ", Tel: " + c.getTelefono() +
                    ", Correo: " + c.getCorreo());
        }
        System.out.println();
    }

    public void buscarcliente(){
        if(listaClientes.isEmpty()){
            System.out.println("No hay clientes registrados.");
            System.out.println(" ");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente a buscar: ");
        String nombre = sc.nextLine().trim();
        boolean encontrado = false;

        for(Clientes c : listaClientes){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Cliente encontrado: " +
                        "Nombre: " + c.getNombre() +
                        ", Tel: " + c.getTelefono() +
                        ", Correo: " + c.getCorreo());
                System.out.println(" ");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("Cliente no encontrado.");
            System.out.println(" ");
        }
    }

    public void agregarcliente(){
        Scanner sc = new Scanner(System.in);
        Clientes c = new Clientes();
        System.out.print("Ingrese nombre: ");
        c.setNombre(sc.nextLine().trim());

        // Validación del teléfono
        boolean telValido = false;
        do {
            System.out.print("Ingrese teléfono (máx 8 dígitos): ");
            String tel = sc.nextLine().trim();
            if(tel.length() <= 8 && tel.matches("\\d+")){
                c.setTelefono(tel);
                telValido = true;
            } else {
                System.out.println("Número inválido. Intente de nuevo.");
            }
        } while(!telValido);

        System.out.print("Ingrese correo: ");
        c.setCorreo(sc.nextLine().trim());

        listaClientes.add(c);
        System.out.println("Cliente agregado exitosamente.");
        System.out.println(" ");
    }

    public void eliminarcliente(){

        if(listaClientes.isEmpty()){
            System.out.println("No hay clientes registrados.");
            System.out.println(" ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente a eliminar: ");
        String nombre = sc.nextLine().trim();
        boolean eliminado = false;
        for(int i = 0; i < listaClientes.size(); i++){
            if(listaClientes.get(i).getNombre().equalsIgnoreCase(nombre)){
                listaClientes.remove(i);
                eliminado = true;
                System.out.println("Cliente eliminado exitosamente.");
                System.out.println(" ");
                break;
            }
        }
        if(!eliminado){
            System.out.println("Cliente no encontrado.");
            System.out.println(" ");
        }
    }

    public void editarcliente(){

        if(listaClientes.isEmpty()){
            System.out.println("No hay clientes registrados.");
            System.out.println(" ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente a editar: ");
        String nombre = sc.nextLine().trim();
        boolean encontrado = false;
        for(Clientes c : listaClientes){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                encontrado = true;
                System.out.print("Nuevo nombre (enter para no cambiar): ");
                String nuevoNombre = sc.nextLine().trim();
                if(!nuevoNombre.isEmpty()) c.setNombre(nuevoNombre);

                // Teléfono con validación
                boolean telValido = false;
                do {
                    System.out.print("Nuevo teléfono (máx 8 dígitos, enter para no cambiar): ");
                    String tel = sc.nextLine().trim();
                    if(tel.isEmpty()){
                        telValido = true; // no cambia
                    } else if(tel.length() <= 8 && tel.matches("\\d+")){
                        c.setTelefono(tel);
                        telValido = true;
                    } else {
                        System.out.println("Número inválido. Intente de nuevo.");
                    }
                } while(!telValido);

                System.out.print("Nuevo correo (enter para no cambiar): ");
                String correo = sc.nextLine().trim();
                if(!correo.isEmpty()) c.setCorreo(correo);

                System.out.println("Cliente actualizado exitosamente.");
                System.out.println(" ");
                break;
            }
        }
        if(!encontrado){
            System.out.println("Cliente no encontrado.");
            System.out.println(" ");
        }
    }
}


