package com.base.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.base.domain.Enum.EnumStatusAdsertisement;

public class AdvertisementDTO {

    private Integer id;

    private String title;

    private BigDecimal amount;

    private LocalDateTime createdAt;

    private boolean emphasis;

    private EnumStatusAdsertisement status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isEmphasis() {
        return emphasis;
    }

    public void setEmphasis(boolean emphasis) {
        this.emphasis = emphasis;
    }

    public EnumStatusAdsertisement getStatus() {
        return status;
    }

    public void setStatus(EnumStatusAdsertisement status) {
        this.status = status;
    }

}
