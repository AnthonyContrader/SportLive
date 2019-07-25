package com.mycompany.myapp.service;

import com.mycompany.myapp.service.dto.DeviceDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Device.
 */
public interface DeviceService {

    /**
     * Save a device.
     *
     * @param deviceDTO the entity to save
     * @return the persisted entity
     */
    DeviceDTO save(DeviceDTO deviceDTO);

    /**
     * Get all the devices.
     *
     * @return the list of entities
     */
    List<DeviceDTO> findAll();


    /**
     * Get the "id" device.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<DeviceDTO> findOne(Long id);

    /**
     * Delete the "id" device.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
