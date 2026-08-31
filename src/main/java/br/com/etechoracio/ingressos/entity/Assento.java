package br.com.etechoracio.ingressos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Assento {
    private Integer id;
    private String fileira;
    private Integer posicao;
    private Sala sala;
}
