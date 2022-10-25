package pl.piomin.microservices.position.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import pl.piomin.microservices.position.model.Position;
import pl.piomin.microservices.position.service.PositionService;
import java.util.List;


@RestController
public class PositionController {

	@Autowired
	private PositionService positionService;
	
	@GetMapping("/positions")
	public ResponseEntity<List<Position>> getAllPosition(){
		return ResponseEntity.ok().body(positionService.getAllPosition());
	}
	
	@GetMapping("/positions/{id}")
	public ResponseEntity<Position> getPositionById(@PathVariable long id){
		return ResponseEntity.ok().body(positionService.getPositionById(id));
	}
	
	@PostMapping("/positions")
	public ResponseEntity<Position> createPosition(@RequestBody Position position){
		return ResponseEntity.ok().body(this.positionService.createPosition(position));
	}
	
	@PutMapping("/positions/{id}")
	public ResponseEntity<Position> updatePosition(@PathVariable Integer id, @RequestBody Position position){
		product.setId(id);
		return ResponseEntity.ok().body(this.positionService.updatePosition(position));
	}

	@DeleteMapping("/positions/{id}")
	public HttpStatus deletePosition(@PathVariable Integer id){
		this.productService.deletePosition(id);
		return HttpStatus.OK;
	}
}
