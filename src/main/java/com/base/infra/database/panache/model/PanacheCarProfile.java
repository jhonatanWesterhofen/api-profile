package com.base.infra.database.panache.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "AP_USER")
public class PanacheCarProfile extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "ID_USER", sequenceName = "GEN_AP_USER_PROFILE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_USER")
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private Long id;

    @Column(name = "plate", unique = true)
    private String plate;

    @Column(name = "PROFILE_IMG", columnDefinition = "BYTEA")
    private byte[] profileImg;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public byte[] getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(byte[] profileImg) {
        this.profileImg = profileImg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}