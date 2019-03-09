
package model.bean;

public class Cliente {
    
    //protected static int clienteCont = 1;
    
    private int IDCliente;
    private String nome;
    private String endereco;
    private String numeroTelefone;
    private boolean statusAssinatura;

    public Cliente(){
    }
        
    public boolean isStatusAssinatura() {
        return statusAssinatura;
    }

    public void setStatusAssinatura(boolean statusAssinatura) {
        this.statusAssinatura = statusAssinatura;
    }

//    public static int getClienteCont() {
//        return clienteCont;
//    }
//
//    public static void setClienteCont(int clienteCont) {
//        Cliente.clienteCont = clienteCont;
//    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
}
