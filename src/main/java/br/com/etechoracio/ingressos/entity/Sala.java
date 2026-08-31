package br.com.etechoracio.ingressos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Sala {
    private Long id;
    private String nome;
    private Double preco;
    private LocalDate dataExclusao;
}