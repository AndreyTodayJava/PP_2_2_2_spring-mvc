package web.service;

import web.models.Car;

import java.util.List;

public interface CarServiceImp {
    List<Car> getCars(int size);
    void save(Car car);
}
