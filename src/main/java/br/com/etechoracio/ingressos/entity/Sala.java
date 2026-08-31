package br.com.etechoracio.ingressos.entity;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
    private Integer id;
    private String nome;
    private Double preco;
}