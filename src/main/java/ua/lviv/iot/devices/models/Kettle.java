package ua.lviv.iot.devices.models;

import lombok.*;
import ua.lviv.iot.devices.enums.Items;

@Data
@EqualsAndHashCode(callSuper = true)

public class Kettle extends ElectricalAppliance{
    public Double volume;

    public Kettle(final String brand, final Integer price, final String name, final Items items_for_cake,
                  final Integer weight_in_kg, final String color, final Integer power,
                  final Double guarantee, final Double energy_consumption, final Double cord_length,
                  final Integer number_of_buttons, final Double volume){
        super(brand, price, name, items_for_cake, weight_in_kg, color, power, guarantee, energy_consumption,
                cord_length, number_of_buttons);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Kettle{" + "\n" +
                "brand='" + brand + '\'' + "\n" +
                "price=" + price + "\n" +
                "name='" + name + '\'' + "\n" +
                "items_for_cake=" + items_for_cake + "\n" +
                "weight_in_kg=" + weight_in_kg + "\n" +
                "color='" + color + '\'' + "\n" +
                "power=" + power + "\n" +
                "guarantee=" + guarantee + "\n" +
                "energy_consumption=" + energy_consumption + "\n" +
                "cord_length=" + cord_length + "\n" +
                "number_of_buttons=" + number_of_buttons + "\n" +
                "volume=" + volume + "\n" +
                '}';
    }
}
