package View;

import javax.swing.*;
import java.awt.*;

public class Cadastro extends JFrame {
    public Cadastro() {
        super("Cadastro");
        JDialog dialog = new JDialog((Frame) null, "Seleção de Atividades", true);
        dialog.setSize(400, 300);
        dialog.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(new GridBagLayout());






        JLabel labelUser = new JLabel("Insira Usuário", SwingConstants.CENTER);

        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 2; // Linha inicial
        gbc.gridheight = 1;
        gbc.gridwidth = 1; // Ocupa 2 colunas
        gbc.insets = new Insets(0, 0, 5, 0);
        gbc.fill = GridBagConstraints.LINE_START; // Preenche na horizontal
        this.add(labelUser, gbc);


        JTextField fieldNome = new JTextField();
        fieldNome.setBackground(Color.lightGray);
        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 3; // Linha inicial
        gbc.gridwidth = 4; // Ocupa 2 colunas
        gbc.fill = GridBagConstraints.HORIZONTAL; // Preenche na horizontal
        this.add(fieldNome, gbc);
    }

}
