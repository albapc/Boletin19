package boletin19_1;

public class Aleatorios {

    int tam;
    int[] lista = new int[tam];

    public int[] numeroAleatorio(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 50) + 1;
        }

        return lista;
    }

    public void amosar(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    public void alReves(int[] lista) {
        for (int i = lista.length - 1; i >= 0; i--) {
            System.out.println(lista[i]);
        }

    }
}
