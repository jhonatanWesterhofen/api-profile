package com.base.infra.database.panache.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.base.domain.Enum.EnumStatusAdsertisement;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "AP_ADVERTISEMENT")
public class PanacheAdvertisementRepository extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "ID_ADVERTISEMENT", sequenceName = "GEN_AP_ADVERTISEMENT_PROFILE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_ADVERTISEMENT")
    @Column(name = "ID", nullable = false, precision = 0, scale = -127)
    private Integer id;

    @JoinColumn(name = "ID_CAR", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private PanacheCarRepository car;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "EMPHASIS")
    private boolean emphasis;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
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

    public PanacheCarRepository getCar() {
        return car;
    }

    public void setCar(PanacheCarRepository car) {
        this.car = car;
    }
}