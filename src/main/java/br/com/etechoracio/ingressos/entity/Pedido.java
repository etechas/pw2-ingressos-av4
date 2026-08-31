package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.StatusPedidoEnum;
import lombok.*;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor

public class Pedido {
    private Integer id;
    private LocalDateTime dataCriacao;
    private StatusPedidoEnum pendente;
    private StatusPedidoEnum cancelado;
    private StatusPedidoEnum concluido;
    private Ingresso ingresso;

}
