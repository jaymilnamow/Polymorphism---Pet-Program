import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jaymilnamow on 5/18/16.
 */
public class PetSpec {

    Pet testPet;
    @Before
    public void initialize(){
        testPet = new Pet();
        testPet.addPet("Panda", "LingLing");
    }

    @Test
    public void numOfPetsTest(){
        int expectedValue = 1;
        int actualValue = testPet.numOfPets();
        assertEquals("Expected number of pets value equal to 1", expectedValue,actualValue);


    }
}
