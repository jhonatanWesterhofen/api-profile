package com.base.domain.bo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.base.domain.Enum.EnumStatusAdsertisement;

public class AdvertisementBO {

    private Integer id;

    private CarBO carBO;

    private String title;

    private BigDecimal amount;

    private LocalDateTime createdAt;

    private boolean emphasis;

    private EnumStatusAdsertisement status;

    public AdvertisementBO(Builder builder) {
        this.id = builder.id;
        this.carBO = builder.carBO;
        this.title = builder.title;
        this.amount = builder.amount;
        this.createdAt = builder.createdAt;
        this.emphasis = builder.emphasis;
        this.status = builder.status;
    }

    public static class Builder {
        private Integer id;
        private CarBO carBO;
        private String title;
        private BigDecimal amount;
        private LocalDateTime createdAt;
        private boolean emphasis;
        private EnumStatusAdsertisement status;

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setCarBO(CarBO carBO) {
            this.carBO = carBO;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setEmphasis(boolean emphasis) {
            this.emphasis = emphasis;
            return this;
        }

        public Builder setStatus(EnumStatusAdsertisement status) {
            this.status = status;
            return this;
        }

        public AdvertisementBO build() {
            return new AdvertisementBO(this);
        }

    }

    public Integer getId() {
        return id;
    }

    public CarBO getCarBO() {
        return carBO;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public boolean isEmphasis() {
        return emphasis;
    }

    public EnumStatusAdsertisement getStatus() {
        return status;
    }

}
