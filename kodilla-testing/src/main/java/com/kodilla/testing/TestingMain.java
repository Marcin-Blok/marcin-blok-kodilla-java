package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator calculator = new Calculator();

        // Testowanie simpleUser
        String result = simpleUser.getUsername();
        if(result.equals("theForumUser")){
            System.out.println("Test OK");
        }else{
            System.out.println("Failed!");
        }


        // Testowanie metod add() i substruct() z klasy Calculator
        int addingResult = calculator.add(5, 455);
        int substructResult = calculator.substruct(400,70);

        if(addingResult == 460){
            System.out.println("Test OK");
        }else{
            System.out.println("Test failed!");
        }

        if(substructResult == 330){
            System.out.println("Test OK");
        }else{
            System.out.println("Test failed!");
        }
    }
}
