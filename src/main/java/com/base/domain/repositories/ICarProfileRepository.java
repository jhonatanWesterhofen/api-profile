package com.base.domain.repositories;

import com.base.domain.bo.CarBO;

/**
 *
 * @author Jhonatan
 */
public interface ICarProfileRepository {

    CarBO create(CarBO bo);

    CarBO merge(CarBO bo);

    CarBO findBy(Integer id);

}