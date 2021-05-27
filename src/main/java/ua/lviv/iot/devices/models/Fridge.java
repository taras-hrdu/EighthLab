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

public class Fridge extends ElectricalAppliance{
    private Integer number_of_shelves;
    private Integer count_of_containers;

    public Fridge(Integer id, final String brand, final Integer price, final String name, final Items items_for_cake,
                  final Integer weight_in_kg, final String color, final Integer power,
                  final Float guarantee, final Float energy_consumption, final Float cord_length,
                  final Integer number_of_buttons, final Integer number_of_shelves, final Integer count_of_containers){
        super(id, brand, price, name, items_for_cake, weight_in_kg, color, power, guarantee, energy_consumption,
                cord_length, number_of_buttons);
        this.number_of_shelves = number_of_shelves;
        this.count_of_containers = count_of_containers;
    }
}
