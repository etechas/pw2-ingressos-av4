package br.com.etechoracio.ingressos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
@Getter
@Setter
@AllArgsConstructor
public class Sessao {
    private Integer id;
    private LocalDate data;
    private LocalTime horario;
    private double preco;
    private Filme filme;
    private Sala sala;
}
