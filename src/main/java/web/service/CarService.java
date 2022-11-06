package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarService implements Service{
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> getCars(int size) {
        if (size >= 5) {
            return carDAO.getCars();
        } else {
            return  carDAO.getCars().stream().limit(size).collect(Collectors.toList());
        }
    }

    @Override
    public void save(Car car) {
        carDAO.save(car);
    }
}
