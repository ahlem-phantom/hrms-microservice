package pl.piomin.microservices.position.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piomin.microservices.position.model.Position;
import pl.piomin.microservices.position.repository.PositionRepository;
import pl.piomin.microservices.position.exceptions.CustomerNotFoundException;

@Service
public class PositionServiceImpl implements PositionService{

    @Autowired
	private PositionRepository positionRepository;

    
    @Override
    public Position createPosition(Position position) {
       return this.positionRepository.save(position);
    }

    @Override
    public Position updatePosition(Position position) throws CustomerNotFoundException {
        Position c = this.positionRepository.findOne(position.getId());
			this.positionRepository.save(position);
			return c;  
    }

    @Override
    public List<Position> getAllPositions() {
       return this.positionRepository.findAll();
    }

    @Override
    public Position getPositionById(int id) {
        return this.positionRepository.findOne(id);
    }

    @Override
    public String deletePosition(int id) {
        Position  position =this.positionRepository.findOne(id);
        this.positionRepository.delete(position);
        return "Position deleted successfully";
        
    }
    
}
