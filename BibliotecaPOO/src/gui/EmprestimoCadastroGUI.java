package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmprestimoCadastroGUI extends JFrame{
    
    private JFrame frame;
    
    private JButton btnSalvar = new JButton("Salvar");
    private JButton btnSair = new JButton("Sair");
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnEncerrar = new JButton("Encerrar");
    private JButton btnBuscar = new JButton("Buscar");
    private JButton btnDataAtual = new JButton("Hoje");
    
    private JLabel lblID = new JLabel("ID");
    private JLabel lblDtEmprestimo = new JLabel("Data Emprestimo");
    private JLabel lblDtDevPrevista = new JLabel("Devolução Prevista");
    private JLabel lblDtDevEfetiva = new JLabel("Devolução Efetiva");
    private JLabel lblStatus = new JLabel("Status");
    private JLabel lblPrimeiroExemplar = new JLabel("1º Exemplar");
    private JLabel lblSegundoExemplar = new JLabel("2º Exemplar");
    private JLabel lblTerceiroExemplar = new JLabel("3º Exemplar");
    private JLabel lblCliente = new JLabel("Cliente");
    
    private JTextField txtID = new JTextField();
    private JTextField txtDtEmprestimo = new JTextField();
    private JTextField txtDtDevPrevista = new JTextField();
    private JTextField txtDtDevEfetiva = new JTextField();
    private JTextField txtStatus = new JTextField();
    private JTextField txtIDPrimeiroExemplar = new JTextField();
    private JTextField txtTituloPrimeiroExemplar = new JTextField();
    private JTextField txtIDSegundoExemplar = new JTextField();
    private JTextField txtTituloSegundoExemplar = new JTextField();
    private JTextField txtIDTerceiroExemplar = new JTextField();
    private JTextField txtTituloTerceiroExemplar = new JTextField();
    private JTextField txtIDCliente = new JTextField();
    private JTextField txtNomeCliente = new JTextField();
    
    public EmprestimoCadastroGUI() {
        
    }
}
