package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame {



    public Login(){
        super("Login Mestre do Cálculo");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        intro();


        JMenuBar menuBar = new JMenuBar();
        JMenu optionsMenu = new JMenu("Opções");
        JMenuItem configMenuItem = new JMenuItem("Sobre");

        configMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Mestre do Cálculo é uma plataforma de cursos online que alavancam o seu aprendizado!");
                JButton fecharBotao = new JButton("Legal!");

                // Adiciona um ActionListener ao botão
                fecharBotao.addActionListener(e1 -> {
                    // Fecha o JOptionPane
                    JOptionPane.getRootFrame().dispose();
                });
            }
        });

        optionsMenu.add(configMenuItem);
        menuBar.add(optionsMenu);
        this.setJMenuBar(menuBar);





        JLabel labelInicial = new JLabel("Bem vindo! Faça seu Login", SwingConstants.CENTER);
        labelInicial.setFont(new Font("Roboto", Font.BOLD, 30));
        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 0; // Linha inicial
        gbc.gridwidth = 2; // Ocupa 2 colunas
        gbc.fill = GridBagConstraints.HORIZONTAL; // Preenche na horizontal
        gbc.insets = new Insets(10, 0, 20, 0);
        this.add(labelInicial, gbc);









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




        JLabel labelSenha = new JLabel("Insira Senha", SwingConstants.CENTER);
        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 5; // Linha inicial
        gbc.gridheight = 1;
        gbc.gridwidth = 1; // Ocupa 2 colunas
        gbc.fill = GridBagConstraints.LINE_START; // Preenche na horizontal
        this.add(labelSenha, gbc);


        JPasswordField fieldSenha = new JPasswordField();
        fieldSenha.setBackground(Color.lightGray);
        fieldNome.setBackground(Color.lightGray);
        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 6; // Linha inicial
        gbc.gridwidth = 4; // Ocupa 2 colunas
        gbc.fill = GridBagConstraints.HORIZONTAL; // Preenche na horizontal
        this.add(fieldSenha, gbc);



        JCheckBox lembrarCheckBox = new JCheckBox("Lembrar Usuário");
        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 7; // Linha inicial
        gbc.gridwidth = 4; // Ocupa 2 colunas
        gbc.insets = new Insets(0, 0, 40, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;


        // Adicionar ação ao JCheckBox
        lembrarCheckBox.addActionListener(e -> {
            if (lembrarCheckBox.isSelected()) {
                System.out.println("Usuário será lembrado.");
            } else {
                System.out.println("Usuário não será lembrado.");
            }
        });

        // Adicionar o JCheckBox ao JFrame
        this.add(lembrarCheckBox, gbc);





        // Adicionar um botão na segunda linha, primeira coluna
        JButton entrarBtn = new JButton("Entrar");
        entrarBtn.setBackground(new Color(152, 210, 102));
        entrarBtn.setAlignmentX(SwingConstants.CENTER);
        entrarBtn.setFont(new Font("Roboto", Font.BOLD, 30));
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        entrarBtn.addActionListener((ActionEvent e) -> {
                String nome = fieldNome.getText(); //salva o nome inserido na variável
                String senha = String.copyValueOf(fieldSenha.getPassword());

                System.out.println(nome);
                System.out.println(senha);

                if(!nome.isEmpty() && !senha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Bem vindo!");
                    this.dispose();
                    Home home = new Home();
                }else{
                    JOptionPane.showMessageDialog(null, "Login inválido");
                }


        });
        this.add(entrarBtn, gbc);



        JButton cadastrarBtn = new JButton("Cadastrar");
        cadastrarBtn.setBackground(new Color(250, 210, 102));
        cadastrarBtn.setAlignmentX(SwingConstants.CENTER);
        cadastrarBtn.setFont(new Font("Roboto", Font.BOLD, 30));
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        cadastrarBtn.addActionListener((ActionEvent e1) -> {
            cadastro();
        });
        this.add(cadastrarBtn, gbc);




        this.setSize(600, 550);

        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }






    public void cadastro() {
        // Criar o JDialog
        JDialog dialog = new JDialog(this, "Seleção de Atividades", true);
        dialog.setSize(400, 300);
        dialog.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();



        JLabel labelUser = new JLabel("Insira Usuário", SwingConstants.CENTER);

        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 1; // Linha inicial
        gbc.gridheight = 1;
        gbc.gridwidth = 1; // Ocupa 2 colunas
        gbc.insets = new Insets(0, 0, 5, 0);
        gbc.fill = GridBagConstraints.LINE_START; // Preenche na horizontal
        dialog.add(labelUser, gbc);


        JTextField fieldNome = new JTextField();
        fieldNome.setBackground(Color.lightGray);
        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 2; // Linha inicial
        gbc.gridwidth = 4; // Ocupa 2 colunas
        gbc.fill = GridBagConstraints.HORIZONTAL; // Preenche na horizontal
        dialog.add(fieldNome, gbc);




        JLabel labelSenha = new JLabel("Insira Senha (deve possuir mais de 8 caracteres", SwingConstants.CENTER);
        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 3; // Linha inicial
        gbc.gridheight = 1;
        gbc.gridwidth = 1; // Ocupa 2 colunas
        gbc.fill = GridBagConstraints.LINE_START; // Preenche na horizontal
        dialog.add(labelSenha, gbc);


        JPasswordField fieldSenha = new JPasswordField();
        fieldSenha.setBackground(Color.lightGray);
        fieldNome.setBackground(Color.lightGray);
        gbc.gridx = 0; // Coluna inicial
        gbc.gridy = 4; // Linha inicial
        gbc.gridwidth = 4; // Ocupa 2 colunas
        gbc.fill = GridBagConstraints.HORIZONTAL; // Preenche na horizontal
        dialog.add(fieldSenha, gbc);


        // Painel para o botão
        JPanel panelBotoes = new JPanel();
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnSelecionar = new JButton("Concluir");
        panelBotoes.add(btnCancelar);
        panelBotoes.add(btnSelecionar);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        dialog.add(panelBotoes, gbc);

        // Ação do botão "Selecionar"
        btnSelecionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeCadastrado = fieldNome.getText(); //salva o nome inserido na variável
                String senhaCadastrada = String.copyValueOf(fieldSenha.getPassword());
                if (verificaSenha(senhaCadastrada)) {
                    JOptionPane.showMessageDialog(dialog,
                            "User: " + nomeCadastrado + " Criado!",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    Home home = new Home();
                    dialog.dispose();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(dialog,
                            "Senha deve conter mais que 8 caracteres.",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                }

            }
        });

        // Ação do botão "Cancelar"
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose(); // Fecha o JDialog sem fazer nada
            }
        });

        // Centralizar o JDialog em relação ao JFrame
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }



    private void intro() {
        // Criar o JDialog
        JDialog dialog = new JDialog(this, "Intro", true);
        dialog.setSize(600, 600);
        dialog.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();


        JLabel welcomeLabel = new JLabel("Bem-vindo ao Mestre do Calculo", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Roboto", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        dialog.add(welcomeLabel, gbc);

        JLabel descriptionArea = new JLabel("<html> Esse é um sistema conceito onde representa o funcionamento de uma plataforma de cursinho online. Utilize qualquer informação de nome e senha para prosseguir.  </html>", SwingConstants.LEFT);
        descriptionArea.setFont(new Font("Roboto", Font.PLAIN, 20));
        gbc.insets = new Insets(10, 0, 50, 0);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        dialog.add(descriptionArea, gbc);

        JButton btnSelecionar = new JButton("Entendi!");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 5;
        gbc.fill = GridBagConstraints.NONE;

        btnSelecionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        dialog.add(btnSelecionar, gbc);

        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }





    public boolean verificaSenha(String senha) {
        return senha.length() > 8;
    }

}
