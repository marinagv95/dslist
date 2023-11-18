package com.marinavieira.dslist.dto;

import com.marinavieira.dslist.entities.GameList;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

}
