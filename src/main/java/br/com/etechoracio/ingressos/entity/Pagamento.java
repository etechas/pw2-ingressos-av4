package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.StatusPagamentoEnum;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor

public class Pagamento {
    private Long id;
    private double valor;
    private StatusPagamentoEnum status;
    private StatusPagamentoEnum statusPagamento;
    private StatusPagamentoEnum pagamento;
    private FormaPagamento formaPagamento;
    private Pedido pedido;
}
