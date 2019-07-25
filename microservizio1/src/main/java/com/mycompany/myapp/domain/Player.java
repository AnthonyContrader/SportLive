package com.mycompany.myapp.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

import com.mycompany.myapp.domain.enumeration.Playertype;

/**
 * A Player.
 */
@Entity
@Table(name = "player")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "playername")
    private String playername;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gamep")
    private Integer gamep;

    @Column(name = "score")
    private Integer score;

    @Enumerated(EnumType.STRING)
    @Column(name = "playertype")
    private Playertype playertype;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayername() {
        return playername;
    }

    public Player playername(String playername) {
        this.playername = playername;
        return this;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public Integer getAge() {
        return age;
    }

    public Player age(Integer age) {
        this.age = age;
        return this;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGamep() {
        return gamep;
    }

    public Player gamep(Integer gamep) {
        this.gamep = gamep;
        return this;
    }

    public void setGamep(Integer gamep) {
        this.gamep = gamep;
    }

    public Integer getScore() {
        return score;
    }

    public Player score(Integer score) {
        this.score = score;
        return this;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Playertype getPlayertype() {
        return playertype;
    }

    public Player playertype(Playertype playertype) {
        this.playertype = playertype;
        return this;
    }

    public void setPlayertype(Playertype playertype) {
        this.playertype = playertype;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        if (player.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), player.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Player{" +
            "id=" + getId() +
            ", playername='" + getPlayername() + "'" +
            ", age=" + getAge() +
            ", gamep=" + getGamep() +
            ", score=" + getScore() +
            ", playertype='" + getPlayertype() + "'" +
            "}";
    }
}
