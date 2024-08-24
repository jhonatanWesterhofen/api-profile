package com.base.infra.database.panache.repositories;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;

import com.base.domain.bo.CardFileBO;
import com.base.domain.repositories.IProfileRepository;
import com.base.infra.database.panache.model.PanacheCarProfile;

@ApplicationScoped
public class PanacheFileRepository implements IProfileRepository {

    EntityManager em = PanacheCarProfile.getEntityManager();

    @Override
    public CardFileBO create(CardFileBO bo) {

        var entity = new PanacheCarProfile();

        entity.setProfileImg(bo.getProfileImg());
        entity.setPlate("PLACA-DO-CARRO");

        var vm = entity.getProfileImg();

        entity.persistAndFlush();

        return null;
    }
}