public class Ejercicio5 {
    public static int convertirASegundos(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public static void main(String[] args) {
        int h = 1, m = 30, s = 45;
        int totalSegundos = convertirASegundos(h, m, s);
        System.out.println(h + "h " + m + "m " + s + "s = " + totalSegundos + " segundos");
    }
}
