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

public class MeasuringCup extends HandTool{
    private String surface_type;

    private MeasuringCup(Integer id, final String brand, final Integer price, final String name, final Items items_for_cake,
                        final Integer weight_in_kg, final String color, final Integer power,
                        final Float guarantee, final String handle_material, final Integer length_in_mm,
                        final String surface_type){
        super(id, brand, price, name, items_for_cake, weight_in_kg, color, power, guarantee, handle_material, length_in_mm);
        this.surface_type = surface_type;
    }
}
