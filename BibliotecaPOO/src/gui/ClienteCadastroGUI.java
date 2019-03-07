package gui;

import model.bean.Cliente;

import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.services.ClienteService;

public class ClienteCadastroGUI extends JFrame implements ActionListener{
    private JFrame frame;
    
    String id = Integer.toString(Cliente.getClienteCont());
            
    private JButton btnSalvar = new JButton("Salvar");
    private JButton btnBuscar = new JButton("Buscar");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnSair = new JButton("Sair");
    
    private JLabel lblTitulo = new JLabel("Cadastro Cliente");
    
    private JLabel lblIDCliente = new JLabel("Cliente ID");
    private JLabel lblNome = new JLabel("Nome");
    private JLabel lblEndereco = new JLabel("Endereço");
    private JLabel lblTelefone = new JLabel("Telefone");
    private JLabel lblStatus = new JLabel("Status");
    
    private JLabel lblIdCliente = new JLabel(id);
    private JTextField txtNome = new JTextField();
    private JTextField txtEndereco = new JTextField();
    private JTextField txtTelefone = new JTextField();
    private JLabel lblStatusResult = new JLabel("ATIVO");
    
    ClienteService clienteService = new ClienteService();
    Cliente cliente = new Cliente();

    @Override
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if("Sair".equals(cmd)){
            new TelaInicial().setVisible(true);
            dispose();
        }else if("Salvar".equals(cmd)){
            cliente.setIDCliente(Cliente.getClienteCont());
            cliente.setNome(txtNome.getText());
            cliente.setEndereco(txtEndereco.getText());
            cliente.setNumeroTelefone(txtTelefone.getText());
        }else if("Limpar".equals(cmd)){
            
        }else if("Buscar".equals(cmd)){
            
        }
    }
    
    public ClienteCadastroGUI(){
        super("SGB - BIBLIO.TEC 0.1");
        //frame = new JFrame("Cliente Cadastro");
        
        btnBuscar.addActionListener(this);
        btnSalvar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);
        btnBuscar.addActionListener(this);
        
        Container contPrincipal = getContentPane();
        Container panelLblSuperior = new JPanel();
        Container panelBtnInferior = new JPanel();
        Container panelLblEsquerdo = new JPanel();
        Container panelTxtBoxDireito = new JPanel();
        
        contPrincipal.setLayout(new BorderLayout(50,10));
        
        panelLblSuperior.setLayout(new FlowLayout());
        panelLblEsquerdo.setLayout(new GridLayout(5,1));
        panelTxtBoxDireito.setLayout(new GridLayout(5,1));
        panelBtnInferior.setLayout(new FlowLayout());
        
        panelLblSuperior.add(lblTitulo);
        
        panelBtnInferior.add(btnSalvar);
        panelBtnInferior.add(btnLimpar);
        panelBtnInferior.add(btnBuscar);
        panelBtnInferior.add(btnSair);
        
        panelLblEsquerdo.add(lblIDCliente);
        panelLblEsquerdo.add(lblNome);
        panelLblEsquerdo.add(lblEndereco);
        panelLblEsquerdo.add(lblTelefone);
        panelLblEsquerdo.add(lblStatus);
        
        panelTxtBoxDireito.add(lblIdCliente);
        panelTxtBoxDireito.add(txtNome);
        panelTxtBoxDireito.add(txtEndereco);
        panelTxtBoxDireito.add(txtTelefone);
        panelTxtBoxDireito.add(lblStatusResult);
        
        contPrincipal.add(BorderLayout.NORTH, panelLblSuperior);
        contPrincipal.add(BorderLayout.SOUTH, panelBtnInferior);
        contPrincipal.add(BorderLayout.WEST, panelLblEsquerdo);
        contPrincipal.add(BorderLayout.CENTER, panelTxtBoxDireito);
        
        JFrame frame = new JFrame("Cliente Cadastro");
        
        setSize(480, 360);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
