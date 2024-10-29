package com.base.infra.utils;

import java.io.InputStream;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

public class MultiPartUploadFile {

    @FormParam("file")
    @PartType(MediaType.APPLICATION_OCTET_STREAM)
    private InputStream file;

    @FormParam("file2")
    @PartType(MediaType.APPLICATION_OCTET_STREAM)
    private InputStream file2;

    @FormParam("fileName")
    @PartType("text/plain")
    private String fileName;

    public InputStream getFile() {
        return file;
    }

    public void setFile(InputStream file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public InputStream getFile2() {
        return file2;
    }

    public void setFile2(InputStream file2) {
        this.file2 = file2;
    }

}
