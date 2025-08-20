import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] frecuencia = new int[6]; // posiciones 0 a 5 representan caras 1 a 6

        for (int i = 0; i < 20000; i++) {
            int dado = rand.nextInt(6) + 1; // número entre 1 y 6
            frecuencia[dado - 1]++;
        }

        System.out.println("Frecuencia de cada cara del dado:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Cara " + (i+1) + ": " + frecuencia[i]);
        }
    }
}
