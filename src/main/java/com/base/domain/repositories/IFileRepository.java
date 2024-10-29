package com.base.domain.repositories;

import java.io.InputStream;

import com.base.domain.dto.CarDTO;

/**
 *
 * @author Jhonatan
 */
public interface IFileRepository {

    CarDTO createCarImage(CarDTO dto, InputStream file);

}
