package aula04;

import javax.swing.JOptionPane;
//rodar com shift +f6
public class ExemploSucessorComOptionalPane {
    public static void main (String [] args){
//        JOptionPane.showMessageDialog(null, "Natália");
//        JOptionPane.showMessageDialog(null, "Juliana");
//        JOptionPane.showMessageDialog(null, "Iasmin");
        
        String valorDigitado = 
            JOptionPane.showInputDialog(null, "Digite um número", 
                "3º Período", JOptionPane.QUESTION_MESSAGE);
        int numero = Integer.parseInt(valorDigitado);
        JOptionPane.showMessageDialog(null,numero+1);
    }
}
