package io.zipcoder.pets;

/**
 * Created by jaymilnamow on 5/18/16.
 */
public class Dog extends Pet{

    public Dog(String name){
        super(name);
    }

    public String speak(){
        return "Woof!";
    }
}
