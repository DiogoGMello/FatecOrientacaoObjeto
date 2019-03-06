package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemplarCadastroGUI extends JFrame implements ActionListener{
    private JFrame frame;

    private JLabel lblTituloPag = new JLabel("Cadastro - Exemplar");
    
    private JLabel lblLivroTitulo = new JLabel("Titulo Livro");
    private JLabel lblID = new JLabel("ID");
    private JLabel lblAnoExemplar = new JLabel("Ano Aquisição");
    private JLabel lblNumSerie = new JLabel("Numero de Serie");
    private JLabel lblStatus = new JLabel("Status");
    
    private JTextField txtID = new JTextField("-----");
    private JTextField txtLivroTitulo = new JTextField();
    private JTextField txtAnoExemplar = new JTextField();
    private JTextField txtNumSerie = new JTextField();
    private JTextField txtStatus = new JTextField();
    
    private JButton btnSalvar = new JButton("Salvar");
    private JButton btnBuscar = new JButton("Buscar");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnSair = new JButton("Sair");
    
    @Override
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if("Sair".equals(cmd)){
            new TelaInicial().setVisible(true);
            dispose();
        }else if("Salvar".equals(cmd)){
            
        }else if("Limpar".equals(cmd)){
            
        }else if("Buscar".equals(cmd)){
            
        }
    }
    
    public ExemplarCadastroGUI() {
        super("SGB - BIBLIO.TEC 0.1");
        
        btnSalvar.addActionListener(this);
        btnSair.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnLimpar.addActionListener(this);
                
        Container conPrincipal = getContentPane();
        
        Container contSuperior = new JPanel();
        Container contEsquerdo = new JPanel();
        Container contCentral = new JPanel();
        Container contInferior = new JPanel();
        
        conPrincipal.setLayout(new BorderLayout(50,10));
        
        contSuperior.setLayout(new FlowLayout());
        contEsquerdo.setLayout(new GridLayout(5,1));
        contCentral.setLayout(new GridLayout(5,1));
        contInferior.setLayout(new FlowLayout());
        
        contSuperior.add(lblTituloPag);
        
        contEsquerdo.add(lblID);
        contEsquerdo.add(lblLivroTitulo);
        contEsquerdo.add(lblNumSerie);
        contEsquerdo.add(lblAnoExemplar);
        contEsquerdo.add(lblStatus);
        
        contCentral.add(txtID);
        contCentral.add(txtLivroTitulo);
        contCentral.add(txtNumSerie);
        contCentral.add(txtAnoExemplar);
        contCentral.add(txtStatus);
        
        contInferior.add(btnSalvar);
        contInferior.add(btnBuscar);
        contInferior.add(btnLimpar);
        contInferior.add(btnSair);
        
        conPrincipal.add(BorderLayout.NORTH, contSuperior);
        conPrincipal.add(BorderLayout.CENTER,  contCentral);
        conPrincipal.add(BorderLayout.WEST, contEsquerdo);
        conPrincipal.add(BorderLayout.SOUTH, contInferior);
        
        JFrame frame = new JFrame("Exemplares");
        
        setSize(480,360);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
