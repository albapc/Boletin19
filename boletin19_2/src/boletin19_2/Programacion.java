package boletin19_2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Programacion {

    int[] notas = new int[3];
    private int aprobados = 0, suspensos = 0;
//    int [] numAprobados = new int[notas.length]; (tambien valdria haciendolo con arrays)
//    int [] numSuspensos = new int[notas.length];

    public int darValores() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introducir notas:"));
    }

    public void crearArray() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = darValores();
        }
    }

    public void clasificarNotas(int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = darValores();
            if (notas[i] >= 5) {
//                numAprobados[aprobados++] = notas[i]; (alternativa al contador))
                aprobados++;

            } else if (notas[i] < 5) {
//                numSuspensos[suspensos++] = notas[i];
                suspensos++;
            }
        }
    }

    public void amosarAprobadosSuspensos() {
        System.out.println("Número de aprobados: " + aprobados + "\n"
                + "Número de suspensos: " + suspensos);
    }

    public void calcularMedia(int notas[]) {
        int suma = 0;
        int nele = notas.length;
        for (int i = 0; i < nele; i++) {
            notas[i] = darValores();
            suma += notas[i];
        }
        double media = suma / (double) nele;
        System.out.println("Nota media: " + media);
    }

    public void notaMaisAlta(int notas[]) {
        int max = notas[0];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = darValores();
            if (notas[i] > max) {
                max = notas[i];
            }
        }
        System.out.println("Nota más alta: " + max);
    }
}
