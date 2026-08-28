import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    
    public CelularObj[][] LlenarDatos(CelularObj[][] a, Scanner sc){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int inc = 1;
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
                CelularObj o = new CelularObj(modelo, marca, precio, cantdisp, caracteristicas);
                a[i][j] = o;
                inc++;
            }
        }
        return a;
    }

    public void MostrarMatriz(CelularObj[][]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println("Modelo: "+a[i][j].getModelo());
                System.out.println("Marca: "+a[i][j].getMarca());
                System.out.println("Precio: "+a[i][j].getPrecio());
                System.out.println("Cantidad Disponible: " + a[i][j].getCantdisp());
                System.out.println("Caracteristica: " + a[i][j].getCaracteristicas());
                System.out.println("-------------------------------");
            }
        }
    }
}
