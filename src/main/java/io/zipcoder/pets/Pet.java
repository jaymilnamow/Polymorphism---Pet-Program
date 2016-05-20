package io.zipcoder.pets;

/**
 * Created by jaymilnamow on 5/18/16.
 */
public class Pet {

    private String name;
    public Pet(String name){
        this.name = name;
    }

    public String speak(){
        return "I'm a pet!";

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
