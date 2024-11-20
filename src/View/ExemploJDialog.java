package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJDialog extends JFrame {

    public ExemploJDialog() {
        super("Exemplo JDialog");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setLayout(new FlowLayout());

        // Botão para abrir o JDialog
        JButton btnAbrirDialog = new JButton("Abrir JDialog");
        this.add(btnAbrirDialog);

        // Configurar a ação do botão
        btnAbrirDialog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Criar e exibir o JDialog
                abrirDialog();
            }
        });

        // Centralizar a janela principal
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void abrirDialog() {
        // Criar o JDialog
        JDialog dialog = new JDialog(this, "Seleção de Atividades", true);
        dialog.setSize(400, 300);
        dialog.setLayout(new BorderLayout());

        // Dados da lista
        String[] atividades = {
                "Atividade 1: Introdução ao Java",
                "Atividade 2: Estruturas de Controle",
                "Atividade 3: Programação Orientada a Objetos",
                "Atividade 4: Coleções e Streams",
                "Atividade 5: Manipulação de Arquivos"
        };

        // Criar a JList
        JList<String> listaAtividades = new JList<>(atividades);
        listaAtividades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Adicionar JList em um JScrollPane
        JScrollPane scrollPane = new JScrollPane(listaAtividades);
        dialog.add(scrollPane, BorderLayout.CENTER);

        // Painel para o botão
        JPanel panelBotoes = new JPanel();
        JButton btnSelecionar = new JButton("Selecionar");
        JButton btnCancelar = new JButton("Cancelar");
        panelBotoes.add(btnSelecionar);
        panelBotoes.add(btnCancelar);
        dialog.add(panelBotoes, BorderLayout.SOUTH);

        // Ação do botão "Selecionar"
        btnSelecionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selecionado = listaAtividades.getSelectedValue();
                if (selecionado != null) {
                    JOptionPane.showMessageDialog(dialog,
                            "Você selecionou: " + selecionado,
                            "Seleção", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(dialog,
                            "Nenhuma atividade selecionada.",
                            "Aviso", JOptionPane.WARNING_MESSAGE);
                }
                dialog.dispose(); // Fecha o JDialog
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ExemploJDialog::new);
    }
}
