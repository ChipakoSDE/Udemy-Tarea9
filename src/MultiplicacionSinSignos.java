import java.util.Scanner;

public class MultiplicacionSinSignos {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num1 = s.nextInt();
        System.out.println("Ingrese otro número:");
        int num2 = s.nextInt();
        int producto = 0;
        boolean negativo = false;
        if (num1 < 0 && num2 <0) {
            num1 = -num1;
            num2 = -num2;
        } else if (num1 < 0 && num2 > 0) {
            num1 = -num1;
            negativo = true;
        } else if (num1 > 0 && num2 < 0) {
            num2 = -num2;
            negativo = true;
        }
        for (int i = 0; i < num2; i++) {
            producto += num1;
        }
        if (negativo) {
            producto = -producto;
            System.out.println("El resultado del producto es = " + producto);
        } else {
            System.out.println("El resultado del producto es = " + producto);
        }
    }
}
