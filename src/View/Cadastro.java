package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Cadastro extends JFrame {

    public Cadastro(){
        super("Cadastro");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridLayout(3, 2, 4, 4));
        JTextField fieldNome = new JTextField();
        fieldNome.setBackground(Color.lightGray);
        add("Nome", fieldNome);
        JPasswordField fieldSenha = new JPasswordField();
        fieldSenha.setBackground(Color.lightGray);
        fieldSenha.setAlignmentX(SwingConstants.CENTER);

        add("Senha", fieldSenha);

        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.setBackground(new Color(187, 102, 102));
        botaoCancelar.setAlignmentX(SwingConstants.CENTER);
        botaoCancelar.setFont(new Font("Roboto", Font.BOLD, 30));
        botaoCancelar.addActionListener((ActionEvent e) -> {
            int res=JOptionPane.showConfirmDialog(null, "deseja cancelar?", "Cadastro", JOptionPane.YES_NO_OPTION);
        });
        add(botaoCancelar);


        JButton botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBackground(new Color(152, 210, 102));
        botaoSalvar.setAlignmentX(SwingConstants.CENTER);
        botaoSalvar.setFont(new Font("Roboto", Font.BOLD, 30));
        botaoSalvar.addActionListener((ActionEvent e) -> {
            int res=JOptionPane.showConfirmDialog(null, "deseja salvar?", "Cadastro", JOptionPane.YES_NO_OPTION);
            if(res == JOptionPane.YES_OPTION){
                String nome = fieldNome.getText(); //salva o nome inserido na variável
                String senha = Arrays.toString(fieldSenha.getPassword());
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            }

        });
        add(botaoSalvar);



        this.setSize(600, 350);
        this.setVisible(true);
    }

    public void add(String label, JComponent componente) {
        GridBagConstraints cons = new GridBagConstraints();
        cons.fill = GridBagConstraints.NONE;
        cons.anchor = GridBagConstraints.NORTHWEST;
        cons.insets = new Insets(4, 4, 4, 4);
        cons.weightx = 0;
        cons.gridwidth = 1;
        this.getContentPane().add(new JLabel(label), cons);
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.weightx = 1;
        cons.gridwidth = GridBagConstraints.REMAINDER;
        this.getContentPane().add(componente, cons);
    }
    public void add(JComponent componente) {
        GridBagConstraints cons = new GridBagConstraints();
        cons.anchor = GridBagConstraints.SOUTH;
        cons.weightx = 1;
        cons.gridwidth = GridBagConstraints.REMAINDER;
        this.getContentPane().add(componente, cons);
    }

}
