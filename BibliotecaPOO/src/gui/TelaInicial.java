package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JFrame implements ActionListener{
    private JFrame frame;
    
    private JButton btnEmprestimos = new JButton("Emprestimos");
    private JButton btnClientes = new JButton("Clientes");
    private JButton btnExemplares = new JButton("Exemplares");
    private JButton btnLivros = new JButton("Livros");
    private JButton btnExit = new JButton("Sair");
    
    private JLabel lblTitulo = new JLabel("Biblioteca XPTO");
   
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if("Clientes".equals(cmd)){
            new ClienteCadastroGUI().setVisible(true);
            dispose();
        }else if("Emprestimos".equals(cmd)){
            new EmprestimoCadastroGUI().setVisible(true);
            dispose();
        }else if("Exemplares".equals(cmd)){
            new ExemplarCadastroGUI().setVisible(true);
            dispose();
        }else if("Livros".equals(cmd)){
            new LivroCadastroGUI().setVisible(true);
            dispose();
        }else if("Sair".equals(cmd)){
            dispose();
        }
    }
    
    public TelaInicial() {
        super("SGB - BIBLIO.TEC 0.1");
        //frame = new JFrame("Tela Inicial");
        
        btnEmprestimos.addActionListener(this);
        btnClientes.addActionListener(this);
        btnLivros.addActionListener(this);
        btnExemplares.addActionListener(this);
        btnExit.addActionListener(this);
        
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
