package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCars();
    void save(Car car);
}
