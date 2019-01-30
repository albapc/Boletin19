package boletin19_4;

import javax.swing.JOptionPane;

public class LetraDni {

    public char calcularLetra() {
        char[] caracteres = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
            +'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Introduce un "
                + "DNI sin letra:"));
        int resto = dni % 23;

        System.out.println("La letra del DNI " + dni + " es " + caracteres[resto]);

        return caracteres[resto];
    }
}
