package web.config;

import web.controller.Car;

import java.util.List;

public interface CarService {
    List<Car> ListOfCars (int count);
}
