public class Ejercicio1 {
    public static int sumarArreglo(int[] arr) {
        int suma = 0;
        for (int elemento : arr) {
            suma += elemento;
        }
        return suma;
    }

    // Ejemplo de uso:
    public static void main(String[] args) {
        int[] miArreglo = {1, 2, 3, 4, 5};
        System.out.println("La suma del arreglo es: " + sumarArreglo(miArreglo));
    }
}