package ua.lviv.iot.devices.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.devices.enums.Items;


@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, includeFieldNames = true)

public class ElectricalAppliance extends Device{
    private Float energy_consumption;
    private Float cord_length;
    private Integer number_of_buttons;

    public ElectricalAppliance(Integer id, String brand, Integer price, String name, Items items_for_cake,
                               Integer weight_in_kg, String color, Integer power,
                               Float guarantee, Float energy_consumption, Float cord_length,
                               Integer number_of_buttons){
        super(id, brand, price, name, items_for_cake, weight_in_kg, color, power, guarantee);
        this.energy_consumption = energy_consumption;
        this.cord_length = cord_length;
        this.number_of_buttons = number_of_buttons;
    }


}
