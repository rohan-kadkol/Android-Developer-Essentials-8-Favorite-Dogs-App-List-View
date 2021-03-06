package com.rohankadkol.favoritedogsapplistview8.pojos;

public class Dog {
    private String name;
    private String breed;
    private double age;
    private String likes;
    private String dislikes;
    private String imageUrl;

    public Dog(String name, String breed, double age, String likes, String dislikes, String imageUrl) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.likes = likes;
        this.dislikes = dislikes;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDislikes() {
        return dislikes;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
