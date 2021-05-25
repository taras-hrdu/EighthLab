package ua.lviv.iot.devices.models;

import lombok.*;
import ua.lviv.iot.devices.enums.Items;

import javax.persistence.*;

@Table(name = "devices")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String brand;
    protected Integer price;
    protected String name;
    protected Items items_for_cake;
    protected Integer weight_in_kg;
    protected String color;
    protected Integer power;
    protected Float guarantee;

}
