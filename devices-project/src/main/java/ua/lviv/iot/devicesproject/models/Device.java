package ua.lviv.iot.devicesproject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Device {
    private Integer id;
    private String brand;
    private Integer price;
    private String name;
    private Integer weight_in_kg;
    private String color;
    private Integer power;
    private Double guarantee;
}
