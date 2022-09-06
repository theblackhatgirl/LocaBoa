package com.ana;

public class CatalogoPage {
    public static void show(){
        System.out.println("*CATALOGO*");

        for (Filme filme: Database.filmes){

            System.out.println("["+filme.id+"] - "+filme.nome);
        }

        System.out.println("Digite o ID do filme para mais detalhes: ");
        int id = Integer.parseInt(Main.scanner.nextLine());

        Filme filmeSelecionado = null;
        for (Filme filme : Database.filmes){
            if(id == filme.id){
                filmeSelecionado = filme;
                break;
            }
        }
        if (filmeSelecionado != null){
            DetalheFilmePage.show(filmeSelecionado);
        }
    }
}
