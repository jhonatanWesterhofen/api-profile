package com.base.domain.mapper;

import java.util.stream.Collectors;

import com.base.domain.Utils.ListUtil;
import com.base.domain.bo.CarBO;
import com.base.domain.dto.CarDTO;

/**
 *
 * @author Jhonatan
 */
public class CarMapper {

    public static CarBO toBO(CarDTO dto) {

        if (dto == null) {
            return null;
        }

        var listAdvertisement = ListUtil.stream(dto.getlAdvertisement())
                .map(AdvertisementMapper::toBO)
                .collect(Collectors.toList());

        return new CarBO.Builder()
                .setId(dto.getId())
                .setModel(dto.getModel())
                .setMileage(dto.getMileage())
                .setDescription(dto.getDescription())
                .setPlate(dto.getPlate())
                .setColor(dto.getColor())
                .setFuel(dto.getFuel())
                .setExchange(dto.getExchange())
                .setCreatedAt(dto.getCreatedAt())
                .setAmount(dto.getAmount())
                .setUrlImages(dto.getUrlImages())
                .setlistAdvertinsent(listAdvertisement)
                .build();
    }

    public static CarDTO toDTO(CarBO bo) {

        if (bo == null) {
            return null;
        }
        CarDTO carDTO = new CarDTO();

        var listAdvertisement = ListUtil.stream(bo.getListAdvertisement())
                .map(AdvertisementMapper::toDTO)
                .collect(Collectors.toList());

        carDTO.setId(bo.getId());
        carDTO.setModel(bo.getModel());
        carDTO.setMileage(bo.getMileage());
        carDTO.setDescription(bo.getDescription());
        carDTO.setPlate(bo.getPlate());
        carDTO.setColor(bo.getColor());
        carDTO.setFuel(bo.getFuel());
        carDTO.setExchange(bo.getExchange());
        carDTO.setCreatedAt(bo.getCreatedAt());
        carDTO.setAmount(bo.getAmount());
        carDTO.setUrlImages(bo.getUrlImages());
        carDTO.setlAdvertisement(listAdvertisement);

        return carDTO;
    }
}