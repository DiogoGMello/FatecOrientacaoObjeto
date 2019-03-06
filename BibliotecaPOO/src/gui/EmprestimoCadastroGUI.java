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

public class EmprestimoCadastroGUI extends JFrame implements ActionListener{
    
    private JFrame frame;
    
    private JButton btnSalvar = new JButton("Salvar");
    private JButton btnSair = new JButton("Sair");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnBuscar = new JButton("Buscar");
    private JButton btnDataHoje = new JButton("Hoje");
    private JButton btnPesquisarCliente = new JButton("Pesq Cliente");
    private JButton btnPesqPrimExemplar = new JButton("Pesq Exemplar 1");
    private JButton btnPesqSegExemplar = new JButton("Pesq Exemplar 2");
    private JButton btnPesqTercExemplar = new JButton("Pesq Exemplar 3");
    private JButton btnGerarDataAtual = new JButton("Data Atual");
    private JButton btnGerarDevolucao = new JButton("Confirmar Devolução");
        
    private JLabel lblTitulo = new JLabel("Cadastro Emprestimo");
    
    private JLabel lblID = new JLabel("ID");
    private JLabel lblDtEmprestimo = new JLabel("Data Emprestimo");
    private JLabel lblDtDevPrevista = new JLabel("Devolução Prevista");
    private JLabel lblDtDevEfetiva = new JLabel("Devolução Efetiva");
    private JLabel lblStatus = new JLabel("Status");
    private JLabel lblPrimeiroExemplar = new JLabel("1º Exemplar");
    private JLabel lblSegundoExemplar = new JLabel("2º Exemplar");
    private JLabel lblTerceiroExemplar = new JLabel("3º Exemplar");
    private JLabel lblCliente = new JLabel("Cliente");
    
    private JTextField txtID = new JTextField("---");
    private JTextField txtDtEmprestimo = new JTextField();
    private JTextField txtDtDevPrevista = new JTextField();
    private JTextField txtDtDevEfetiva = new JTextField();
    private JTextField txtStatus = new JTextField("ATIVO");
    private JTextField txtIDPrimeiroExemplar = new JTextField();
    private JTextField txtTituloPrimeiroExemplar = new JTextField();
    private JTextField txtIDSegundoExemplar = new JTextField();
    private JTextField txtTituloSegundoExemplar = new JTextField();
    private JTextField txtIDTerceiroExemplar = new JTextField();
    private JTextField txtTituloTerceiroExemplar = new JTextField();
    private JTextField txtIDCliente = new JTextField();
    private JTextField txtNomeCliente = new JTextField();
    private JTextField txtSitacaoEmprestimo = new JTextField("EM DIA");
    
