package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.StatusPedidoEnum;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private Integer id;
    private LocalDateTime dataCriacao;
    private StatusPedidoEnum status;
    private List<Ingresso> ingressos;
}