package com.base.infra.database.panache.repositories;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.enterprise.context.ApplicationScoped;
import javax.imageio.ImageIO;

import org.apache.commons.io.output.ByteArrayOutputStream;

import com.base.domain.dto.CarFileDTO;
import com.base.domain.repositories.IFileRepository;

@ApplicationScoped
public class FIleImageRepository implements IFileRepository {

    private static final String DEFAULT_FILE_TYPE = "png";

    private static final Integer DEFAULT_IMAGE_SIZE = 180;

    @Override
    public CarFileDTO createCarImage(CarFileDTO dto, InputStream file) {

        try {
            var imgProfile = file.readAllBytes();
            var bufferedImage = ImageIO.read(new ByteArrayInputStream(imgProfile));

            var teste = resizeImage(bufferedImage, DEFAULT_IMAGE_SIZE, DEFAULT_IMAGE_SIZE);

            dto.setProfileImg(teste);

            return dto;

        } catch (IOException e) {
            throw new IllegalArgumentException("Image byte array cannot be null or empty");
        }

    }

    private byte[] resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {

        var resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        var graphics2D = resizedImage.createGraphics();
        var byteArrayOutputStream = new ByteArrayOutputStream();

        graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        graphics2D.dispose();

        ImageIO.write(resizedImage, DEFAULT_FILE_TYPE, byteArrayOutputStream);

        return byteArrayOutputStream.toByteArray();
    }

}
