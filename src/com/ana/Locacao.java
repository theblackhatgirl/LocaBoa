package com.ana;

import java.time.LocalDate;

public class Locacao {
    public int idFilme;
    public Cliente cliente;
    public LocalDate dataDevolucao;
    public Boolean pago;
    public double preco;

    public Locacao(int idFilme, Cliente cliente, LocalDate dataDevolucao, Boolean pago, double preco){
        this.idFilme = idFilme;
        this.cliente = cliente;
        this.dataDevolucao = dataDevolucao;
        this.pago = pago;
        this.preco = preco;
    }

}
