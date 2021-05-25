package ua.lviv.iot.devices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.lviv.iot.devices.models.Device;
import ua.lviv.iot.devices.repository.DeviceRepository;

import java.util.List;
@Service
@Transactional
public class DeviceService {
    @Autowired
    private DeviceRepository deviceRepository;
    public List<Device> listAllDevices() {
        return deviceRepository.findAll();
    }
    public void saveDevice(Device device) {
        deviceRepository.save(device);

    }
    public Device getDevice(Integer id) {
        return deviceRepository.findById(id).get();
    }
    public void deleteDevice(Integer id) {
        deviceRepository.deleteById(id);
    }
}