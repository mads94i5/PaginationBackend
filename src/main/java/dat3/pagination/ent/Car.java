package dat3.pagination.ent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Car {
    @Id
    private int id;
    private String brand;
    private String model;
    private String color;
    private int kilometers;
    private LocalDateTime created;
    private LocalDateTime updated;
}
