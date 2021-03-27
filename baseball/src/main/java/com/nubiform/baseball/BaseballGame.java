package com.nubiform.baseball;

import java.util.HashMap;
import java.util.Map;

public class BaseballGame {

    private String answer;

    public BaseballGame(String answer) {
        this.answer = answer;
    }

    public GameResult guess(String question) {
        if (question == null || "".equals(question))
            throw new IllegalArgumentException("invalid argument");

        if (!question.matches("^[0-9]{3}$"))
            throw new IllegalArgumentException("invalid argument");

        Map<String, Integer> duplicateCheck = new HashMap<>();
        for (int i = 0; i < question.length(); i++) {
            String charString = String.valueOf(question.charAt(i));
            if (duplicateCheck.containsKey(charString))
                throw new IllegalArgumentException("invalid argument");
            else
                duplicateCheck.put(charString, 0);
        }

        GameResult gameResult = new GameResult();

        for (int i = 0; i < question.length(); i++) {
            for (int j = 0; j < this.answer.length(); j++) {
                char answerChar = this.answer.charAt(i);
                char questionChar = question.charAt(j);

                if (i == j) {
                    if (answerChar == questionChar) gameResult.strikes++;
                }
                else {
                    if (answerChar == questionChar) gameResult.balls++;
                }
            }
        }

        if (gameResult.strikes == 3) gameResult.solved = true;

        return gameResult;
    }
}
