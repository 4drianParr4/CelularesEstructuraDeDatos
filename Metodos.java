import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    
    public CelularObj[] LlenarDatos(CelularObj[] a, Scanner sc){
        int inc = 1;
        for (int i = 0; i < a.length; i++) {
                System.out.println(" ------Celular " + inc++ + "------");
                System.out.println("Ingresa el modelo: ");
                String modelo = sc.nextLine();
                System.out.println("Ingresa la marca del celular: ");
                String marca = sc.nextLine();
                System.out.println("Ingresa el precio del celular: ");
                Double precio = sc.nextDouble();
                System.out.println("Ingresa la cantidad disponible: ");
                int cantdisp = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingresa la caracteristica");
                String caracteristicas = sc.nextLine();
                System.out.println();
                double descuento = 0.0;
                int descaplicado = 0;
                CelularObj o = new CelularObj(modelo, marca, precio, cantdisp, caracteristicas, descuento, descaplicado);
                a[i] = o;
        }
        return a;
    }

    public void MostrarMatriz(CelularObj[]a){
        for (int i = 0; i < a.length; i++) {
                System.out.println("Modelo: "+a[i].getModelo());
                System.out.println("Marca: "+a[i].getMarca());
                System.out.println("Precio: "+a[i].getPrecio());
                System.out.println("Cantidad Disponible: " + a[i].getCantdisp());
                System.out.println("Caracteristica: " + a[i].getCaracteristicas());
                System.out.println("-------------------------------");
        }
    }

    public CelularObj[] CelularesPromocion (CelularObj[] a, Scanner sc){
        System.out.println("ingresa el modelo del celular para aplicar el descuento");
        String modelo = sc.nextLine();
        System.out.println("Ingrese el descuento a aplicar");
        double descuento = sc.nextDouble();
        sc.nextLine();
        boolean modeloencontrado = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i].getModelo().equalsIgnoreCase(modelo)) {
                double precio = a[i].getPrecio();
                double nuevoprecio = precio - (precio * (descuento / 100));
                a[i].setPrecio(nuevoprecio);
                a[i].setDescuento(descuento);
                a[i].setDescaplicado(1);
                modeloencontrado = true;
            }
        }
        if (!modeloencontrado) {
            System.out.println("Modelo no encontrado");
        }
        return a;
    }

    public void MostrarCelularesDescuento(CelularObj[]a, Scanner sc){
        boolean sihaycelulares = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].getDescaplicado() == 1) {
                System.out.println("Marca: " + a[i].getMarca());
                System.out.println("Modelo: " + a[i].getModelo());
                System.out.println("Precio: " + a[i].getPrecio());
                System.out.println("Cantidad Disponible: " + a[i].getCantdisp());
                System.out.println("Caracteristica: " + a[i].getCaracteristicas());
                System.out.println("Descuento Aplicado: " + a[i].getDescuento() + "%");
                System.out.println("-----------------------");
                sihaycelulares = true;
            }   
        }
        if (!sihaycelulares) {
            System.out.println("No hay celulares con descuento");
        }
    }
}
