package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.TipoIngressoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Ingresso {
   private int id;
   private double preco;
   private Sessao sessao;
   private Assento assento;
   private TipoIngressoEnum tipo;
}
