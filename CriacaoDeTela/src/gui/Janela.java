package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {

    public Janela() {

        JFrame frame = new JFrame();
        JButton botao = new JButton();
        getContentPane().add(botao); //ele adiciona o botão ao frame
        setSize(480, 360);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Janela();
    }
}
