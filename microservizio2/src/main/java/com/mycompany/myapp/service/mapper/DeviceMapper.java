package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.DeviceDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Device and its DTO DeviceDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface DeviceMapper extends EntityMapper<DeviceDTO, Device> {


    @Mapping(target = "player_device", ignore = true)
    Device toEntity(DeviceDTO deviceDTO);

    default Device fromId(Long id) {
        if (id == null) {
            return null;
        }
        Device device = new Device();
        device.setId(id);
        return device;
    }
}
