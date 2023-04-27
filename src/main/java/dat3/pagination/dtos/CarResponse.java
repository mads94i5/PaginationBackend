package dat3.pagination.dtos;

import dat3.pagination.ent.Car;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class CarResponse {
    private int id;
    private String brand;
    private String model;
    private String color;
    private int kilometers;

    public CarResponse fromCar(Car car) {
        this.id = car.getId();
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.color = car.getColor();
        this.kilometers = car.getKilometers();
        return this;
    }
}
