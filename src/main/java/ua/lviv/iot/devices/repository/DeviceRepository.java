package ua.lviv.iot.devices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.devices.models.Device;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}