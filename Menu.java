import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        boolean continuar = true;
        System.out.println("Ingrese la dimension de la matriz");
        int n = sc.nextInt();
        CelularObj[][] o = new CelularObj[n][n];

        while (continuar) {
            System.out.println("Bienvenidos a Celphones AA");
            System.out.println("¿Que desea realizar?");
            System.out.println("1) Registrar celular");
            System.out.println("2) Mostrar celulares");
            System.out.println("3) Aplicar descuento");
            System.out.println("4) Mostrar celulares con descuento");
            System.out.println("5) Salir");
            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    m.LlenarDatos(o, sc);
                    break;

                case 2:
                    m.MostrarMatriz(o);
                    break;

                case 3:
                    m.LlenarDatos(o, sc);
                    break;

                case 4:
                    m.LlenarDatos(o, sc);
                    break;

                case 5:
                    System.out.println("Vuelva Pronto!!");
                    break;
            
                default:
                    break;
            }
        }

    }
}
