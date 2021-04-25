package ua.lviv.iot.devices.models;

import lombok.*;
import ua.lviv.iot.devices.enums.Items;

@Data
@EqualsAndHashCode(callSuper = true)

public class MeasuringCup extends HandTool{
    public String surface_type;

    public MeasuringCup(final String brand, final Integer price, final String name, final Items items_for_cake,
                        final Integer weight_in_kg, final String color, final Integer power,
                        final Double guarantee, final String handle_material, final Integer length_in_mm,
                        final String surface_type){
        super(brand, price, name, items_for_cake, weight_in_kg, color, power, guarantee, handle_material, length_in_mm);
        this.surface_type = surface_type;
    }

    @Override
    public String toString() {
        return "MeasuringCup{" + "\n" +
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
                "surface_type='" + surface_type + '\'' + "\n" +
                '}';
    }
}
