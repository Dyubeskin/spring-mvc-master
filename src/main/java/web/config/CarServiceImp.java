package web.config;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.controller.Car;

import java.util.LinkedList;
import java.util.List;

@Component
@Service
public class CarServiceImp implements CarService{
@Override
public List <Car> ListOfCars(int count){
    List<Car> carList = new LinkedList<>();
    carList.add(new Car(1,"LADA","Blue"));
    carList.add(new Car(2,"Mercedes","Red"));
    carList.add(new Car(3,"BMW","Orange"));
    carList.add(new Car(4,"Nissan","Black"));
    carList.add(new Car(5,"KIA","Green"));
    if (count>=5){
        return carList;
    }
    List<Car> resultList = carList.subList(0,count);
    return resultList;
    }
}