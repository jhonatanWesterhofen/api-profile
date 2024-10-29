package com.base.infra.database.panache.repositories;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;

import com.base.domain.bo.CarBO;
import com.base.domain.repositories.ICarProfileRepository;
import com.base.infra.database.panache.model.PanacheCarRepository;
import com.base.infra.mapper.PanacheCarMapper;

/**
 *
 * @author Jhonatan
 */
@ApplicationScoped
public class PanacheCarProfileRepository implements ICarProfileRepository {

    EntityManager em = PanacheCarRepository.getEntityManager();

    @Override
    public CarBO create(CarBO bo) {

        var entity = PanacheCarMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanacheCarMapper.toDomain(entity);
    }

    @Override
    public CarBO merge(CarBO bo) {
        var entity = PanacheCarMapper.toEntity(bo);

        em.merge(entity);

        return PanacheCarMapper.toDomain(entity);
    }

    @Override
    public CarBO findBy(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }
}