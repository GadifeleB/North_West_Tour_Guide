package com.example.brenda.north_west_tour_guide;

import java.io.Serializable;

/**
 * Created by Brenda on 2017/08/16.
 */

public class Contact implements Serializable {
    String Name;
    String Surname;
    int image;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
