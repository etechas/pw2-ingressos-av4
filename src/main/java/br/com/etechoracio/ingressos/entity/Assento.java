package br.com.etechoracio.ingressos.entity;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Assento {
    private Integer id;
    private String fileira;
    private Integer posicao;
    private Sala sala;
}