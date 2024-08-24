package com.base.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;

import com.base.domain.dto.CarFileDTO;
import com.base.domain.repositories.IFileRepository;
import com.base.domain.repositories.IProfileRepository;
import com.base.domain.usecase.CreateUserProfileImage;
import com.base.infra.utils.MultiPartUploadFile;

@ApplicationScoped
public class UserService {

    @Inject
    protected IFileRepository fileRepository;

    @Inject
    protected IProfileRepository iProfileRepository;

    @Transactional
    public Response uploadAvatar(MultiPartUploadFile multipart, String plate) {

        var car = new CarFileDTO();
        car.setPlates(plate);

        var createImage = new CreateUserProfileImage(fileRepository, iProfileRepository);
        var image = createImage.execute(car, multipart.file);

        // var toBase64 = Base64.getEncoder().encodeToString(image);

        // return Response.ok().entity(Map.of("base64", toBase64)).build();
        return Response.ok().build();
    }
}