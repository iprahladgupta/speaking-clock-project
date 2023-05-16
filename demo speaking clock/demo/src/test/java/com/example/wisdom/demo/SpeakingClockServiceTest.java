package com.example.wisdom.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpeakingClockServiceTest {
    private SpeakingClockService speakingClockService;

    @BeforeEach
    public void setUp() {
        speakingClockService = new SpeakingClockService();
    }

    @Test
    public void testConvertTimeToWords_Midnight() {
        String time = "00:00";
        String expected = "It's Midnight";
        String result = speakingClockService.convertTimeToWords(time);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testConvertTimeToWords_Midday() {
        String time = "12:00";
        String expected = "It's Midday";
        String result = speakingClockService.convertTimeToWords(time);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testConvertTimeToWords_StandardTime() {
        String time = "08:34";
        String expected = "It's eight thirty four";
        String result = speakingClockService.convertTimeToWords(time);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testConvertTimeToWords_MinuteZero() {
        String time = "09:00";
        String expected = "It's nine o'clock";
        String result = speakingClockService.convertTimeToWords(time);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testConvertTimeToWords_MinutesLessThanTwenty() {
        String time = "10:15";
        String expected = "It's ten fifteen";
        String result = speakingClockService.convertTimeToWords(time);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testConvertTimeToWords_MinutesGreaterThanTwenty() {
        String time = "11:48";
        String expected = "It's eleven forty eight";
        String result = speakingClockService.convertTimeToWords(time);
        Assertions.assertEquals(expected, result);
    }
}
