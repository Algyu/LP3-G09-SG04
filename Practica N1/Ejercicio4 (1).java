public class Ejercicio4 {
    public static double menor(double num1, double num2, double num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        System.out.println("El menor de los tres números es: " + menor(5.5, 2.8, 9.1));
    }
}
