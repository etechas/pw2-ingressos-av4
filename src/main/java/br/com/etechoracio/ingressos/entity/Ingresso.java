package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.TipoIngressoEnum;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor

public class Ingresso {
    private Integer id;
    private Double preco;
    private TipoIngressoEnum tipoIngresso;
    private Sessao sessao;
    private Assento assento;
}
