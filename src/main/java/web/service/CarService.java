package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDaoImp;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarService implements CarServiceImp {
    @Autowired
    private CarDaoImp carDAOImp;

    @Override
    public List<Car> getCars(int size) {
        if (size >= 5) {
            return carDAOImp.getCars();
        } else {
            return  carDAOImp.getCars().stream().limit(size).collect(Collectors.toList());
        }
    }

    @Override
    public void save(Car car) {
        carDAOImp.save(car);
    }
}
