import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros, cada uno mayor al anterior:");
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print("Numero " + (i+1) + ": ");
                numeros[i] = sc.nextInt();
            } else {
                int num;
                do {
                    System.out.print("Numero " + (i+1) + " (mayor que " + numeros[i-1] + "): ");
                    num = sc.nextInt();
                } while (num <= numeros[i-1]);
                numeros[i] = num;
            }
        }

        System.out.println("Numeros ingresados:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
