package br.com.etechoracio.ingressos.entity;

import lombok.*;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor

public class Assento {
    private Integer id;
    private String fileira;
    private Integer posicao;
    private Sala sala;
}
