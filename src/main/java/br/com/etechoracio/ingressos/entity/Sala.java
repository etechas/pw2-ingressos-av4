package br.com.etechoracio.ingressos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Sala {
    private int id;
    private String nome;
    private double preco;
}
