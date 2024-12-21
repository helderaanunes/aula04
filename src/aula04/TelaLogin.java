package aula04;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame{
    private JTextField emailInput;
    private JLabel emailLabel;
    private JLabel senhaLabel;
    private JPasswordField senhaInput;
    private JButton botaoEntrar;
    
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
        this.emailInput.setBounds(80, 10, 200, 30);
        this.emailInput.setVisible(true);
        
        this.senhaLabel = new JLabel();
        this.senhaLabel.setText("Senha:");
        this.senhaLabel.setBounds(10, 50, 200, 30);
        this.senhaLabel.setVisible(true);
        this.add(senhaLabel);
        
        this.senhaInput = new JPasswordField();
        this.senhaInput.setBounds(80, 50, 200, 30);
        this.senhaInput.setVisible(true);
        this.add(senhaInput);
        
        this.botaoEntrar = new JButton();
        this.botaoEntrar.setText("Entrar");
        this.botaoEntrar.setBounds(80, 120, 80, 30);
        this.botaoEntrar.setVisible(true);
        this.add(botaoEntrar);
        this.botaoEntrar.
                addActionListener(new OuvinteBotaoEntrar(this));
        
        this.add(emailInput);
        this.add(emailLabel);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        TelaLogin tl = new TelaLogin();

    }

    public JTextField getEmailInput() {
        return emailInput;
    }
    public JPasswordField getSenhaInput() {
        return senhaInput;
    }
    
}
