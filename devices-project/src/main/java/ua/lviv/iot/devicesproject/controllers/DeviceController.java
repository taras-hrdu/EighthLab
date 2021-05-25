package ua.lviv.iot.devicesproject.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.devicesproject.models.Device;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/devices")
@RestController
public class DeviceController {
    private final Map<Integer, Device> devices = new HashMap<>();
    private final AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public Collection<Device> getDevices() {
        return new ArrayList<Device>(devices.values());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Device> getDevice(@PathVariable("id") Integer id) {

        if (devices.get(id) == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(devices.get(id));

    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Device createDevices(final @RequestBody Device device) {
        device.setId(idCounter.incrementAndGet());
        devices.put(device.getId(), device);
        return device;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Device> deleteDevices(@PathVariable("id") int id) {
        HttpStatus status;
        if (devices.get(id) == null) {
            status = HttpStatus.NOT_FOUND;
        } else {
            status = HttpStatus.OK;
            devices.remove(id);
        }

        return ResponseEntity.status(status).build();

    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Device> updateDevices(final @PathVariable("id") int id, final @RequestBody Device device) {
        HttpStatus status;
        if (devices.get(id) == null) {
            status = HttpStatus.NOT_FOUND;
        } else {
            status = HttpStatus.OK;
            device.setId(id);
            devices.put(id, device);
        }
        return ResponseEntity.status(status).build();
    }
}