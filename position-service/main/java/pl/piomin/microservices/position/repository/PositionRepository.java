package pl.piomin.microservices.position.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.piomin.microservices.position.model.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {

}
