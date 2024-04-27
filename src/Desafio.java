import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Strak";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("*************************************************");
        System.out.println("\nNombre Del Cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("El saldo disponible es: " + saldo);
        System.out.println("\n*************************************************");

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        //int opcion = 0; la variable esta definida al inicio
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actual es: "+saldo);
                    break;

                case 2:
                    System.out.println("Ingrese la cantidad a retirar");
                    double valorARetirar = teclado.nextDouble();
                    if(saldo<valorARetirar){
                        System.out.println("El saldo es insuficiente");
                    }else {
                            saldo = saldo - valorARetirar;
                    }
                    System.out.println("Saldo actualizado es: "+saldo);
                    break;

                case 3:
                    System.out.println("Ingrese la cantidad a Despositar");
                    double ValorADespositar = teclado.nextDouble();
                    //saldo = saldo + ValorADespositar; "lo mismo de abajo"
                    saldo += ValorADespositar;
                    System.out.println("Saldo actualizado es: "+saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del Programa, gracias por utlizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion No Valida");
            }
            
        }
    }
}