public class Ejercicio3 {
    public static double menor(double a, double b, double c) {
        double min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void main(String[] args) {
        System.out.println("El menor es: " + menor(5.5, 2.3, 9.8));
    }
}
