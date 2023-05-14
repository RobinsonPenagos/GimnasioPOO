import java.util.Scanner;

public class Programa {
    private static final double VALOR_MES = 50000;
    private static final double DESCUENTO_4_6_MESES = 0.1;
    private static final double DESCUENTO_7_11_MESES = 0.2;
    private static final double DESCUENTO_12_MESES_EN_ADELANTE = 0.3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bienvenida
        System.out.println("BIENVENIDO AL GYM SPARTACO");
        System.out.println("***************************");
        System.out.println("Valor del mes: " + VALOR_MES);
        System.out.println("De 4 a 6 meses obtendras un 10% de descuento:");
        System.out.println("De 7 a 9 meses obtendras un 20% de descuento:");
        System.out.println("De 10 meses en adelante obtendras un 30% de descuento:\n");

        // Solicitar información del cliente
        System.out.print("Ingrese el Nombre y Apellido del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la Edad del cliente: ");
        int edad = sc.nextInt();

        System.out.print("Por cuantos meses realizara la suscripcion?: ");
        int meses = sc.nextInt();

        sc.close();

        Cliente cliente = new Cliente(nombre, edad, meses);

        // Calcular descuento
        double total = cliente.getMeses() * VALOR_MES;
        double descuento = 0;

        if (cliente.getMeses() > 3 && cliente.getMeses() <= 6) {
            descuento = total * DESCUENTO_4_6_MESES;
        } else if (cliente.getMeses() > 6 && cliente.getMeses() < 10) {
            descuento = total * DESCUENTO_7_11_MESES;
        } else if (cliente.getMeses() >= 10) {
            descuento = total * DESCUENTO_12_MESES_EN_ADELANTE;
        }

        double totalConDescuento = total - descuento;

        // Mostrar resultados
        System.out
                .println("\nSu nombre es: " + cliente.getNombre() + ". Su edad es de: " + cliente.getEdad() + " años.");
        System.out.println("Tu suscripcion es por " + cliente.getMeses()
                + " meses. El costo total sin descuentos es de " + total + " pesos");

        if (descuento == 0) {
            System.out.println("Total a pagar: " + total + " pesos");
        } else {
            System.out.println("Total a pagar con descuento del " + (int) (descuento * 100 / total) + "%: "
                    + totalConDescuento + " pesos");
        }

        System.out.println("Bienvenido, Disfrute su estancia");
    }
}
