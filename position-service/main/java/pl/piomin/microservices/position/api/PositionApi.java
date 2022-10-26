package pl.piomin.microservices.recruitement.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.piomin.microservices.position.exceptions.CustomerNotFoundException;
import pl.piomin.microservices.position.model.Position;
import pl.piomin.microservices.position.service.PositionServiceImpl;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@Slf4j
public class PositionApi {

    @Autowired
	private PositionServiceImpl positionService;


    @RequestMapping(method = RequestMethod.GET, value = "/get-all-positions")
    public List<Position> findAll() {
        return positionService.getAllPositions();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Position findById(@PathVariable("id") Integer id) throws CustomerNotFoundException {
        Position position = positionService.getPositionById(id);
        return position;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create-position")
    public Position createNewPosition(@RequestBody Position position) {
        Position p = positionService.createPosition(position);
        return p;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete-position/{id}")
    public boolean deletePosition(@PathVariable Integer id) {
        positionService.deletePosition(id);
        return true;
    }

}
