package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntregaDeAtividade extends JFrame {

    String Username;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public EntregaDeAtividade() {
        super("Entrega de Atividade");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);

        // Criar painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margens

        GridBagConstraints gbc = new GridBagConstraints();

        // Adicionar componentes ao painel principal
        JLabel labelInicial = new JLabel("Bem vindo, " + this.Username, SwingConstants.CENTER);
        labelInicial.setFont(new Font("Roboto", Font.BOLD, 30));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 6, 450);
        panel.add(labelInicial, gbc);

        JLabel labelEntrega = new JLabel("Entrega de atividades", SwingConstants.LEFT);
        labelEntrega.setFont(new Font("Roboto", Font.PLAIN, 25));
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 40, 0);
        panel.add(labelEntrega, gbc);

        JLabel labelNumeroExercicio = new JLabel("Questão 1:", SwingConstants.LEFT);
        labelNumeroExercicio.setFont(new Font("Roboto", Font.PLAIN, 20));
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 0, 3, 0);
        panel.add(labelNumeroExercicio, gbc);

        JLabel labelQuestao = new JLabel("<html>Quem não sei o que dos paranauê muito doidão...</html>", SwingConstants.LEFT);
        labelQuestao.setFont(new Font("Roboto", Font.PLAIN, 20));
        gbc.gridy = 3;
        gbc.insets = new Insets(10, 0, 50, 0);
        panel.add(labelQuestao, gbc);

        // Adicionar opções
        JRadioButton opcao1 = new JRadioButton("A) 2e²×");
        JRadioButton opcao2 = new JRadioButton("B) e²×");
        JRadioButton opcao3 = new JRadioButton("C) 4e×");
        JRadioButton opcao4 = new JRadioButton("D) e×");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(opcao1);
        grupo.add(opcao2);
        grupo.add(opcao3);
        grupo.add(opcao4);

        gbc.gridwidth = 1;
        gbc.gridy = 4;
        gbc.insets = new Insets(10, 0, 0, 0);
        panel.add(opcao1, gbc);

        gbc.gridy = 5;
        panel.add(opcao2, gbc);

        gbc.gridy = 6;
        panel.add(opcao3, gbc);

        gbc.gridy = 7;
        panel.add(opcao4, gbc);

        // Botão para exibir a seleção
        JButton btnSelecionar = new JButton("Mostrar Seleção");
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        panel.add(btnSelecionar, gbc);

        btnSelecionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (opcao1.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Você acertou!");
                } else {
                    JOptionPane.showMessageDialog(null, "Você errou, tente novamente!");
                }
            }
        });

        // Definir tamanho preferido do painel


        // Envolver o painel no JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // Adicionar o JScrollPane ao JFrame
        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);

        // Tornar visível
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
