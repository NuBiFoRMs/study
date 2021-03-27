package com.nubiform.baseball;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BaseballGame {
    public BaseballGame(String answer) {
    }

    public GameResult guess(String question) {
        if (question == null || "".equals(question))
            throw new IllegalArgumentException("invalid argument");

        if (!question.matches("^[0-9]{3}$]"))
            throw new IllegalArgumentException("invalid argument");

        Map<String, Integer> duplicateCheck = new HashMap<>();
        for (int i = 0; i < question.length(); i++) {
            String charString = String.valueOf(question.charAt(i));
            if (duplicateCheck.containsKey(charString))
                throw new IllegalArgumentException("invalid argument");
            else
                duplicateCheck.put(charString, 0);
        }

        return null;
    }
}
