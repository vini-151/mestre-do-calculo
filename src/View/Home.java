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

        JMenuBar menuBar = new JMenuBar();

        JMenu optionsMenu = new JMenu("Opções");

        JMenuItem configMenuItem = new JMenuItem("Configuração");
        JMenuItem exitMenuItem = new JMenuItem("Sair");


        configMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Configurações clicadas!");
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

        JLabel welcomeLabel = new JLabel("Bem-vindo ao Mestre do Calculo", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Roboto", Font.BOLD, 24));

        JTextArea descriptionArea = new JTextArea("É um cursinho online especializado em disciplinas de exatas do nível superior, como Cálculo 1, Cálculo 2, Cálculo 3, Física 1, Física 2 e Física 3");
        descriptionArea.setFont(new Font("Roboto", Font.PLAIN, 16));
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setLineWrap(true);
        descriptionArea.setOpaque(true);
        descriptionArea.setBackground(new Color(245, 245, 245)); // Cor de fundo suave
        descriptionArea.setEditable(false);
        descriptionArea.setFocusable(false);
        descriptionArea.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1)); // Borda suave
        descriptionArea.setMargin(new Insets(10, 10, 10, 10));

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 1, 10, 10));
        northPanel.add(welcomeLabel);
        northPanel.add(descriptionArea);

        this.add(northPanel, BorderLayout.NORTH);

        JPanel spacerPanel = new JPanel();
        spacerPanel.setPreferredSize(new Dimension(600, 20)); // Ajusta o tamanho do espaço
        this.add(spacerPanel, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1, 10, 10));

        JButton cursosButton = new JButton("Cursos");
        cursosButton.setFont(new Font("Roboto", Font.BOLD, 20));
        mainPanel.add(cursosButton);

        JButton materialButton = new JButton("Acesso as Atividades");
        materialButton.setFont(new Font("Roboto", Font.BOLD, 20));
        mainPanel.add(materialButton);

        this.add(mainPanel, BorderLayout.CENTER);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

