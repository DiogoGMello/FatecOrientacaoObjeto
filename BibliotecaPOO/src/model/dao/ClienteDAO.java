package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Cliente;

public class ClienteDAO {
    private Connection con = null;
    
    public ClienteDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    //irá inserir um novo campo no banco de dados
    public boolean save(Cliente cliente){
        
        String sql = "INSERT INTO cliente (nome, endereco, telefone) VALUES (?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getNumeroTelefone());
            
            stmt.executeUpdate();
            
            return true;
            
        }catch (SQLException ex){
            
            System.err.println("Erro: " + ex);
            
            return false;
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    }
    
    //Irá atualizar o registro do cliente
    public boolean update(Cliente cliente){
        
        String sql = "UPDARE cliente SET nome = ?, endereco = ?, "
                + "telefone = ? WHERE cliente_ID = ?";
        
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getNumeroTelefone());
            stmt.setInt(4, cliente.getIDCliente());
            
            return true;
            
        }catch(SQLException ex){
            
            System.err.println("Error: "+ex);
            return false;
            
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        //Buscar todos os registros de cliente da tabela
        public List<Cliente> findAll(){
            
            String sql = "SELECT * FROM cliente";
            
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Cliente> cliente = new ArrayList<>();
            
            
        }
    }
    
    
}
