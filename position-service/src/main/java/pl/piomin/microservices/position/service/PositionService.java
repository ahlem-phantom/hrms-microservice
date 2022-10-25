package pl.piomin.microservices.position.service;
import java.util.List;

import pl.piomin.microservices.position.model.Position;

public interface PositionService {
	Position createPosition(Position position);

	Position updatePosition(Position position);

	List<Position> getAllPosition();

	Position getPositionById(long positionId);

	void deletePosition(long positionId);
}
