package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Configs extends JFrame {

    public Configs() {
        super("Configurações Mestre do Calculo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu optionsMenu = new JMenu("Opções");

        JMenuItem configMenuItem = new JMenuItem("Configuração");
        JMenuItem exitMenuItem = new JMenuItem("Sair");


        configMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });


        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ação para a opção "Sair"
                System.exit(0);
            }
        });

        optionsMenu.add(configMenuItem);
        optionsMenu.add(exitMenuItem);

        menuBar.add(optionsMenu);

        this.setJMenuBar(menuBar);

        JLabel welcomeLabel = new JLabel("Configurações", SwingConstants.LEFT);
        welcomeLabel.setFont(new Font("Roboto", Font.BOLD, 24));

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 1, 10, 10));
        northPanel.add(welcomeLabel);

        this.add(northPanel, BorderLayout.NORTH);

        JPanel spacerPanel = new JPanel();
        spacerPanel.setPreferredSize(new Dimension(600, 20)); // Ajusta o tamanho do espaço
        this.add(spacerPanel, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1, 10, 10));

        JToggleButton emaisBtn = new JToggleButton("Mandar e-mails sobre recomendações de estudos");
        emaisBtn.setFont(new Font("Roboto", Font.BOLD, 20));

        emaisBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (emaisBtn.isSelected()) {
                    System.out.println("Usuário quer receber e-mails");
                }else{
                    System.out.println("Usuário não quer receber e-mails");
                }
            }
        });
        mainPanel.add(emaisBtn);

        JButton concluirBtn = new JButton(" Concluir");
        concluirBtn.setFont(new Font("Roboto", Font.BOLD, 20));

        concluirBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        mainPanel.add(concluirBtn);


        this.add(mainPanel, BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}


