package edu.infnet.carros.controller;

import edu.infnet.carros.model.Carro;
import edu.infnet.carros.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarroService service;

    @GetMapping
    public Flux<Carro> getAllCarros() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Carro> getCarroById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Carro> createCarro(@RequestBody Carro carro) {
        return service.save(carro);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteCarro(@PathVariable Long id) {
        return service.deleteById(id);
    }
}