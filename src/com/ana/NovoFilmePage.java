package com.ana;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NovoFilmePage {
    public static void show(){


        System.out.println("*NOVO FILME*");
        System.out.print("ID:");
        int id = Integer.parseInt(Main.scanner.nextLine());
        System.out.print("Nome do filme: ");
        String nome = Main.scanner.nextLine();
        System.out.print("Genero: ");
        String genero = Main.scanner.nextLine();
        System.out.print("Lancamento: ");
        LocalDate data = LocalDate.parse(Main.scanner.nextLine(), DateTimeFormatter.ofPattern("dd//MM/yyyy"));
        System.out.print("Sinopse: ");
        String sinopse = Main.scanner.nextLine();
        System.out.print("Digite enter para salvar e continuar. ");
        Main.scanner.nextLine();

        Filme filme = new Filme(id, nome, genero, data, sinopse);

        Database.filmes.add(filme);

    }
}
