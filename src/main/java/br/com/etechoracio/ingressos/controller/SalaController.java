package br.com.etechoracio.ingressos.controller;

import br.com.etechoracio.ingressos.entity.Sala;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SalaController {

    private List<Long> idsExistentes = new ArrayList<>(List.of(1L, 2L, 3L, 4L, 5L));

    private Long gerarIdAleatorio() {
        return new Random().nextLong(5) + 1;
    }

    // Implementação do seu código
    @PostMapping
    public ResponseEntity<Sala> cadastrar(@RequestBody Sala sala) {
        if (sala.getNome() == null || sala.getNome().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        if (sala.getPreco() == null || sala.getPreco() <= 0) {
            return ResponseEntity.badRequest().build();
        }

        sala.setId(gerarIdAleatorio());
        return ResponseEntity.status(HttpStatus.CREATED).body(sala);
    }

    // b) Listagem de salas (GET)
    @GetMapping
    public ResponseEntity<List<Sala>> listar() {
        Sala sala1 = Sala.builder().id(1L).nome("Sala 01 IMAX").preco(35.0).build();
        Sala sala2 = Sala.builder().id(2L).nome("Sala 02 3D").preco(28.0).build();

        return ResponseEntity.ok(List.of(sala1, sala2));
    }

    // c) Busca de sala por ID (GET)
    @GetMapping("/{id}")
    public ResponseEntity<Sala> buscarPorId(@PathVariable Long id) {
        if (idsExistentes.contains(id)) {
            Sala sala = Sala.builder()
                    .id(id)
                    .nome("Sala VIP " + id)
                    .preco(45.0)
                    .build();
            return ResponseEntity.ok(sala);
        }
        return ResponseEntity.notFound().build();
    }

    // d) Atualização de sala por ID (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Sala> atualizar(@PathVariable Long id, @RequestBody Sala sala) {
        if (!idsExistentes.contains(id)) {
            return ResponseEntity.notFound().build();
        }
        if (sala.getNome() == null || sala.getNome().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        if (sala.getPreco() == null || sala.getPreco() <= 0) {
            return ResponseEntity.badRequest().build();
        }

        sala.setId(id);
        return ResponseEntity.ok(sala);
    }

    // e) Exclusão lógica de sala por ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!idsExistentes.contains(id)) {
            return ResponseEntity.notFound().build();
        }

        Sala sala = Sala.builder()
                .id(id)
                .nome("Sala " + id)
                .preco(30.0)
                .dataExclusao(LocalDateTime.now())
                .build();

        return ResponseEntity.ok().build();
    }


}
