public class Ejercicio6 {
    public static int convertirASegundos(int horas, int minutos, int segundos) {
        return (horas * 3600) + (minutos * 60) + segundos;
    }

    public static void main(String[] args) {
        int horas = 1;
        int minutos = 10;
        int segundos = 5;
        System.out.println(horas + "h " + minutos + "m y " + segundos + "s equivalen a " + convertirASegundos(horas, minutos, segundos) + " segundos.");
    }
}
