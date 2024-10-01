package edu.infnet.carros.service;

import edu.infnet.carros.model.Carro;
import edu.infnet.carros.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CarroService {
    @Autowired
    private CarroRepository repository;

    public Flux<Carro> findAll() {
        return repository.findAll();
    }

    public Mono<Carro> findById(Long id) {
        return repository.findById(id);
    }

    public Mono<Carro> save(Carro carro) {
        return repository.save(carro);
    }

    public Mono<Void> deleteById(Long id) {
        return repository.deleteById(id);
    }
}