package br.com.etechoracio.ingressos.controller;

import br.com.etechoracio.ingressos.entity.Sala;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/salas1")
public class SalaController {

    private List<Long> idsExistentes = new ArrayList<>(
            List.of(1L, 2L, 3L, 4L, 5L)
    );

    private List<Sala> salas = new ArrayList<>(
            List.of(
                    Sala.builder()
                            .id(1L)
                            .nome("Sala 1")
                            .preco(35.00)
                            .dataExclusao(null)
                            .build(),

                    Sala.builder()
                            .id(2L)
                            .nome("Sala 2")
                            .preco(45.00)
                            .dataExclusao(null)
                            .build(),

                    Sala.builder()
                            .id(3L)
                            .nome("Sala 3")
                            .preco(50.00)
                            .dataExclusao(null)
                            .build(),

                    Sala.builder()
                            .id(4L)
                            .nome("Sala 4")
                            .preco(40.00)
                            .dataExclusao(null)
                            .build(),

                    Sala.builder()
                            .id(5L)
                            .nome("Sala 5")
                            .preco(55.00)
                            .dataExclusao(null)
                            .build()
            )
    );

    private Long gerarIdAleatorio() {

        Long id;

        do {
            id = new Random().nextLong(100) + 1;
        } while (idsExistentes.contains(id));

        return id;
    }

    // a) Inserção de uma sala
    @PostMapping
    public ResponseEntity<Sala> cadastrar(@RequestBody Sala sala) {

        if (sala.getNome() == null || sala.getNome().isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        if (sala.getPreco() <= 0) {
            return ResponseEntity.badRequest().build();
        }

        sala.setId(gerarIdAleatorio());

        idsExistentes.add(sala.getId());
        salas.add(sala);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(sala);
    }

    // b) Listagem de salas
    @GetMapping
    public ResponseEntity<List<Sala>> listar() {

        return ResponseEntity.ok(salas);
    }

    // c) Busca de sala por ID
    @GetMapping("/{id}")
    public ResponseEntity<Sala> buscarPorId(@PathVariable Long id) {

        if (!idsExistentes.contains(id)) {
            return ResponseEntity.notFound().build();
        }

        for (Sala sala : salas) {

            if (sala.getId().equals(id)) {
                return ResponseEntity.ok(sala);
            }
        }

        return ResponseEntity.notFound().build();
    }

    // d) Atualização de sala por ID
    @PutMapping("/{id}")
    public ResponseEntity<Sala> atualizar(
            @PathVariable Long id,
            @RequestBody Sala sala) {

        if (!idsExistentes.contains(id)) {
            return ResponseEntity.notFound().build();
        }

        if (sala.getNome() == null || sala.getNome().isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        if (sala.getPreco() <= 0) {
            return ResponseEntity.badRequest().build();
        }

        for (Sala salaExistente : salas) {

            if (salaExistente.getId().equals(id)) {

                sala.setId(id);
                salaExistente.setNome(sala.getNome());
                salaExistente.setPreco(sala.getPreco());

                return ResponseEntity.ok(salaExistente);
            }
        }

        return ResponseEntity.notFound().build();
    }

    // e) Exclusão lógica de sala
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {

        if (!idsExistentes.contains(id)) {
            return ResponseEntity.notFound().build();
        }

        for (Sala sala : salas) {

            if (sala.getId().equals(id)) {

                sala.setDataExclusao(LocalDate.now());

                return ResponseEntity.ok().build();
            }
        }

        return ResponseEntity.notFound().build();
    }
}