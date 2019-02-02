
package model.bean;

import java.sql.Date;

public class Livro {
    private int idLivro;
    private String titulo;
    private String editora;
    private String subTitulo;
    private Date anoEdicao;
    private int edicao;
    
    public Livro(){
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
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
