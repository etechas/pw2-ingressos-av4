package br.com.etechoracio.ingressos.entity;

import br.com.etechoracio.ingressos.enums.CategoriaFilmeEnum;
import br.com.etechoracio.ingressos.enums.ClassificacaoIndicativaEnum;
import br.com.etechoracio.ingressos.enums.SimNaoEnum;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class Filme {
    private Long id;
    private String nome;
    private Integer duracao;
    private CategoriaFilmeEnum categoria;
    private ClassificacaoIndicativaEnum classificacao;
    private Integer ano;
    private String capa;
    private String diretor;
    private String elenco;
    private String descricao;
    private Double avaliacao;
    private SimNaoEnum emCartaz;
    private LocalDateTime dataExclusao;
}
