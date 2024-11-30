package aula04;

import javax.swing.JOptionPane;

public class Repetir10 {
    public static void main(String[] args) {
        int i=0;
        while (i<3){
            JOptionPane.showMessageDialog(null, "Rodada "+i);
            i++;
        }
        
        for ( int j=0  ; j<2  ; j++){
             JOptionPane.showMessageDialog(null, "For "+j);
        }
        
         String [] a= {"Gesislaine", "Bárbara", "Andersson"};
        for (String nome : a){
            JOptionPane.showMessageDialog(null, nome);
        }
    }
}
