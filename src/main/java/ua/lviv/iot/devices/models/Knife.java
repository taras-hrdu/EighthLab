package ua.lviv.iot.devices.models;

import lombok.*;
import ua.lviv.iot.devices.enums.Items;

@Data
@EqualsAndHashCode(callSuper = true)

public class Knife extends HandTool{
    public Double handle_length;
    public Double blade_length;
    public Integer number_of_blades;

    public Knife(final String brand, final Integer price, final String name, final Items items_for_cake,
                 final Integer weight_in_kg, final String color, final Integer power,
                 final Double guarantee, final String handle_material, final Integer length_in_mm,
                 final Double handle_length, final Double blade_length, final Integer number_of_blades){
        super(brand, price, name, items_for_cake, weight_in_kg, color, power, guarantee, handle_material, length_in_mm);
        this.handle_length = handle_length;
        this.blade_length = blade_length;
        this.number_of_blades = number_of_blades;
    }

    @Override
    public String toString() {
        return "Knife{" + "\n" +
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
                "handle_length=" + handle_length + "\n" +
                "blade_length=" + blade_length + "\n" +
                "number_of_blades=" + number_of_blades + "\n" +
                '}';
    }
}
