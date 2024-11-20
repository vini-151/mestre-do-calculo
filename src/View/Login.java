package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login extends JFrame {

    public Login(){
        super("Login Mestre do Cálculo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();




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
            int res=JOptionPane.showConfirmDialog(null, "deseja salvar?", "Cadastro", JOptionPane.YES_NO_OPTION);
            if(res == JOptionPane.YES_OPTION){
                String nome = fieldNome.getText(); //salva o nome inserido na variável
                String senha = String.copyValueOf(fieldSenha.getPassword());

                System.out.println(nome);
                System.out.println(senha);

                if(nome.equals("Vini") && senha.equals("123")){
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                    this.dispose();
                    EntregaDeAtividade teste = new EntregaDeAtividade();
                    teste.setUsername(nome);
                }else{
                    JOptionPane.showMessageDialog(null, "Login inválido");
                }

            }

        });
        this.add(entrarBtn, gbc);


        this.setSize(600, 350);

        this.setVisible(true);
    }

}
