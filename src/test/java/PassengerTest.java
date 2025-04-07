
import javax.annotation.processing.SupportedAnnotationTypes;
import ie.atu.weekTest.Passenger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PassengerTest {

    Passenger myPassenger;
    static void init() {
        System.out.println("Beginning all tests");
    }

    @BeforeEach
    void setup(){
        myPassenger = new Passenger();//create new passenger before each test
    }

    @Test
    void TestTitleFailure(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {myPassenger.getTitle();});
        assertEquals("There is an error in your title", myPassenger.getTitle());
    }

    @Test
    void TestTitleSuccessMr(){
        assertEquals("Mr", myPassenger.setTitle(String "Mr"));
    }

    @Test
    void TestTitleSuccessMrs(){
        assertEquals("Mrs", myPassenger.setTitle(String "Mrs"));
    }

    @Test
    void TestTitleSuccessMs(){
        assertEquals("Ms", myPassenger.setTitle(String "Ms"));
    }

    @Test
    void TestFirstNameCharacters(){

    }

    @Test
    void TestIDCode(){

    }



}
