package proyecto.calculadora.ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    Dimension dimensionMinima = new Dimension(400,400);
    Dimension dimensionMaxima = new Dimension(600,600);
    public Ventana() {
        this.setTitle("calculadora");
        this.setSize(400,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setMinimumSize(dimensionMinima);
        this.setMaximumSize(dimensionMaxima);
        this.agregarComponentes();
        JButton boton = new JButton();
        boton.setBounds(10, 10, 80, 30);
        boton.setText("Messi");
        boton.setFocusPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void agregarComponentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(72, 117, 152));
        this.getContentPane().add(panel);

        JButton boton = new JButton();
        boton.setBounds(10, 10, 80, 30);
        boton.setText("Messi");
        boton.setFocusPainted(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JTextField campo1 = new JTextField();
        campo1.setBounds(10,50,150,30);
        panel.add(campo1);

        JTextField campo2 = new JTextField();
        campo2.setBounds(10,90,150,30);
        panel.add(campo2);

        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(10,120,50,30);
        etiqueta.setOpaque(true);//Desactivamos los valores por defecto de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Posicionamos la letra
        etiqueta.setFont(new Font("arial",Font.BOLD,20));//Agregamos el estilo de la letra
        panel.add(etiqueta);//Agregamos la etiqueta al panel


        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Integer resultado = Integer.valueOf(campo1.getText()) + Integer.valueOf(campo2.getText());
                System.out.println(resultado);
                etiqueta.setText(resultado.toString());
            }
        });
        panel.add(boton);
    }

}
