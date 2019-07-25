package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.PlayerDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Player and its DTO PlayerDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PlayerMapper extends EntityMapper<PlayerDTO, Player> {



    default Player fromId(Long id) {
        if (id == null) {
            return null;
        }
        Player player = new Player();
        player.setId(id);
        return player;
    }
}
