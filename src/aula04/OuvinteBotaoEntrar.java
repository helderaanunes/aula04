package aula04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class OuvinteBotaoEntrar implements ActionListener{

    private TelaLogin telaLogin;
    
    public OuvinteBotaoEntrar(TelaLogin telaLogin){
        this.telaLogin=telaLogin;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (
            this.telaLogin.getEmailInput().getText()
                .equalsIgnoreCase("gesislaine@gmail.com")
                &&
            new String (
                this.telaLogin.getSenhaInput().getPassword()
            ).equals("geh123")
            ){
            JOptionPane.showMessageDialog(null,"Senha Correta");
        }
        else{
            JOptionPane.showMessageDialog(null,"Senha incorreta");
        }
    }
}
