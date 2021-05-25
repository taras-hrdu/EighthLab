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


public class HandTool extends Device{
    private String handle_material;
    private Integer length_in_mm;

    public HandTool(Integer id, String brand, Integer price, String name, Items items_for_cake,
                    Integer weight_in_kg, String color, Integer power,
                    Float guarantee, String handle_material, Integer length_in_mm){
        super(id, brand, price, name, items_for_cake, weight_in_kg, color, power, guarantee);
        this.handle_material = handle_material;
        this.length_in_mm = length_in_mm;
    }
}
