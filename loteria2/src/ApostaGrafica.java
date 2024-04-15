import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class ApostaGrafica extends JFrame {

    JFrame jframe = new JFrame("Loto Fácil");
    JPanel panel = new JPanel();

    JButton buttonAposta1 = new JButton("Aposta de 0 à 100");
    JButton buttonAposta2 = new JButton("Aposta de  A à Z");
    JButton buttonAposta3 = new JButton("Aposta Par ou Impar");



    public ApostaGrafica() {

        //configurarComponetes();

        jframe.setSize(800, 500);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jframe.setVisible(true);
    }

    public void configurarComponentes(){
        Dimension dimen = new Dimension(150, 40);
        buttonAposta1.setPreferredSize(dimen);
        buttonAposta2.setPreferredSize(dimen);
        buttonAposta3.setPreferredSize(dimen);

        buttonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        buttonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ;
            }
        });

        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        panel.add(buttonAposta1);
        panel.add(buttonAposta2);
        panel.add(buttonAposta3);
        this.getContentPane().add(panel);
        jframe.add(panel);
    }

    public static void main(String[] args) {
        new ApostaGrafica();
    }

    }








