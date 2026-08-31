package br.com.etechoracio.ingressos.entity;

import lombok.*;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor

public class Sala {
    private Integer id;
    private String nome;
    private double preco;
}
