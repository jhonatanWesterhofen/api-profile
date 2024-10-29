package com.base.infra.utils;

import java.util.List;

import javax.ws.rs.FormParam;

public class MultiPartUploadFiles {

    @FormParam("file")
    private List<MultiPartUploadFile> files;

    public List<MultiPartUploadFile> getFiles() {
        return files;
    }

    public void setFiles(List<MultiPartUploadFile> files) {
        this.files = files;
    }

}
