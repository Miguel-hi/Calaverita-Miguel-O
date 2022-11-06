package calaverita;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Texto extends JFrame {

    private JPanel panel;

    public Texto() {

        this.setSize(550, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("<<<<Calaverita Literaria>>>>");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Iniciar();
    }

    private void Iniciar() {

        Panel();
        Fondo();
        //TextoCalaverita();
    }

    private void Panel() {

        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

    }

    public void Fondo() {

        JLabel etiqueta2 = new JLabel();
        ImageIcon imagen = new ImageIcon("Texto.png");

        panel.add(etiqueta2);//agregar el panel a la etiqueta dos
        etiqueta2.setBounds(15, 10, 500, 540);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

    }

    /*  private void TextoCalaverita(){
        JTextArea calavera = new JTextArea();
        calavera.setBounds(65, 100, 400, 325);
        calavera.setBackground(Color.blue);
        calavera.setForeground(Color.white);
        calavera.setFont(new Font("Abadi Extra Light", Font.PLAIN, 18));
        calavera.setText("\nEstaba Raul en las clases a distancia" + "\nEstudiando ecuaciones y estudiando desde casa");
        
        calavera.append("\n\nLa maestra explicaba y Raul se dormía" + " \nYa que por las noches jugando se distraía");
        calavera.append("\n\nLa huesuda enojada a Raul le decía" + "\nSi te duermes en la clase al panteón te llevaría");
        calavera.append("\n\nRaul no hizo caso y en la clase se durmio" + "\nY la calaca canija al panteón se lo llevo.");
        calavera.setEditable(false); //Editar el area de texto
        panel.add(calavera);
    } */
}
