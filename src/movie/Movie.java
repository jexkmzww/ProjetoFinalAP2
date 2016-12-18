/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

/**
 *
 * @author jexkmzww
 */
public class Movie {
    
    private String dataLancamento;
    private String direcao;
    private String classificacao; 
    private String genero;
    private String nacionalidade;
    private String idioma;
    private String image;
    private double preco;
    private String nameMovie;

    public Movie(String dataLancamento, String direcao, String classificacao, String genero, String nacionalidade, String idioma, String image, double preco, String nameMovie) {
        this.dataLancamento = dataLancamento;
        this.direcao = direcao;
        this.classificacao = classificacao;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.idioma = idioma;
        this.image = image;
        this.preco = preco;
        this.nameMovie = nameMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }
    
    public double calculaPreco (boolean isPremiumUser){
        return isPremiumUser ? 0.8*preco : preco; 
    }    
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    
}
