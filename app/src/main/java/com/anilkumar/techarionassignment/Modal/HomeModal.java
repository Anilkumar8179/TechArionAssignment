package com.anilkumar.techarionassignment.Modal;

public class HomeModal {
    String text;
    int imgId;

    public HomeModal(String text, int imgId) {
        this.text = text;
        this.imgId = imgId;
    }

    public HomeModal(String rupi_kouri, int img1, int img2, int img3, int img4) {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
