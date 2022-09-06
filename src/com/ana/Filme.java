package com.ana;

import java.time.LocalDate;

public class Filme {

    public int id;
    public String nome;
    public String genero;
    public LocalDate data;
    public String sinopse;

    public Filme(int id, String nome, String genero, LocalDate data, String sinopse){
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.data = data;
        this.sinopse = sinopse;

    }
}
