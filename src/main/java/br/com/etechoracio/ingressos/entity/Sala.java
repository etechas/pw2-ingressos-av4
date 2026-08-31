package br.com.etechoracio.ingressos.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sala {
    private Long id;
    private String nome;
    private Double preco;
    private LocalDateTime dataExclusao;
}