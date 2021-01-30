package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ForumTestSuite {

    @Test // Adnotacja ta mówi kompilatorowi że metoda za nią jest przypadkiem testowym
    public void testCaseForumUser(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        //When
        String result = simpleUser.getUsername();
        //Then
        Assert.assertEquals("theForumUser", result);

    }
}
