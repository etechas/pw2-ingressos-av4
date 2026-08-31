package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.StatusPagamentoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pagamento {
    private Long id;
    private double valor;
    private Pedido pedido;
    private FormaPagamento formaPagamento;
    private StatusPagamentoEnum statusPagamento;
}
