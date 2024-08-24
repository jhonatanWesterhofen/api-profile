package com.base.domain.bo;

public class CardFileBO {

    private String plates;

    private byte[] profileImg;

    public CardFileBO(String plates, byte[] profileImg) {
        this.plates = plates;
        this.profileImg = profileImg;
    }

    public String getPlates() {
        return plates;
    }

    public byte[] getProfileImg() {
        return profileImg;
    }
}