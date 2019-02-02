
package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LivroCadastroGUI extends JFrame{
    JFrame frame;
    
    private JButton btnSalvar = new JButton("Salvar");
    private JButton btnBuscar = new JButton("Buscar");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnSair = new JButton("Sair");
    
    private JLabel lblTituloPagina = new JLabel("Livro Cadastro");

    private JLabel lblIdLivro = new JLabel("ID");
    private JLabel lblTitulo = new JLabel("Titulo");
    private JLabel lblSubTitulo = new JLabel("SubTitulo");
    private JLabel lblEditora = new JLabel("Editora");
    private JLabel lblAnoEdicao = new JLabel("Ano de Edicao");
    private JLabel lblEdicao = new JLabel("Edicao");
    
    private JTextField txtId = new JTextField("------");
    private JTextField txtTitulo = new JTextField();
    private JTextField txtSubTitulo = new JTextField();
    private JTextField txtEditora = new JTextField();
    private JTextField txtAnoEdicao = new JTextField();
    private JTextField txtEdicao = new JTextField();
    
    public LivroCadastroGUI(){
        
        Container contPrincipal = getContentPane();
        
        Container contPageNorth = new JPanel();
        Container contPageWest = new JPanel();
        Container contPageCenter = new JPanel();
        Container contPageSouth = new JPanel();
        
        contPrincipal.setLayout(new BorderLayout(50,10));
        
        contPageNorth.setLayout(new FlowLayout());
        contPageWest.setLayout(new GridLayout(6,1));
        contPageCenter.setLayout(new GridLayout(6,1));
        contPageSouth.setLayout(new FlowLayout());
        
        contPageNorth.add(lblTituloPagina);
        
        contPageWest.add(lblIdLivro);
        contPageWest.add(lblTitulo);
        contPageWest.add(lblSubTitulo);
        contPageWest.add(lblEditora);
        contPageWest.add(lblEdicao);
        contPageWest.add(lblAnoEdicao);
        
        contPageCenter.add(txtId);
        contPageCenter.add(txtTitulo);
        contPageCenter.add(txtSubTitulo);
        contPageCenter.add(txtEditora);
        contPageCenter.add(txtEdicao);
        contPageCenter.add(txtAnoEdicao);
        
        contPageSouth.add(btnSalvar);
        contPageSouth.add(btnLimpar);
        contPageSouth.add(btnLimpar);
        contPageSouth.add(btnSair);
        
        contPrincipal.add(BorderLayout.NORTH, contPageNorth);
        contPrincipal.add(BorderLayout.WEST, contPageWest);
        contPrincipal.add(BorderLayout.CENTER, contPageCenter);
        contPrincipal.add(BorderLayout.SOUTH, contPageSouth);
        
        JFrame frame = new JFrame("Livros");
        
        setSize(480,360);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}