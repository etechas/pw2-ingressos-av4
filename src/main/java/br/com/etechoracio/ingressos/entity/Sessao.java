package br.com.etechoracio.ingressos.entity;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sessao {
    private Integer id;
    private LocalDate data;
    private LocalTime horario;
    private Double preco;
    private Filme filme;
    private Sala sala;
}