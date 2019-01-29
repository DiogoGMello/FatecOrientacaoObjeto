
package model.bean;

import java.sql.Date;

public class Exemplar {
    private int IDExemplar;
    private int livroID;
    private Date anoExemplar;
    private double numeroSerie;
    private boolean statusExemplar;
    
    public Exemplar(){
        
    }

    public int getIDExemplar() {
        return IDExemplar;
    }

    public void setIDExemplar(int IDExemplar) {
        this.IDExemplar = IDExemplar;
    }

    public int getLivroID() {
        return livroID;
    }

    public void setLivroID(int livroID) {
        this.livroID = livroID;
    }

    public Date getAnoExemplar() {
        return anoExemplar;
    }

    public void setAnoExemplar(Date anoExemplar) {
        this.anoExemplar = anoExemplar;
    }

    public double getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(double numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public boolean isStatusExemplar() {
        return statusExemplar;
    }

    public void setStatusExemplar(boolean statusExemplar) {
        this.statusExemplar = statusExemplar;
    }
    
    
}
