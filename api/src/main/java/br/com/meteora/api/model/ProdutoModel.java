package br.com.meteora.api.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProdutoModel {

    private int id;
    private String nome;
    private  String tamanho;
    private String modelo;
    private  String descrição;
    private double preço;
    private String cor;
    private String fabricante;
}