    @Override
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if("Sair".equals(cmd)){
            new TelaInicial().setVisible(true);
            dispose();
        }else if("Salvar".equals(cmd)){
            
        }else if("Limpar".equals(cmd)){
            
        }else if("Buscar".equals(cmd)){
            
        }else if("Hoje".equals(cmd)){
            
        }else if("Pes Cliente".equals(cmd)){
            
        }else if("Pesq Exemplar 1".equals(cmd)){
            
        }else if("Pesq Exemplar 2".equals(cmd)){
            
        }else if("Pesq Exemplar 3".equals(cmd)){
            
        }else if("Data Atual".equals(cmd)){
            
        }else if("Confirmar Devolução".equals(cmd)){
            
        }
    }
    
    public EmprestimoCadastroGUI() {
        super("SGB - BIBLIO.TEC 0.1");
        //frame = new JFrame("Exemplar Cliente");
        
        btnSalvar.addActionListener(this);
        btnSair.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnDataHoje.addActionListener(this);
        btnPesquisarCliente.addActionListener(this);
        btnPesqPrimExemplar.addActionListener(this);
        btnPesqSegExemplar.addActionListener(this);
        btnGerarDataAtual.addActionListener(this);
        btnGerarDevolucao.addActionListener(this);
        
        Container contPrincipal = getContentPane();
        
        Container northTittlePane = new JPanel();
        Container westLabelPane = new JPanel();
        Container centerTxtPane = new JPanel();
        Container southBtnPane = new JPanel();
        
        Container txtPaneA = new JPanel();
        Container txtPaneB = new JPanel();
        Container txtPaneC = new JPanel();
        Container txtPaneD = new JPanel();
        Container txtPaneE = new JPanel();
        Container txtPaneF = new JPanel();
        Container txtPaneG = new JPanel();
        Container txtPaneH = new JPanel();
        Container txtPaneI = new JPanel();
        
        contPrincipal.setLayout(new BorderLayout(50, 10));
        
        txtPaneA.setLayout(new FlowLayout());
        txtPaneB.setLayout(new GridLayout(1,3));
        txtPaneC.setLayout(new GridLayout(1,3));
        txtPaneD.setLayout(new GridLayout(1,3));
        txtPaneE.setLayout(new GridLayout(1,3));
        txtPaneF.setLayout(new GridLayout(1,2));
        txtPaneG.setLayout(new GridLayout(1,2));
        txtPaneH.setLayout(new GridLayout(1,2));
        txtPaneI.setLayout(new FlowLayout());
        
        northTittlePane.setLayout(new FlowLayout());
        westLabelPane.setLayout(new GridLayout(9,1));
        centerTxtPane.setLayout(new GridLayout(9,1));
        southBtnPane.setLayout(new FlowLayout());
        
        txtPaneA.add(txtID);
        
        txtPaneB.add(txtIDCliente);
        txtPaneB.add(txtNomeCliente);
        txtPaneB.add(btnPesquisarCliente);
        txtPaneC.add(txtIDPrimeiroExemplar);
        txtPaneC.add(txtTituloPrimeiroExemplar);
        txtPaneC.add(btnPesqPrimExemplar);
        txtPaneD.add(txtIDSegundoExemplar);
        txtPaneD.add(txtTituloSegundoExemplar);
        txtPaneD.add(btnPesqSegExemplar);
        txtPaneE.add(txtIDTerceiroExemplar);
        txtPaneE.add(txtTituloTerceiroExemplar);
        txtPaneE.add(btnPesqTercExemplar);
        
        txtPaneF.add(txtDtEmprestimo);
        txtPaneF.add(btnGerarDataAtual);
        txtPaneG.add(txtDtDevPrevista);
        txtPaneG.add(txtSitacaoEmprestimo);
        txtPaneH.add(txtDtDevEfetiva);
        txtPaneH.add(btnGerarDevolucao);
        
        txtPaneI.add(txtStatus);
        
        northTittlePane.add(lblTitulo);
        
        westLabelPane.add(lblID);
        westLabelPane.add(lblCliente);
        westLabelPane.add(lblPrimeiroExemplar);
        westLabelPane.add(lblSegundoExemplar);
        westLabelPane.add(lblTerceiroExemplar);
        westLabelPane.add(lblDtEmprestimo);
        westLabelPane.add(lblDtDevPrevista);
        westLabelPane.add(lblDtDevEfetiva);
        westLabelPane.add(lblStatus);
        
        centerTxtPane.add(txtPaneA);
        centerTxtPane.add(txtPaneB);
        centerTxtPane.add(txtPaneC);
        centerTxtPane.add(txtPaneD);
        centerTxtPane.add(txtPaneE);
        centerTxtPane.add(txtPaneF);
        centerTxtPane.add(txtPaneG);
        centerTxtPane.add(txtPaneH);
        centerTxtPane.add(txtPaneI);
        
        southBtnPane.add(btnSalvar);
        southBtnPane.add(btnBuscar);
        southBtnPane.add(btnLimpar);
        southBtnPane.add(btnSair);
        
        contPrincipal.add(BorderLayout.NORTH, northTittlePane);
        contPrincipal.add(BorderLayout.WEST, westLabelPane);
        contPrincipal.add(BorderLayout.CENTER, centerTxtPane);
        contPrincipal.add(BorderLayout.SOUTH, southBtnPane);
        
        JFrame frame = new JFrame("Cadastro Emprestimos");
        
        setSize(480, 360);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
