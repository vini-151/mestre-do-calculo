package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ListaDeCursos extends JFrame {

    public ListaDeCursos() {
        // Criação do JFrame
        JFrame frame = new JFrame("Descrição dos Cursos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);


        JMenuBar menuBar = new JMenuBar();

        JMenu optionsMenu = new JMenu("Opções");

        JMenuItem configMenuItem = new JMenuItem("Configuração");
        JMenuItem exitMenuItem = new JMenuItem("Sair");
        JMenuItem voltar = new JMenuItem("Voltar");

        configMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Configs configs = new Configs();
            }
        });


        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ação para a opção "Sair"
                System.exit(0);
            }
        });


        voltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        optionsMenu.add(voltar);
        optionsMenu.add(configMenuItem);
        optionsMenu.add(exitMenuItem);


        menuBar.add(optionsMenu);

        frame.setJMenuBar(menuBar);



        // Criação do conteúdo dos cursos
        Map<String, String> descricaoDoCurso = new HashMap<>();
        descricaoDoCurso.put("Cálculo 1",
                "No curso de cálculo você aprende além do conteúdo os pré-requisitos para cálculo como o estudo de funções.\n" +
                        "Os conteúdos são:\n" +
                        "- Limite e continuidade\n" +
                        "- Derivadas\n" +
                        "- Integrais");

        descricaoDoCurso.put("Física 1",
                "Os conteúdos incluem:\n" +
                        "- Grandezas e unidades de medida\n" +
                        "- Sistema métrico e Sistema Internacional de Unidades (S.I)\n" +
                        "- Grandezas fundamentais e derivadas do S.I\n" +
                        "- Algarismos significativos\n" +
                        "- Notação científica e ordem de grandeza\n" +
                        "- Grandezas escalares e vetoriais\n" +
                        "- Adição e subtração de vetores\n" +
                        "- Cinemática, que inclui posição, tempo, velocidade média, unidades de medida, movimento retilíneo uniforme, movimento uniformemente variado, gráficos S x t, V x t e a x t\n" +
                        "- Leis de Newton e suas aplicações\n" +
                        "- Princípios físicos de conservação");
        descricaoDoCurso.put("Cálculo 2",
                "No curso de Cálculo Diferencial e Integral de Várias Variáveis, você aprende sobre:\n" +
                        "- Funções de várias variáveis reais\n" +
                        "- Derivadas parciais\n" +
                        "- Derivada direcional\n" +
                        "- Máximos e mínimos\n" +
                        "- Integrais duplas, triplas e múltiplas\n" +
                        "- Curvas no plano e no espaço\n" +
                        "- Integrais de linha\n" +
                        "- Rotacional e Divergente\n" +
                        "- Integrais de superfície\n" +
                        "- Sequências e séries numéricas");
        descricaoDoCurso.put("Física 2",
                "Os conteúdos incluem:\n" +
                        "- Termodinâmica, incluindo a Lei Zero, a Primeira e a Segunda Lei da Termodinâmica, e a entropia\n" +
                        "- Calor, incluindo o equivalente mecânico do calor e os mecanismos de transferência de calor\n" +
                        "- Temperatura e escalas de medida\n" +
                        "- Dilatação térmica\n" +
                        "- Ondas mecânicas, incluindo a interferência e difração\n" +
                        "- Acústica\n" +
                        "- Eletrostática e eletrodinâmica, incluindo a Lei de Coulomb, o campo elétrico, o potencial elétrico, a capacitância, a corrente, a resistência, a força eletromotriz e os circuitos elétricos");
        descricaoDoCurso.put("Cálculo 3",
                "No curso de Cálculo 3, você aprende sobre:\n" +
                        "- Funções reais de várias variáveis reais\n" +
                        "- Limite e continuidade\n" +
                        "- Derivadas parciais e diferenciabilidade\n" +
                        "- Derivada direcional e gradiente\n" +
                        "- Fórmula de Taylor\n" +
                        "- Extremos locais e globais\n" +
                        "- Funções vetoriais de várias variáveis\n" +
                        "- Divergência e rotacional\n" +
                        "- Integrais múltiplas e suas aplicações\n" +
                        "- Integral de Linha e de superfície e suas aplicações");
        descricaoDoCurso.put("Física 3",
                "Os conteúdos incluem:\n" +
                        "- Carga elétrica\n" +
                        "- Campo elétrico\n" +
                        "- Lei de Gauss\n" +
                        "- Potencial elétrico\n" +
                        "- Capacitância\n" +
                        "- Corrente e resistência elétrica\n" +
                        "- Força eletromotriz e circuitos elétricos\n" +
                        "- Campo magnético\n" +
                        "- Lei de Ampère\n" +
                        "- Lei de Indução de Faraday");

        // Criação do JList para exibir os nomes dos cursos
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String course : descricaoDoCurso.keySet()) {
            listModel.addElement(course);
        }
        JList<String> courseList = new JList<>(listModel);
        courseList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Criação do JTextArea para exibir a descrição do curso selecionado
        JTextArea courseDescriptionArea = new JTextArea();
        courseDescriptionArea.setLineWrap(true);
        courseDescriptionArea.setWrapStyleWord(true);
        courseDescriptionArea.setEditable(false);

        // Adicionar um listener para exibir a descrição do curso selecionado
        courseList.addListSelectionListener(event -> {
            String selectedCourse = courseList.getSelectedValue();
            if (selectedCourse != null) {
                courseDescriptionArea.setText(descricaoDoCurso.get(selectedCourse));
            }
        });

        // Layout do frame
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(courseList), new JScrollPane(courseDescriptionArea));
        splitPane.setDividerLocation(150);





        frame.add(splitPane);



        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
