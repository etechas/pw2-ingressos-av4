package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.TipoFormaPagamentoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FormaPagamento {
    private Long id;
    private String nome;
    private TipoFormaPagamentoEnum formaPagamento;
}
