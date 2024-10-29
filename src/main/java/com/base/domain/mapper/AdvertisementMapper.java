package com.base.domain.mapper;

import com.base.domain.bo.AdvertisementBO;
import com.base.domain.dto.AdvertisementDTO;

/**
 *
 * @author Jhonatan
 */
public class AdvertisementMapper {

    public static AdvertisementBO toBO(AdvertisementDTO dto) {

        if (dto == null) {
            return null;
        }
        return new AdvertisementBO.Builder()
                .setId(dto.getId())
                .setTitle(dto.getTitle())
                .setAmount(dto.getAmount())
                .setCreatedAt(dto.getCreatedAt())
                .setEmphasis(dto.isEmphasis())
                .setStatus(dto.getStatus())
                .build();
    }

    public static AdvertisementDTO toDTO(AdvertisementBO bo) {

        if (bo == null) {
            return null;
        }
        AdvertisementDTO advertisementDTO = new AdvertisementDTO();

        advertisementDTO.setId(bo.getId());
        advertisementDTO.setTitle(bo.getTitle());
        advertisementDTO.setAmount(bo.getAmount());
        advertisementDTO.setCreatedAt(bo.getCreatedAt());
        advertisementDTO.setEmphasis(bo.isEmphasis());
        advertisementDTO.setStatus(bo.getStatus());

        return advertisementDTO;

    }
}