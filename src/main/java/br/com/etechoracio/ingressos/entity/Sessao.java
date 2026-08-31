package br.com.etechoracio.ingressos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
@Builder
@Getter
@Setter
@AllArgsConstructor

public class Sessao{
    private int id;
    private LocalDate data;
    private LocalTime horario;
    private double preco;
    private Filme filme;
    private Sala sala;
}
