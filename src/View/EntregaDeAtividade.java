package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntregaDeAtividade extends JFrame {

    public EntregaDeAtividade() {
        super("Entrega de Atividade");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);

        // Criar painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margens

        GridBagConstraints gbc = new GridBagConstraints();




        JMenuBar menuBar = new JMenuBar();

        JMenu optionsMenu = new JMenu("Opções");

        JMenuItem configMenuItem = new JMenuItem("Configuração");
        JMenuItem voltarMeuItem = new JMenuItem("Voltar");
        JMenuItem exitMenuItem = new JMenuItem("Sair");


        configMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Configs configs = new Configs();
            }
        });

        voltarMeuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ação para a opção "Sair"
                System.exit(0);
            }
        });

        optionsMenu.add(configMenuItem);
        optionsMenu.add(voltarMeuItem);
        optionsMenu.add(exitMenuItem);


        menuBar.add(optionsMenu);

        this.setJMenuBar(menuBar);





        // Adicionar componentes ao painel principal
        JLabel labelInicial = new JLabel("Atividade:", SwingConstants.CENTER);
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

        JLabel labelQuestao = new JLabel("<html>Seja f(x) = e²×. Qual é a derivada da função?</html>", SwingConstants.LEFT);
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
        JButton btnSelecionar = new JButton("Responder");
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        panel.add(btnSelecionar, gbc);

        btnSelecionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (opcao1.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Você acertou!");
                    avalieQuestao();
                    dispose();
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


    private void avalieQuestao() {
        final String[] avaliacao = {""};


        // Criar o JDialog
        JDialog dialog = new JDialog(this, "Avalie a questão", true);
        dialog.setSize(600, 600);
        dialog.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        JLabel welcomeLabel = new JLabel("Avalie essa questão e nos ajude a melhorar!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Roboto", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        dialog.add(welcomeLabel, gbc);





        JLabel label = new JLabel("Selecione uma opção:");
        dialog.add(label);

        // Criando um JComboBox com opções
        String[] opcoes = {"Ruim", "Regular", "Bom", "Ótimo"};
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        JComboBox<String> comboBoxAvaliacao = new JComboBox<>(opcoes);


        // Adicionando evento ao JComboBox
        comboBoxAvaliacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcaoSelecionada = (String) comboBoxAvaliacao.getSelectedItem();
                avaliacao[0] = opcaoSelecionada;
                JOptionPane.showMessageDialog(dialog, "Você selecionou: " + opcaoSelecionada);
            }
        });

        // Adicionando o JComboBox ao JFrame
        dialog.add(comboBoxAvaliacao, gbc);

        JButton btnConcluirAvaliacao = new JButton("Concluir");
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        dialog.add(btnConcluirAvaliacao, gbc);

        btnConcluirAvaliacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Usuário avaliou a questão como: " + avaliacao[0]);
                dispose();
            }
        });



        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }



}
