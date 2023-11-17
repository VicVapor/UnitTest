/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.unittest.Operations;

/**
 *
 * @author vicjo
 */
public class OperationsTest {

    public OperationsTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void nextNumber_UserNumberGTown_AddedANumber() {

        //Arange
        int userNumber = 10;
        int expectedResult = 11;

        //Act
        int result = Operations.nextNumber(userNumber);

        //Assert
        assertEquals(expectedResult, result);

    }

    @Test
    public void randomNumer_UserNumberGTown_Plus30per() {
        //Arange
        int randomNumber = 10;
        int expectedResult = 13;

        //Act
        int result = Operations.randomNumer(randomNumber);

        //Assert
        assertEquals(expectedResult, result);

    }

    @Test
    public void sumOfDigits_UserNumberGTown_NumbersSum() {
        //Arange
        String chain = "222";
        int expectedResult = 6;

        //Act
        int result = Operations.sumOfDigits(chain);

        // Assert
        assertEquals(expectedResult, result);

    }

    // Crearemos un metodo para probar
}
