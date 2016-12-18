/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jexkmzww
 */
public class Movies {
    
    private static final List<Movie> moviesList = new ArrayList();
    
    public static Movie get (int index){
        return moviesList.get(index);
    }
    
    static {
        moviesList.add(new Movie("25/02/2008","Douglas", "Livre", "Ação", "Americana", "PT-BR, EN-USA", "fastNFurious.jpg", 20.00, "Velozes e Furiosos 8"));
        moviesList.add(new Movie("18/05/2000","André", "15-17 anos", "Ação", "Inglesa", "PT-BR, EN-USA", "123horas.jpg", 30.00, "127 horas"));
        moviesList.add(new Movie("01/01/2009","Frederico", "Livre", "Comédia", "Indiano", "PT-BR, EN-USA", "meuNomeNaoEJohnny.jpg", 50.00, "Meu nome não é Johnny"));
        moviesList.add(new Movie("13/08/2014","Amanda", "18+ anos", "Terror", "Americana", "PT-BR, EN-USA", "aHospedeira.jpg", 15.00, "A hospedeira"));
        moviesList.add(new Movie("18/08/2016","Tomas", "Livre", "Ação", "Americana", "PT-BR, EN-USA", "starWars.jpg", 25.00, "Star Wars"));
        moviesList.add(new Movie("30/10/2015","Isadora", "Livre", "Ação", "Americana", "PT-BR, EN-USA", "theDarkKnight.jpg", 100.00, "Batman - The Dark Knight"));
    }
    
}
