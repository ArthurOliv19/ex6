import java.util.Scanner;

public class ex06lista2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;

        System.out.println(" Entre com o primeiro número ");
        a = teclado.nextDouble();

        System.out.println(" Entre com o segundo número ");
        b = teclado.nextDouble();

        System.out.println("Entre com o terceiro número ");
        c = teclado.nextDouble();

        teclado.close();

        if (a > b && a > c) {
            System.out.println(" o maior é " + a);
        } else if (b > a && b > c) {
            System.out.println(" o maior é " + b);
        } else if (c > a && c > b) {
            System.out.println(" o maior é " + c);
        }
    }
}
