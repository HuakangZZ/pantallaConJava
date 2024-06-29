package my.company.ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana(){
        this.setSize(500,500);//Establecemos el tamaño de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//Finalizamos el programa
        this.setTitle("Primera Ventana");//Colocamos titulo a la ventana
        //this.setLocation(100,200);//Seteamos la posicion de manera manual
        //this.setBounds(100,200,500,500);//PosicionX,PosicionY,AnchoDeLaVentana,LargoDeLaVentana
        this.setLocationRelativeTo(null);//Posicionamos la ventana en el centro
        //this.setResizable(false);//Indicamos si la ventana se redimensiona o no
        this.setMinimumSize(new Dimension(500,500));//Establecemos el tamaño minimo de la redimencion
        //this.getContentPane().setBackground(Color.GRAY);//Establecemos el color de fondo de la ventana
        this.iniciarComponentes();
    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        //panel.setBackground(Color.BLUE); Cambiamos el color al panel
        panel.setLayout(null);
        this.getContentPane().add(panel);

        JLabel etiqueta = new JLabel();
        etiqueta.setText("Hola");//Colocamos el texto a la etiqueta
        etiqueta.setBounds(10,10,50,30);
        panel.add(etiqueta);//Agregamos la etiqueta al panel
    }
}
