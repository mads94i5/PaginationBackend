package dat3.pagination.repo;

import dat3.pagination.ent.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    Page<Car> findCarsById(long id, Pageable pageable);
    Page<Car> findCarsByBrand(String brand, Pageable pageable);
    Page<Car> findCarsByModel(String model, Pageable pageable);
    Page<Car> findCarsByColor(String color, Pageable pageable);
    Page<Car> findCarsByKilometers(int kilometers, Pageable pageable);
}
