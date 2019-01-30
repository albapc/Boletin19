package boletin19_3;

//import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Programacion {

    int[] notas = new int[30];
    private int aprobados = 0, suspensos = 0;
//    int [] numAprobados = new int[notas.length]; (tambien valdria haciendolo con arrays)
//    int [] numSuspensos = new int[notas.length];
    String[] alumnos = {"PEPE", "JUAN", "MARIA", "ANA", "ADRIAN", "JOSE", "JORGE", "BEATRIZ",
        "LARA", "MANUEL", "IAGO", "LUCIA", "ANDRES", "LUIS", "JACOBO", "RAMON", "RAFAEL", "FERNANDO",
        "PEDRO", "DANIEL", "ALVARO", "IVAN", "FERNANDO", "ALBA", "AIDA", "BRAIS", "JAVIER", "CARLOS",
        "MARTA", "ALEJANDRO"};

    public int darValores() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introducir notas:"));
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

    public void verAlumno() {
        for (int i = 0; i < 1; i++) {
            int r = new Random().nextInt(alumnos.length);
            int notaAleatoria = (int) (Math.random() * 10 + 0);
            notas[i] = notaAleatoria;

            System.out.println("Nombre: " + alumnos[r] + "\nNota: " + notas[i]);
        }
    }

    public void generarNotasAlumnos() {
        for (int i = 0; i < notas.length; i++) {
            int notaAleatoria = (int) (Math.random() * 10 + 0);
            notas[i] = notaAleatoria;
        }
    }

    public void verAlumnosAprobados() {
        System.out.println("Alumnos aprobados:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(alumnos[i] + " = " + notas[i]);
            }
        }
    }

    public void ordenarNotas() {
        int n;
        String a;

        for (int j = 0; j < notas.length - 1; j++) {
            for (int i = 0; i < notas.length - 1; i++) {
                if (notas[i] > notas[i + 1]) {
                    n = notas[i];
                    notas[i] = notas[i + 1];
                    notas[i + 1] = n;

                    a = alumnos[i];
                    alumnos[i] = alumnos[i + 1];
                    alumnos[i + 1] = a;
                }
            }
        }
    }

    public void visualizar() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(alumnos[i] + " --> " + notas[i]);
        }
    }

    public void buscarNombreAlumno() {
        String nAlumno = JOptionPane.showInputDialog("Introduce el nombre del alumno:");
        nAlumno = nAlumno.toUpperCase();
        for (int i = 0; i < notas.length; i++) {
            if (nAlumno.equals(alumnos[i])) {
                System.out.println("Resultados:\nAlumno: " + alumnos[i] + ""
                        + "\nNota: " + notas[i]);
            }
        }
    }
}
