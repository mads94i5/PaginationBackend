package dat3.pagination.service;

import dat3.pagination.dtos.CarResponse;
import dat3.pagination.ent.Car;
import dat3.pagination.repo.CarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public List<CarResponse> getCars(Pageable pageable) {
        Page<Car> carPage = carRepository.findAll(pageable);
        List<Car> carList = carPage.getContent();
        return carList.stream().map(car -> new CarResponse().fromCar(car)).toList();
    }

    public List<CarResponse> getAll() {
        return carRepository.findAll().stream().map(car -> new CarResponse().fromCar(car)).toList();
    }

    public List<CarResponse> getCarsById(long id, Pageable pageable) {
        Page<Car> carPage = carRepository.findCarsById(id, pageable);
        List<Car> carList = carPage.getContent();
        return carList.stream().map(car -> new CarResponse().fromCar(car)).toList();
    }

    public List<CarResponse> getCarsByBrand(String brand, Pageable pageable) {
        Page<Car> carPage = carRepository.findCarsByBrand(brand, pageable);
        List<Car> carList = carPage.getContent();
        return carList.stream().map(car -> new CarResponse().fromCar(car)).toList();
    }

    public List<CarResponse> getCarsByModel(String model, Pageable pageable) {
        Page<Car> carPage = carRepository.findCarsByModel(model, pageable);
        List<Car> carList = carPage.getContent();
        return carList.stream().map(car -> new CarResponse().fromCar(car)).toList();
    }

    public List<CarResponse> getCarsByColor(String color, Pageable pageable) {
        Page<Car> carPage = carRepository.findCarsByColor(color, pageable);
        List<Car> carList = carPage.getContent();
        return carList.stream().map(car -> new CarResponse().fromCar(car)).toList();
    }

    public List<CarResponse> getCarsByKilometers(int kilometers, Pageable pageable) {
        Page<Car> carPage = carRepository.findCarsByKilometers(kilometers, pageable);
        List<Car> carList = carPage.getContent();
        return carList.stream().map(car -> new CarResponse().fromCar(car)).toList();
    }

    public long count() {
        return carRepository.count();
    }
}
