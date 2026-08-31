package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.TipoIngressoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Ingresso {
    private Integer id;
    private double preco;
    private Sessao sessao;
    private Assento assento;
    private TipoIngressoEnum tipoIngresso;
}
