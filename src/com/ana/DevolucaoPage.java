package com.ana;

public class DevolucaoPage {
    public static void show(Locacao locacao){

        System.out.println("*DEVOLUCAO*");
        System.out.println("ID do filme: "+locacao.idFilme);
        System.out.println("Cliente: "+locacao.cliente.nome);
        System.out.println("Telefone: "+locacao.cliente.telefone);
        System.out.println("Data de devolução: "+locacao.dataDevolucao);
        System.out.println("Pago? "+locacao.pago);
        System.out.println("Preco: "+locacao.preco);
        System.out.println("Está finalizando a locacao? ");
        String finalizando = Main.scanner.nextLine();
        if (finalizando.equals("sim")){
            locacao.pago = true;
        }
        System.out.println("Digite Enter para continuar. ");
        Main.scanner.nextLine();
    }

}
