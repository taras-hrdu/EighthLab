package ua.lviv.iot.devices.models;

import lombok.*;
import ua.lviv.iot.devices.enums.Items;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class HandTool extends Device{
    public String handle_material;
    public Integer length_in_mm;

    public HandTool(String brand, Integer price, String name, Items items_for_cake,
                    Integer weight_in_kg, String color, Integer power,
                    Double guarantee, String handle_material, Integer length_in_mm){
        super(brand, price, name, items_for_cake, weight_in_kg, color, power, guarantee);
        this.handle_material = handle_material;
        this.length_in_mm = length_in_mm;
    }

    @Override
    public String toString() {
        return "HandTool{" + "\n" +
                "brand='" + brand + '\'' + "\n" +
                "price=" + price + "\n" +
                "name='" + name + '\'' + "\n" +
                "items_for_cake=" + items_for_cake + "\n" +
                "weight_in_kg=" + weight_in_kg + "\n" +
                "color='" + color + '\'' + "\n" +
                "power=" + power + "\n" +
                "guarantee=" + guarantee + "\n" +
                "handle_material='" + handle_material + '\'' + "\n" +
                "length_in_mm=" + length_in_mm + "\n" +
                '}';
    }
}
