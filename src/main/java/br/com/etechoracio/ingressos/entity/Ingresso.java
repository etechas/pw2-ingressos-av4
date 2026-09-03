package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.TipoIngressoEnum;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {

    private Integer id;
    private Double preco;
    private TipoIngressoEnum tipo;

    private Sessao sessao;
    private Assento assento;
}