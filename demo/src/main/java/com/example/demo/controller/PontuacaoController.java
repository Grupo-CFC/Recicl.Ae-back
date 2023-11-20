package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Pontuacao;

import java.util.List;

@RestController
@RequestMapping("/api/Pontuação")
public class PontuacaoController {

    Pontuacao pontuacao = new Pontuacao();
    public Pontuacao obterPontuacao(@RequestParam Long ra, @RequestParam int peso) {
        pontuacao.setRa(ra);
        pontuacao.setPeso(peso);
        pontuacao.setPontos(calculaPontuacao(peso));
        return pontuacao;
    }

    private int calculaPontuacao(int peso) {
        return peso;
    }
}
/* 
    @Autowired
    private ReciclePageRepository reciclePageRepository;

    @GetMapping
    public List<Item> obterTodos() {
        return reciclePageRepository.findAll();
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable(value = "id") Long itemId) {
        return itemRepository.findById(itemId).orElseThrow(() -> new ResourceNotFoundException("Item", "id", itemId));
    }

    @PutMapping("/{id}")
    public Item updateItem(@PathVariable(value = "id") Long itemId, @RequestBody Item itemDetails) {
        return itemRepository.findById(itemId).map(item -> {
            item.setName(itemDetails.getName());
            item.setCategory(itemDetails.getCategory());
            return itemRepository.save(item);
        }).orElseThrow(() -> new ResourceNotFoundException("Item", "id", itemId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable(value = "id") Long itemId) {
        return itemRepository.findById(itemId).map(item -> {
            itemRepository.delete(item);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new Resource());
    }*/
