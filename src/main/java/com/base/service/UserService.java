package com.base.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;

import com.base.domain.bo.CarBO;
import com.base.domain.dto.CarDTO;
import com.base.domain.mapper.CarMapper;
import com.base.domain.repositories.ICarProfileRepository;
import com.base.domain.repositories.IFileRepository;
import com.base.infra.utils.MultiPartUploadFile;

@ApplicationScoped
public class UserService {

    @Inject
    protected IFileRepository fileRepository;

    @Inject
    protected ICarProfileRepository iProfileRepository;

    @Transactional
    public Response uploadAvatar(List<MultiPartUploadFile> multiparts, String plate) {

        // for (MultiPartUploadFile multipart : multiparts) {

        // var car = new CarFileDTO();
        // car.setPlates(plate);

        // var createImage = new CreateUserProfileImage(fileRepository,
        // iProfileRepository);
        // var image = createImage.execute(car, multipart.getFile());

        // var toBase64 = Base64.getEncoder().encodeToString(image.getProfileImg());

        // byte[] imageBytes = Base64.getDecoder().decode(toBase64);

        // return Response.ok(imageBytes)
        // .header("Content-Type", "image/png")
        // .build();

        // }

        return null;

    }

    @Transactional
    public Response createCar(CarDTO car) {

        CarBO cardBO = CarMapper.toBO(car);

        iProfileRepository.create(cardBO);

        return Response.ok().build();

    }
}