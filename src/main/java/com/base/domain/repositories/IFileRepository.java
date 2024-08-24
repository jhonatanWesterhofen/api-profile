package com.base.domain.repositories;

import java.io.InputStream;

import com.base.domain.dto.CarFileDTO;

public interface IFileRepository {

    CarFileDTO createCarImage(CarFileDTO dto, InputStream file);

}
