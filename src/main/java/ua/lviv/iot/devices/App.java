package ua.lviv.iot.devices;

import ua.lviv.iot.devices.enums.*;
import ua.lviv.iot.devices.manager.DeviceManager;
import ua.lviv.iot.devices.models.*;


import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Device> listOfDevices = List.of(
                new Kettle("Phillips",  25, "BronzeHero", Items.INVOLVED, 20,
                        "black", 2, 2.4, 1.3, 3.2, 5,
                        12.2),
                new Fridge("Phillips",  2000, "BronzeHero", Items.INVOLVED, 20,
                        "black", 3000, 2.4, 1.3, 3.2, 5,
                        12, 25),
                new MeasuringCup("Phillips",  12, "BronzeHero", Items.NOT_INVOLVED, 20,
                "black", 20, 2.4, "Gold", 30, "Surface"),
                new Knife("Phillips",  120, "BronzeHero", Items.NOT_INVOLVED, 20,
                "black", 100, 2.4, "Gold", 30, 2.2,
                        1.6, 5));

        DeviceManager deviceManager = new DeviceManager(listOfDevices);

        System.out.print("Devices found by items:" + "\n" + "\n");
        DeviceManager.printDevices(deviceManager.find_by_items(Items.INVOLVED));
        System.out.print("\n");

        System.out.print("Devices sorted by power:" + "\n" + "\n");
        DeviceManager.printDevices(deviceManager.sortByPower(SortOrder.ASC));
        System.out.print("\n");

        System.out.print("Devices sorted by price:" + "\n" + "\n");
        DeviceManager.printDevices(deviceManager.sortByPrice(SortOrder.DESC));
    }
}
