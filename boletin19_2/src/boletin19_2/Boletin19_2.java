package boletin19_2;

import javax.swing.JOptionPane;

public class Boletin19_2 {

    public static void main(String[] args) {
        Programacion dam = new Programacion();
        int[] notas = new int[30];

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("**********MENÚ**********\n"
                + "Introduce una opción:\n"
                + "1.- Ver número de suspensos y aprobados\n"
                + "2.- Calcular la nota media de clase\n"
                + "3.- Ver la nota más alta"));

        switch (opcion) {
            //opcion 1 - mostrar numero suspensos y aprobados            
            case 1:
                dam.clasificarNotas(notas);
                dam.amosarAprobadosSuspensos();
                break;
            //opcion 2 - calcular y ver la nota media de la clase
            case 2:
                dam.calcularMedia(notas);
                break;
            //opcion 3 - ver la nota mas alta      
            case 3:
                dam.notaMaisAlta(notas);
                break;
        }
    }
}
