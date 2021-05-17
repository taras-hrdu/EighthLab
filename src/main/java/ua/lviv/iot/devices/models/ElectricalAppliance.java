package ua.lviv.iot.devices.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.lviv.iot.devices.enums.Items;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)

public class ElectricalAppliance extends Device{
    public Double energy_consumption;
    public Double cord_length;
    public Integer number_of_buttons;

    public ElectricalAppliance(String brand, Integer price, String name, Items items_for_cake,
                               Integer weight_in_kg, String color, Integer power,
                               Double guarantee, Double energy_consumption, Double cord_length,
                               Integer number_of_buttons){
        super(brand, price, name, items_for_cake, weight_in_kg, color, power, guarantee);
        this.energy_consumption = energy_consumption;
        this.cord_length = cord_length;
        this.number_of_buttons = number_of_buttons;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" + "\n" +
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
                '}';
    }
}
