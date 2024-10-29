package com.base.infra.mapper;

import java.util.stream.Collectors;

import com.base.domain.Utils.ListUtil;
import com.base.domain.bo.CarBO;
import com.base.infra.database.panache.model.PanacheCarRepository;

/**
 *
 * @author Jhonatan
 */
public class PanacheCarMapper {

    public static CarBO toDomain(PanacheCarRepository panache) {

        if (panache == null) {
            return null;
        }

        var listAdvertisement = ListUtil.stream(panache.getAdvertisement())
                .map(PanacheAdvertisementMapper::toDomain)
                .collect(Collectors.toList());

        return new CarBO.Builder()
                .setId(panache.getId())
                .setModel(panache.getModel())
                .setMileage(panache.getMileage())
                .setDescription(panache.getDescription())
                .setPlate(panache.getPlate())
                .setColor(panache.getColor())
                .setFuel(panache.getFuel())
                .setExchange(panache.getExchange())
                .setCreatedAt(panache.getCreatedAt())
                .setAmount(panache.getAmount())
                .setUrlImages(panache.getUrlImages())
                .setlistAdvertinsent(
                        listAdvertisement)
                .build();
    }

    public static PanacheCarRepository toEntity(CarBO bo) {

        PanacheCarRepository panache = new PanacheCarRepository();

        if (bo == null) {
            return null;
        }

        var listAdvertisement = ListUtil.stream(bo.getListAdvertisement())
                .map(PanacheAdvertisementMapper::toEntity)
                .collect(Collectors.toList());

        panache.setId(bo.getId());
        panache.setModel(bo.getModel());
        panache.setMileage(bo.getMileage());
        panache.setDescription(bo.getDescription());
        panache.setPlate(bo.getPlate());
        panache.setColor(bo.getColor());
        panache.setFuel(bo.getFuel());
        panache.setExchange(bo.getExchange());
        panache.setCreatedAt(bo.getCreatedAt());
        panache.setAmount(bo.getAmount());
        panache.setUrlImages(bo.getUrlImages());
        panache.setAdvertisement(listAdvertisement);

        return panache;
    }
}