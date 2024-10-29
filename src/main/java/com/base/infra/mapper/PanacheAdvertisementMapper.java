package com.base.infra.mapper;

import com.base.domain.bo.AdvertisementBO;
import com.base.infra.database.panache.model.PanacheAdvertisementRepository;

/**
 *
 * @author Jhonatan
 */
public class PanacheAdvertisementMapper {

    public static AdvertisementBO toDomain(PanacheAdvertisementRepository panache) {
        return new AdvertisementBO.Builder()
                .setId(panache.getId())
                .setCarBO(PanacheCarMapper.toDomain(panache.getCar()))
                .setTitle(panache.getTitle())
                .setAmount(panache.getAmount())
                .setCreatedAt(panache.getCreatedAt())
                .setEmphasis(panache.isEmphasis())
                .setStatus(panache.getStatus())
                .build();

    }

    public static PanacheAdvertisementRepository toEntity(AdvertisementBO bo) {

        PanacheAdvertisementRepository panache = new PanacheAdvertisementRepository();

        panache.setId(bo.getId());
        panache.setTitle(bo.getTitle());
        panache.setAmount(bo.getAmount());
        panache.setCreatedAt(bo.getCreatedAt());
        panache.setEmphasis(bo.isEmphasis());
        panache.setStatus(bo.getStatus());
        panache.setCar(PanacheCarMapper.toEntity(bo.getCarBO()));

        return panache;
    }
}