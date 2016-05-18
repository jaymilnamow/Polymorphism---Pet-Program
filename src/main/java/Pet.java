import java.util.Scanner;

/**
 * Created by jaymilnamow on 5/18/16.
 */
public class Pet {

    private String name, type;
    private int numPets;

    Scanner input = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPets() {
        return numPets;
    }

    public void setNumPets(int numPets) {
        this.numPets = numPets;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void numOfPets() {
        numPets = input.nextInt();
    }

    public Pet(String type, String name) {
        type = input.nextLine();
        name = input.nextLine();
    }

    public void speak(){
        System.out.println("Wan wan");
    }

};
