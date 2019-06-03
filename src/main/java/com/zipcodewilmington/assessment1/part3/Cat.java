package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    String name;
    Integer age;
    public Cat(String name, Integer age) {
    this.name = name;
    this.age = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.age = age;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
    this.name = name;
    }


    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this.age = 0;
        this.name = name;

    }

    /**
     * @return meow as a string
     */
    public String speak() {

        String sound = "Meow";

        return sound;
    }
}
