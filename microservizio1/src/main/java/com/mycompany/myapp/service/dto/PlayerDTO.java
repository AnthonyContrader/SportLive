package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Player entity.
 */
public class PlayerDTO implements Serializable {

    private Long id;

    private String playername;

    private Integer age;

    private Integer gamep;

    private Integer score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGamep() {
        return gamep;
    }

    public void setGamep(Integer gamep) {
        this.gamep = gamep;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PlayerDTO playerDTO = (PlayerDTO) o;
        if (playerDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), playerDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
            "id=" + getId() +
            ", playername='" + getPlayername() + "'" +
            ", age=" + getAge() +
            ", gamep=" + getGamep() +
            ", score=" + getScore() +
            "}";
    }
}
