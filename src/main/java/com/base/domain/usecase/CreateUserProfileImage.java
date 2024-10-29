package com.base.domain.usecase;

import java.io.InputStream;

import com.base.domain.bo.CarBO;
import com.base.domain.dto.CarDTO;
import com.base.domain.repositories.ICarProfileRepository;
import com.base.domain.repositories.IFileRepository;

public class CreateUserProfileImage {

    private IFileRepository fileRepository;

    private ICarProfileRepository iProfileRepository;

    public CreateUserProfileImage(IFileRepository fileRepository, ICarProfileRepository iProfileRepository) {
        this.fileRepository = fileRepository;
        this.iProfileRepository = iProfileRepository;
    }

    public CarDTO execute(CarDTO dto, InputStream file) {

        var imageByte = fileRepository.createCarImage(dto, file);

        var bo = iProfileRepository.create(toBO(imageByte));

        return toDTO(bo);

    }

    public CarBO toBO(CarDTO dto) {
        // return new CarBO(dto.getPlates(), dto.getProfileImg());
        return null;
    }

    public CarDTO toDTO(CarBO dto) {
        var carFileDTO = new CarDTO();

        // carFileDTO.setProfileImg(dto.getProfileImg());

        return carFileDTO;
    }
}