package boletin19_1;

public class Boletin19_1 {

    public static void main(String[] args) {
        int[] numeros = new int[6];
        Aleatorios obx = new Aleatorios();

        obx.numeroAleatorio(numeros);
        obx.amosar(numeros);
        System.out.println("**********AL REVÉS**********");

        obx.alReves(numeros);
    }

}
