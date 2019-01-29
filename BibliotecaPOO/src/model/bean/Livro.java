
package model.bean;

import java.sql.Date;

public class Livro {
    private int IDLivro;
    private String titulo;
    private String editora;
    private String subTitulo;
    private Date anoEdicao;
    private int edicao;
    
    public Livro(){
    }

    public int getIDLivro() {
        return IDLivro;
    }

    public void setIDLivro(int IDLivro) {
        this.IDLivro = IDLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public Date getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(Date anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
    
}
