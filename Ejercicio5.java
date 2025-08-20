public class Ejercicio5 {
    public static double calcularCostoEstacionamiento(int horas) {
        if (horas <= 0) {
            return 0.0;
        }
        double costo = 3.0;
        if (horas > 1) {
            costo += (horas - 1) * 0.50;
        }
        if (costo > 12.0) {
            return 12.0;
        } else {
            return costo;
        }
    }

    public static void main(String[] args) {
        int horas1 = 2;
        System.out.println("El costo por " + horas1 + " horas es: S/" + calcularCostoEstacionamiento(horas1));
        int horas2 = 24;
        System.out.println("El costo por " + horas2 + " horas es: S/" + calcularCostoEstacionamiento(horas2));
    }
}
