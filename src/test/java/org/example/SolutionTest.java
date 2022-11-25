package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class SolutionTest {

    static FizzBuzz fizzBuzz;
    static int num;
    int result;

    @BeforeAll
    static void setup(){
        fizzBuzz = new FizzBuzz(num);
    }

    @Test
    public void given2returnListOfStrings() throws InterruptedException {
        num = 2;


    }

    @Test
    public void given3returnListOfStrings() {
        num = 3;


    }
    @Test
    public void given15returnListOfStrings(){
        num = 15;



    }
}
