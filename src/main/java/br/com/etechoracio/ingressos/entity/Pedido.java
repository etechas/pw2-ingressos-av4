package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.StatusPedidoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
public class Pedido {
    private Integer id;
    private LocalDateTime dataCriacao;
    private StatusPedidoEnum statusPedido;
    private Ingresso ingresso;
}
