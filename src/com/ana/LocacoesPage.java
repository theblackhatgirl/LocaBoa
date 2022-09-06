package com.ana;

public class LocacoesPage {
    public static void show(){

        System.out.println("*LOCACOES*");

        for (Locacao locacao : Database.locacoes){
            System.out.println("["+locacao.idFilme+"] - "+locacao.cliente.nome);
        }

        System.out.println("Digite o ID para mais detalhes: ");
        int id = Integer.parseInt(Main.scanner.nextLine());

        Locacao locacaoSelecionada = null;
        for (Locacao locacao : Database.locacoes){
            if (id == locacao.idFilme){
                locacaoSelecionada = locacao;
                break;
            }
        }
        if (locacaoSelecionada != null){
            DevolucaoPage.show(locacaoSelecionada);
        }
    }
}
