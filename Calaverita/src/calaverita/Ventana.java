package calaverita;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

    private JPanel panel;

    public Ventana() {

        this.setSize(550, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("<<<<Calaverita Literaria>>>>");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        Iniciar();

    }

    private void Iniciar() {

        Panel();
        Etiquetas();
        Boton();

    }

    private void Panel() {

        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void Etiquetas() {

        JLabel etiqueta = new JLabel("Calaverita Literaria");//texto etiqueta
        panel.add(etiqueta);//agregamos un panel a la etiqueta
        etiqueta.setBounds(170, 0, 300, 80);//dimension de la etiqueta x,y,ancho,alto
        etiqueta.setForeground(Color.RED);//color del texto
        etiqueta.setFont(new Font("Baskerville", Font.ITALIC, 22));//tipo de fuente y tamaño de la letra

        JLabel etiqueta2 = new JLabel();
        ImageIcon imagen = new ImageIcon("mamalona.jpg");

        panel.add(etiqueta2);//agregar el panel a la etiqueta dos
        etiqueta2.setBounds(65, 65, 400, 400);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
    }

    private void Boton() {
        JButton boton = new JButton("Mostrar");
        boton.setBounds(190, 450, 150, 40);
        boton.setForeground(Color.pink);
        boton.setFont(new Font("Baskerville", Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);
        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Texto texto = new Texto();
                texto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                texto.setVisible(true);

                setVisible(false);

            }
        });
    }
}


