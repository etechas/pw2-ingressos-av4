package br.com.etechoracio.ingressos.entity;

import lombok.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Builder
@Getter
@Setter
@AllArgsConstructor

public class Sessao {
    private Integer id;
    private LocalDateTime data;
    private LocalTime horario;
    private double preco;
    private Sala sala;
    private Filme filme;
}
