package ua.lviv.iot.devices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.devices.models.Device;
import ua.lviv.iot.devices.service.DeviceService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/devices")
public final class DeviceController {
    @Autowired
    DeviceService deviceService;

    @GetMapping
    public List<Device> getList() {
        return deviceService.listAllDevices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Device> getDevice(@PathVariable Integer id) {
        try {
            Device device = deviceService.getDevice(id);
            return new ResponseEntity<Device>(device, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Device>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public void addDevice(@RequestBody Device device) {
        deviceService.saveDevice(device);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Device> updateDevice(@RequestBody Device device, @PathVariable Integer id) {
        try {
            Device existDevice = deviceService.getDevice(id);
            device.setId(id);
            deviceService.saveDevice(device);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Device> deleteDevice(@PathVariable Integer id) {
        try {
            Device existDevice = deviceService.getDevice(id);
            deviceService.deleteDevice(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}