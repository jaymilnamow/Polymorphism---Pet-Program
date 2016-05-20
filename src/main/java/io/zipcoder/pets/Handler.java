package io.zipcoder.pets;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jaymilnamow on 5/18/16.
 */
public class Handler {

    Scanner input = new Scanner(System.in);

    public int numPets;
    public String kindPets;
    public String[] petsArray;
    public String[] petsTypes;

    public void run() {
        numPets();
        petsTypes = new String[numPets];
        petsArray = new String[numPets];

        for(int i=0; i<numPets; i++) {
            petsTypes[i] = kindPets();
            petsArray[i] = namePets();
        }

        for(int i=0; i<numPets; i++) {
            System.out.println(petsArray[i] + " is a " + petsTypes[i]);
        }

    }

    public void numPets() {
        System.out.println("How many pets do you have?");
        numPets = input.nextInt();

        input.nextLine();
    }

    public String kindPets() {
        System.out.println("What type of pets are they?");
        return input.nextLine();
    }

    public String namePets() {
        System.out.println("What are your pet's names?");
        return input.nextLine();
    }
}