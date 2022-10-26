package pl.piomin.microservices.position.service;
import java.util.List;
import pl.piomin.microservices.position.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.position.model.Position;

public interface PositionService {
	Position createPosition(Position position);

	Position updatePosition(Position position) throws CustomerNotFoundException;

	List<Position> getAllPositions();

	Position getPositionById(int id);

	String deletePosition(int id);

    
}
