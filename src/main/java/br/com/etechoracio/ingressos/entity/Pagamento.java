package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.StatusPagamentoEnum;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {
    private Long id;
    private Double valor;
    private Pedido pedido;
    private FormaPagamento formaPagamento;
    private DadosPagamento pagamento;
    private StatusPagamentoEnum status;
}