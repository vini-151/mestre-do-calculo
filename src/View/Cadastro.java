package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

    public Cadastro(){
        super("Cadastro");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridLayout());
        JTextField fieldNome = new JTextField();
        add("Nome", fieldNome);
        JTextArea fieldDescricao = new JTextArea(10, 10);
        JScrollPane barraRolagem = new JScrollPane(fieldDescricao);
        add("Endereço", fieldDescricao);
        JButton botaoSalvar = new JButton("Salvar");

        botaoSalvar.addActionListener((ActionEvent e) -> {
            int res=JOptionPane.showConfirmDialog(null, "deseja salvar?", "Cadastro", JOptionPane.YES_NO_OPTION);
            if(res == JOptionPane.YES_OPTION){
                String nome = fieldNome.getText(); //salva o nome inserido na variável
                String endereco = fieldDescricao.getText();
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            }

        });
        add(botaoSalvar);
        this.setSize(600, 350);
        this.setVisible(true);
    }

}
