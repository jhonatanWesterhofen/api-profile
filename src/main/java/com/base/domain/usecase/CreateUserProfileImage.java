package com.base.domain.usecase;

import java.io.InputStream;

import com.base.domain.bo.CardFileBO;
import com.base.domain.dto.CarFileDTO;
import com.base.domain.repositories.IFileRepository;
import com.base.domain.repositories.IProfileRepository;

public class CreateUserProfileImage {

    private IFileRepository fileRepository;

    private IProfileRepository iProfileRepository;

    public CreateUserProfileImage(IFileRepository fileRepository, IProfileRepository iProfileRepository) {
        this.fileRepository = fileRepository;
        this.iProfileRepository = iProfileRepository;
    }

    public CarFileDTO execute(CarFileDTO dto, InputStream file) {

        var imageByte = fileRepository.createCarImage(dto, file);

        iProfileRepository.create(toBO(imageByte));

        return null;

    }

    public CardFileBO toBO(CarFileDTO dto) {
        return new CardFileBO(dto.getPlates(), dto.getProfileImg());
    }
}