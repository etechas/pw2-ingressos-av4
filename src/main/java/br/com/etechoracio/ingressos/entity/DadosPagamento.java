package br.com.etechoracio.ingressos.entity;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class DadosPagamento {
    private Long id;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Pagamento pagamento;
}

