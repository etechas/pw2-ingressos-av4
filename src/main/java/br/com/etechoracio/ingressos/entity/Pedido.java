package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.StatusPedidoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Builder
@Getter
@Setter
@AllArgsConstructor
public class Pedido {
   private int id;
   private LocalDateTime dataCriacao;
   private StatusPedidoEnum status;
   private Ingresso ingresso;
}
