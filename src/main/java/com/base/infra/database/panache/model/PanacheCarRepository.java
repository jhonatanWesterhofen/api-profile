package com.base.infra.database.panache.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "AP_CAR")
public class PanacheCarRepository extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "ID_CAR", sequenceName = "GEN_AP_CAR_PROFILE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_CAR")
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private Integer id;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "MILEAGE")
    private Long mileage;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PLATE")
    private String plate;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "FUEL")
    private String fuel;

    @Column(name = "CAMBIO")
    private String exchange;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<PanacheAdvertisementRepository> advertisement;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "SC_URL_CAR_IMAGES", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "ID_CAR")
    private List<String> urlImages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<String> getUrlImages() {
        return urlImages;
    }

    public void setUrlImages(List<String> urlImages) {
        this.urlImages = urlImages;
    }

    public List<PanacheAdvertisementRepository> getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(List<PanacheAdvertisementRepository> advertisement) {
        this.advertisement = advertisement;
    }

}