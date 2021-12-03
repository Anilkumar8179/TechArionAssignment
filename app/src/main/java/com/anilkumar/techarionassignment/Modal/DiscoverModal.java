package com.anilkumar.techarionassignment.Modal;

public class DiscoverModal {
    String text;
    int button;

    public DiscoverModal(String text, int button) {
        this.text = text;
        this.button = button;
    }

    public DiscoverModal(String text, String catigri, String geners) {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }
}
