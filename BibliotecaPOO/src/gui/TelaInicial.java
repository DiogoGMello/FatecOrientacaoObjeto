package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JFrame{
    private JFrame frame;
    
    private JButton btnEmprestimos = new JButton("Emprestmos");
    private JButton btnClientes = new JButton("Clientes");
    private JButton btnExemplares = new JButton("Exemplares");
    private JButton btnLivros = new JButton("Livros");
    private JButton btnExit = new JButton("Sair");
    
    private JLabel lblTitulo = new JLabel("Biblioteca XPTO");
    
    public TelaInicial() {
        super("SGB - BIBLIO.TEC 0.1");
        //frame = new JFrame("Tela Inicial");
        
        Container contPrincipal = getContentPane();
        Container panelBtnDireita = new JPanel();
        Container panelLblEsquerda = new JPanel();
        
        contPrincipal.setLayout(new BorderLayout(5,5));
        panelLblEsquerda.setLayout(new BorderLayout());
        panelBtnDireita.setLayout(new GridLayout(5,3));
        
        panelLblEsquerda.add(BorderLayout.CENTER, lblTitulo);
        
        panelBtnDireita.add(btnEmprestimos);
        panelBtnDireita.add(btnClientes);
        panelBtnDireita.add(btnExemplares);
        panelBtnDireita.add(btnLivros);
        panelBtnDireita.add(btnExit);
        
        contPrincipal.add(BorderLayout.CENTER, panelLblEsquerda);
        contPrincipal.add(BorderLayout.EAST, panelBtnDireita);
        
        JFrame frame = new JFrame("Inicial");
        
        setSize(480, 360);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
