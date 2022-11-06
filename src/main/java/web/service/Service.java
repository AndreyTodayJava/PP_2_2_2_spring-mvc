package web.service;

import web.models.Car;

import java.util.List;

public interface Service {
    List<Car> getCars(int size);
    void save(Car car);
}
