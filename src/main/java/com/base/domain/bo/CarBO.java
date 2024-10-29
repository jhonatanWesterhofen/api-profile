package com.base.domain.bo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Jhonatan
 */
public class CarBO {

    private Integer id;

    private String model;

    private Long mileage;

    private String description;

    private String plate;

    private String color;

    private String fuel;

    private String exchange;

    private LocalDateTime createdAt;

    private BigDecimal amount;

    private List<String> urlImages;

    private List<AdvertisementBO> listAdvertisement;

    private CarBO(Builder builder) {
        this.id = builder.id;
        this.model = builder.model;
        this.mileage = builder.mileage;
        this.description = builder.description;
        this.plate = builder.plate;
        this.color = builder.color;
        this.fuel = builder.fuel;
        this.exchange = builder.exchange;
        this.createdAt = builder.createdAt;
        this.amount = builder.amount;
        this.urlImages = builder.urlImages;
        this.listAdvertisement = builder.listAdvertisement;
    }

    public static class Builder {
        private Integer id;
        private String model;
        private Long mileage;
        private String description;
        private String plate;
        private String color;
        private String fuel;
        private String exchange;
        private LocalDateTime createdAt;
        private BigDecimal amount;
        private List<String> urlImages;
        private List<AdvertisementBO> listAdvertisement;

        public Builder setlistAdvertinsent(List<AdvertisementBO> listAdvertisement) {
            this.listAdvertisement = listAdvertisement;
            return this;
        }

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setMileage(Long mileage) {
            this.mileage = mileage;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPlate(String plate) {
            this.plate = plate;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setFuel(String fuel) {
            this.fuel = fuel;
            return this;
        }

        public Builder setExchange(String exchange) {
            this.exchange = exchange;
            return this;
        }

        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder setUrlImages(List<String> urlImages) {
            this.urlImages = urlImages;
            return this;
        }

        public CarBO build() {
            return new CarBO(this);
        }
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Long getMileage() {
        return mileage;
    }

    public String getDescription() {
        return description;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public String getFuel() {
        return fuel;
    }

    public String getExchange() {
        return exchange;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public List<String> getUrlImages() {
        return urlImages;
    }

    public List<AdvertisementBO> getListAdvertisement() {
        return listAdvertisement;
    }

}