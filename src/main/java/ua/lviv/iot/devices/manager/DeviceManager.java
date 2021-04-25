package ua.lviv.iot.devices.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.lviv.iot.devices.enums.Items;
import ua.lviv.iot.devices.models.Device;
import ua.lviv.iot.devices.enums.SortOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class DeviceManager {
    private List<Device> items;

    public List<Device> find_by_items(final Items items_for_cake) {
        return items.stream().filter(item -> item.getItems_for_cake() == items_for_cake).collect(Collectors.toList());
    }

    public List<Device> sortByPower(final SortOrder sortOrder) {
        List<Device> sortedDevices = new ArrayList<>(items);
        if (sortOrder == SortOrder.ASC) {
            sortedDevices.sort((device1, device2) ->
                    device1.getPower().compareTo(device2.getPower()));
        } else{
            sortedDevices.sort((device1, device2) ->
                    device2.getPower().compareTo(device1.getPower()));
        }
        return sortedDevices;
    }

    public List<Device> sortByPrice(final SortOrder sortOrder) {
        List<Device> sortedDevices = new ArrayList<>(items);
        if (sortOrder == SortOrder.ASC) {
            sortedDevices.sort((device1, device2) ->
                    device1.getPrice().compareTo(device2.getPrice()));
        } else{
            sortedDevices.sort((device1, device2) ->
                    device2.getPrice().compareTo(device1.getPrice()));
        }

        return sortedDevices;
    }

    public static void printDevices(final List<Device> items) {
        items.forEach(System.out::println);
    }
}
