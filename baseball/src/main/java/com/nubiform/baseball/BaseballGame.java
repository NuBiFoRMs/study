package com.nubiform.baseball;

public class BaseballGame {
    public BaseballGame(String answer) {
    }

    public GameResult guess(String question) {
        if (question == null || "".equals(question))
            throw new IllegalArgumentException("invalid argument");

        if (!question.matches("^[0-9]{3}$]"))
            throw new IllegalArgumentException("invalid argument");

        return null;
    }
}
