package ua.lviv.iot.devices.models;

import lombok.*;
import ua.lviv.iot.devices.enums.Items;


@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)

public class Device {
    public String brand;
    public Integer price;
    public String name;
    public Items items_for_cake;
    public Integer weight_in_kg;
    public String color;
    public Integer power;
    public Double guarantee;

    @Override
    public String toString() {
        return "Device{" + "\n" +
                "brand='" + brand + '\'' + "\n" +
                "price=" + price + "\n" +
                "name='" + name + '\'' + "\n" +
                "items_for_cake=" + items_for_cake + "\n" +
                "weight_in_kg=" + weight_in_kg + "\n" +
                "color='" + color + '\'' + "\n" +
                "power=" + power + "\n" +
                "guarantee=" + guarantee + "\n" +
                '}';
    }
}
