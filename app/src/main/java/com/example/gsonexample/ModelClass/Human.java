package com.example.gsonexample.ModelClass;

public class Human {
    private String message;
    private Place place;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void say() {
        System.out.println();
        System.out.println(getMessage() + " , " + getPlace().getName() + "!");
    }
}

