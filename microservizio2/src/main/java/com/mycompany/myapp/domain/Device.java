package com.mycompany.myapp.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A Device.
 */
@Entity
@Table(name = "device")
public class Device implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serial")
    private Long serial;

    @Column(name = "heartbeat")
    private Integer heartbeat;

    @Column(name = "pressure")
    private Integer pressure;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSerial() {
        return serial;
    }

    public Device serial(Long serial) {
        this.serial = serial;
        return this;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    public Integer getHeartbeat() {
        return heartbeat;
    }

    public Device heartbeat(Integer heartbeat) {
        this.heartbeat = heartbeat;
        return this;
    }

    public void setHeartbeat(Integer heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Integer getPressure() {
        return pressure;
    }

    public Device pressure(Integer pressure) {
        this.pressure = pressure;
        return this;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
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
        Device device = (Device) o;
        if (device.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), device.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Device{" +
            "id=" + getId() +
            ", serial=" + getSerial() +
            ", heartbeat=" + getHeartbeat() +
            ", pressure=" + getPressure() +
            "}";
    }
}
