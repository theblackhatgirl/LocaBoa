package com.ana;

public class HomePage {

    public static void show(){

        while(true){
            System.out.println("***LocaBoa***");
            System.out.println("[1] Catalogo");
            System.out.println("[2] Novo Filme");
            System.out.println("[3] Nova Locacao");
            System.out.println("[4] Locacoes");
            System.out.println("[5] Sair");

            String opcao = Main.scanner.nextLine();
            switch (opcao){
                case "1" -> CatalogoPage.show();
                case "2" -> NovoFilmePage.show();
                case "3" -> NovaLocacaoPage.show();
                case "4" -> LocacoesPage.show();
                case "5" -> {
                    return;
                }
            }
        }
    }
}
