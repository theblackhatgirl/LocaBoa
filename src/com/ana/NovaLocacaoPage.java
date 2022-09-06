package com.ana;

import java.time.LocalDate;

public class NovaLocacaoPage {
    public static void show(){

        System.out.println("*NOVA LOCACAO*");
        System.out.print("ID do filme: ");
        int idFilme = Integer.parseInt(Main.scanner.nextLine());
        System.out.print("Cliente: ");
        String nome = Main.scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = Main.scanner.nextLine();
        System.out.print("Pago? ");
        Boolean pago = Main.scanner.nextBoolean();
        System.out.print("Preco: ");
        double preco = Main.scanner.nextDouble();
        LocalDate dataDevolucao = LocalDate.now().plusDays(3);
        System.out.println("Digite Enter para salvar e continuar. ");
        Main.scanner.nextLine();

        Cliente cliente = new Cliente(nome, telefone);
        Locacao locacao = new Locacao(idFilme, cliente, dataDevolucao, pago, preco);


        Database.locacoes.add(locacao);

    }
}
