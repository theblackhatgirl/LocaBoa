package com.ana;

public class DetalheFilmePage {
    public static void show(Filme filme){
        System.out.println("*"+filme.nome+"*");
        System.out.println("ID: "+filme.id);
        System.out.println("Genero: "+filme.genero);
        System.out.println("Lancamento: "+filme.data);
        System.out.println("Sinopse: "+filme.sinopse);
        System.out.println("Digite Enter para voltar ao menu. ");
        Main.scanner.nextLine();
    }
}
