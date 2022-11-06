package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO implements DAO{
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "325", 345345));
        cars.add(new Car("Audi", "A8", 2345345));
        cars.add(new Car("Seat", "Leon", 12679623));
        cars.add(new Car("Lada", "Granta", 237685));
        cars.add(new Car("LandRover", "RangeRover", 1234123));
    }

    @Override
    public List<Car> getCars(){
        return cars;
    }
    @Override
    public void save(Car car) {
        cars.add(car);
    }

}
