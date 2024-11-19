package View;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class EntregaDeAtividade extends javax.swing.JFrame {

    public EntregaDeAtividade() {
        super("Entrega de Atividade");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridLayout(3, 2, 4, 4));
        setSize(400, 400);

        //titulo da pagina dentro do frame
        JLabel label = new JLabel("Entrega de atividade", SwingConstants.CENTER); //JLabel
        this.getContentPane().add(label);








        setVisible(true);

    }



}
