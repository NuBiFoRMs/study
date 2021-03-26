package com.nubiform.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseballGameTest {

    private BaseballGame baseballGame;

    @BeforeEach
    public void before() {
        baseballGame = new BaseballGame("123");
    }

    @Test
    public void 입력_값이_없을_경우() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            GameResult gameResult = baseballGame.guess("");
            fail();
        });

        assertEquals("invalid argument", exception.getMessage());
    }
}
