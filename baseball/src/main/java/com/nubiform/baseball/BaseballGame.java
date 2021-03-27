package com.nubiform.baseball;

import java.util.HashMap;
import java.util.Map;

public class BaseballGame {

    public static final String REGEX = "^[0-9]{3}$";
    public static final String INVALID_ARGUMENT = "invalid argument";
    private String answer;

    public BaseballGame(String answer) {
        this.answer = answer;
    }

    public GameResult guess(String question) {
        if (!validateQuestion(question))
            throw new IllegalArgumentException(INVALID_ARGUMENT);

        GameResult gameResult = new GameResult();

        for (int i = 0; i < question.length(); i++) {
            for (int j = 0; j < this.answer.length(); j++) {
                if (this.answer.charAt(i) == question.charAt(j)) {
                    if (i == j) gameResult.strikes++;
                    else gameResult.balls++;
                }
            }
        }

        if (gameResult.strikes == 3) gameResult.solved = true;

        return gameResult;
    }

    private boolean validateQuestion(String question) {
        if (question == null || "".equals(question))
            return false;

        if (!question.matches(REGEX))
            return false;

        Map<String, Integer> duplicateCheck = new HashMap<>();
        for (int i = 0; i < question.length(); i++) {
            String charString = String.valueOf(question.charAt(i));
            if (duplicateCheck.containsKey(charString))
                return false;
            else
                duplicateCheck.put(charString, 0);
        }

        return true;
    }
}
