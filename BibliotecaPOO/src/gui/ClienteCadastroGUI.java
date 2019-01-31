package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClienteCadastroGUI extends JFrame{
    private JFrame frame;
    
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
    
    private JTextField txtIDCliente = new JTextField();
    private JTextField txtNome = new JTextField();
    private JTextField txtEndereco = new JTextField();
    private JTextField txtTelefone = new JTextField();
    private JLabel lblStatusResult = new JLabel("ATIVO");
    
    public ClienteCadastroGUI(){
        super("SGB - BIBLIO.TEC 0.1");
        frame = new JFrame("Cliente Cadastro");
        
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
        
        panelTxtBoxDireito.add(txtIDCliente);
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
