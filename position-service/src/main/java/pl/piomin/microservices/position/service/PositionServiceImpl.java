package pl.piomin.microservices.position.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.piomin.microservices.position.exception.ResourceNotFoundException;
import pl.piomin.microservices.position.model.Position;
import pl.piomin.microservices.position.repository.PositionRepository;

@Service
@Transactional
public class PositionServiceImpl implements PositionService{

	
	@Autowired
	private PositionRepository positionRepository;
	
	
	@Override
	public Position createPosition(Position position) {
		return positionRepository.save(position);
	}

	@Override
	public Position updatePosition(Position position) {
		Optional<Position> positionDb = this.positionRepository.findById(position.getId());
		
		if(positionDb.isPresent()) {
			Position positionUpdate = positionDb.get();
			positionUpdate.setId(position.getId());
			positionUpdate.setDesignation(position.getDesignation());
			positionUpdate.setDepartmentName(position.getDepartmentName());
			positionUpdate.setStartDate(position.getStartDate());
			positionUpdate.setEndDate(position.getEndDate());
			positionUpdate.setEmployeeId(position.getEmployeeId());
			positionRepository.save(positionUpdate);
			return positionUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + position.getId());
		}		
	}

	@Override
	public List<Position> getAllPosition() {
		return this.positionRepository.findAll();
	}

	@Override
	public Position getPositionById(long positionId) {
		
		Optional<Position> positionDb = this.positionRepository.findById(positionId);
		
		if(positionDb.isPresent()) {
			return positionDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + positionId);
		}
	}

	@Override
	public void deletePosition(long positionId) {
		Optional<Position> positionDb = this.positionRepository.findById(positionId);
		
		if(positionDb.isPresent()) {
			this.positionRepository.delete(positionDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + positionId);
		}
		
	}

}
