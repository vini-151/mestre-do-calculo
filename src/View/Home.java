package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {

    public Home() {
        super("Home Mestre do Calculo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Bem-vindo ao Mestre do Calculo", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Roboto", Font.BOLD, 24));
        this.add(welcomeLabel, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1, 10, 10));

        JButton cursosButton = new JButton("Cursos");
        cursosButton.setFont(new Font("Roboto", Font.BOLD, 20));
        mainPanel.add(cursosButton);

        JButton materialButton = new JButton("Acesso as Atividades");
        materialButton.setFont(new Font("Roboto", Font.BOLD, 20));
        mainPanel.add(materialButton);

        JButton configurationButton = new JButton("Configuraçao");
        configurationButton.setFont(new Font("Roboto", Font.BOLD, 20));
        mainPanel.add(configurationButton);

        JButton sairButton = new JButton("SAIR");
        sairButton.setFont(new Font("Roboto", Font.BOLD, 20));
        mainPanel.add(sairButton);

        this.add(mainPanel, BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
