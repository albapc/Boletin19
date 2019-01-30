package boletin19_3;

import javax.swing.JOptionPane;

public class Boletin19_3 {

    public static void main(String[] args) {
        Programacion dam = new Programacion();
        int[] notas = new int[30];

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                + "**********MENÚ**********\n"
                + "Introduce una opción:\n"
                + "1.- Ver número de suspensos y aprobados\n"
                + "2.- Calcular la nota media de clase\n"
                + "3.- Ver la nota más alta\n"
                + "4.- Mostrar la nota de un alumno concreto\n"
                + "5.- Ver los alumnos aprobados\n"
                + "6.- Mostrar lista ordenada de notas\n"
                + "7.- Buscar la nota de un alumno"));

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
            //opcion 4 - ver la nota de un alumno
            case 4:
                dam.verAlumno();
                break;
            //opcion 5 - ver los alumnos aprobados
            case 5:
                dam.generarNotasAlumnos();
                dam.verAlumnosAprobados();
                break;
            //opcion 6 - ver lista ordenada de notas
            case 6:
                dam.generarNotasAlumnos();
                dam.ordenarNotas();
                dam.visualizar();
                break;
            //opcion 7 - buscar la nota de un alumno por su nombre
            case 7:
                dam.generarNotasAlumnos();
                dam.buscarNombreAlumno();
        }
    }
}
