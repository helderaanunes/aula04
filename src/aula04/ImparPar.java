package aula04;

import javax.swing.JOptionPane;

public class ImparPar {
    public static void main (String [] args) {
        String numeroComoString = 
        JOptionPane.showInputDialog(null,"Digite um número");
        int numero = Integer.parseInt(numeroComoString);
        if (numero%2==0){
            JOptionPane.showMessageDialog(null, "PAR!");
        } else {
            JOptionPane.showMessageDialog(null, "IMPAR!");
        }
        
    }
}
