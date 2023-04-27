package dat3.pagination.api;

import dat3.pagination.dtos.CarResponse;
import dat3.pagination.service.CarService;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@CrossOrigin
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/page")
    public List<CarResponse> getCars(Pageable pageable) {
        return carService.getCars(pageable);
    }

    @GetMapping("/page/id/{id}")
    public List<CarResponse> getCarsById(@PathVariable long id, Pageable pageable) {
        return carService.getCarsById(id, pageable);
    }

    @GetMapping("/page/brand/{brand}")
    public List<CarResponse> getCarsByBrand(@PathVariable String brand, Pageable pageable) {
        return carService.getCarsByBrand(brand, pageable);
    }

    @GetMapping("/page/model/{model}")
    public List<CarResponse> getCarsByModel(@PathVariable String model, Pageable pageable) {
        return carService.getCarsByModel(model, pageable);
    }

    @GetMapping("/page/color/{color}")
    public List<CarResponse> getCarsByColor(@PathVariable String color, Pageable pageable) {
        return carService.getCarsByColor(color, pageable);
    }

    @GetMapping("/page/kilometers/{kilometers}")
    public List<CarResponse> getCarsByKilometers(@PathVariable int kilometers, Pageable pageable) {
        return carService.getCarsByKilometers(kilometers, pageable);
    }

    @GetMapping("/count")
    public long count() {
        return carService.count();
    }

    @GetMapping("/all")
    public List<CarResponse> getAll() {
        return carService.getAll();
    }
}
