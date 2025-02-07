package com.base.infra.mapper;

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

        return new CarBO.Builder()
                .setModel(panache.getModel())
                .setMileage(panache.getMileage())
                .setDescription(panache.getDescription())
                .setPlate(panache.getPlate())
                .setColor(panache.getColor())
                .setFuel(panache.getFuel())
                .setExchange(panache.getExchange())
                .setCreatedAt(panache.getCreatedAt())
                .setAmount(panache.getAmount())
                .build();
    }

    public static PanacheCarRepository toEntity(CarBO bo) {

        PanacheCarRepository panache = new PanacheCarRepository();

        if (bo == null) {
            return null;
        }

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

        return panache;
    }
}