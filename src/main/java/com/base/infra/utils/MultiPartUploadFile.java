package com.base.infra.utils;

import java.io.InputStream;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

public class MultiPartUploadFile {

    @FormParam("file")
    @PartType(MediaType.WILDCARD)
    public InputStream file;

}
