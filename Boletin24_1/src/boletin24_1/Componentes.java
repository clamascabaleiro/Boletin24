package boletin24_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author clamascabaleiro
 */
public class Componentes implements ActionListener {

    JFrame marco;
    JPanel panel1, panel2, panel3;
    JLabel etiqueta1, etiqueta2;
    JTextField liTexto1, liTexto2;
    JButton bPremer, bLimpar, boton3;
    JList lista;
    JTextArea campoTexto;

    public void crearVentana() {

        marco = new JFrame("Formulario");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        etiqueta1 = new JLabel("Nome");
        etiqueta2 = new JLabel("Password");
        liTexto1 = new JTextField(20);
        liTexto2 = new JTextField(20);
        bPremer = new JButton("Premer");
        bLimpar = new JButton("Limpar");
        boton3 = new JButton("Boton");
        lista = new JList();
        campoTexto = new JTextArea("Area de Texto");

        //Caracteristicas de los componentes
        String[] ele = {"Dam", "Asir", "Web"};
        lista = new JList(ele);
        marco.setSize(800, 600);
        panel1.setSize(700, 300);
        panel2.setSize(700, 300);
        etiqueta1.setBounds(150, 50, 120, 100);
        etiqueta2.setBounds(150, 100, 120, 100);
        bPremer.setBounds(150, 230, 120, 40);
        bLimpar.setBounds(400, 230, 120, 40);
        boton3.setBounds(320, 130, 120, 40);
        liTexto1.setBounds(250, 90, 120, 20);
        liTexto2.setBounds(250, 140, 120, 20);
        campoTexto.setBounds(500, 100, 120, 100);
        lista.setBounds(100, 100, 150, 100);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

        //Añadimos los componentes
        panel1.add(etiqueta1);
        panel1.add(etiqueta2);
        panel1.add(bPremer);
        panel1.add(bLimpar);
        panel2.add(boton3);
        panel1.add(liTexto1);
        panel1.add(liTexto2);
        panel2.add(campoTexto);
        panel2.add(lista);

        panel3.add(panel1);
        panel3.add(panel2);

        marco.add(panel3);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
        //Gestion de eventos
        bLimpar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bLimpar) {
            liTexto1.setText(null);
            liTexto2.setText(null);
        }
        
        else if (e.getSource() == boton3){
                campoTexto.setText("Nombre : " + liTexto1.getText() + "\n" + "Curso : " + lista.getSelectedValue());
}
    }
}
