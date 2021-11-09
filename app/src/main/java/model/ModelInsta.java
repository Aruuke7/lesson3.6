package model;

public class ModelInsta {
    private int image;
    private String text;
    private String date;
    private int image2;

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public ModelInsta(int image, String text, String date) {
        this.image = image;
        this.text = text;
        this.date = date;


    }

    public ModelInsta(int image, String text, String date, int image2) {
        this.image = image;
        this.text = text;
        this.date = date;
        this.image2 = image2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

