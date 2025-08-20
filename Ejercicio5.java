public class Ejercicio4 {
    public static double calcularCargo(int horas) {
        if (horas <= 0) return 0;

        double total = 3.0; // primera hora
        if (horas > 1) {
            total += (horas - 1) * 0.5;
        }

        // máximo 12 soles
        if (total > 12.0) {
            total = 12.0;
        }
        return total;
    }

    public static void main(String[] args) {
        int horas = 10;
        System.out.println("Por " + horas + " horas, el cargo es: S/" + calcularCargo(horas));
    }
}
