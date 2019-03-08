
package model.services;

import java.util.ArrayList;
import model.bean.Cliente;

public class ClienteService extends Cliente{
    private ArrayList<Cliente> cliente = new ArrayList();
    
    public void salvarCliente(Cliente cliente){
        this.cliente.add(cliente);
        super.clienteCont+=1;
    }
    
    public Cliente buscaCliente(int id){
        
        for(Cliente c : this.cliente){
            if(c.getIDCliente() == id){
                return c;
            }
        }
        return null;
    }
     
}
