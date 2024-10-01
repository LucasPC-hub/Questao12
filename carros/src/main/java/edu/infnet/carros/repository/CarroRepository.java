package edu.infnet.carros.repository;

import edu.infnet.carros.model.Carro;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends ReactiveCrudRepository<Carro, Long> {
}