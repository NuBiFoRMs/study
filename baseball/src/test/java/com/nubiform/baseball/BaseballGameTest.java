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
    public void 입력_값이_없을_경우_1() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            GameResult gameResult = baseballGame.guess(null);
            fail();
        });

        assertEquals("invalid argument", exception.getMessage());
    }

    @Test
    public void 입력_값이_없을_경우_2() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            GameResult gameResult = baseballGame.guess("");
            fail();
        });

        assertEquals("invalid argument", exception.getMessage());
    }

    @Test
    public void 입력_값의_자리_수가_세_자리가_아닐_경우() {

    }

    @Test
    public void 입력_값에_숫자_외의_문자가_입력될_경우() {

    }

    @Test
    public void 입력_값에_중복된_숫자가_입력될_경우() {

    }

    @Test
    public void 숫자_세_개가_전부_일치하는_경우() {

    }

    @Test
    public void 숫자_세_개가_전부_일치하지_않을_경우() {

    }

    @Test
    public void 스트라이크만_있는_경우() {

    }

    @Test
    public void 볼만_있는_경우() {

    }

    @Test
    public void 볼과_스트라이크가_함께_있는_경우() {

    }
}
