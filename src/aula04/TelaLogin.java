package aula04;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame{
    private JTextField emailInput;
    private JLabel emailLabel;
    private JLabel senhaLabel;
    private JPasswordField senhaInput;
    
    public TelaLogin(){
        this.setSize(600,400);
        this.setVisible(true);
        this.setTitle("Tela de Login");
        
        this.emailLabel = new JLabel();
        this.emailLabel.setText("E-mail:");
        //x,y,comprimento,altura
        this.emailLabel.setBounds(10, 10, 200, 30);
        this.emailLabel.setVisible(true);
        
        this.emailInput = new JTextField();
        this.emailInput.setBounds(240, 10, 200, 30);
        this.emailInput.setVisible(true);
        
        this.add(emailInput);
        this.add(emailLabel);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        TelaLogin tl = new TelaLogin();

    }
}
