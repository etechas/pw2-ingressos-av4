package br.com.etechoracio.ingressos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SalaController {

    private List<Long> idsExistentes = new ArrayList<>(List.of(1L, 2L, 3L, 4L, 5L));

    private Long gerarIdAleatorio() {
        return new Random().nextLong(5) + 1;
    }

    // Implementação do seu código




}
