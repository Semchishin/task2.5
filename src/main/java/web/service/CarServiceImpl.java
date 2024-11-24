package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Volvo", "XC90", "Black"));
        cars.add(new Car("BMW", "X3", "Blue"));
        cars.add(new Car("Mercedes", "E90", "White"));
        cars.add(new Car("Lada", "Granta", "Yellow"));
        cars.add(new Car("Daewoo", "Nexia", "Black"));
    }

    @Override
    public List<Car> getCarsList(int count) {
        if (count < 5 && count > 0) {
            List<Car> output = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                output.add(cars.get(i));
            }
            return output;
        }
        return cars;
    }
}
