package com.example.wisdom.demo;

import org.springframework.stereotype.Service;

@Service
public class SpeakingClockService {
    private static final String[] NUMBERS = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty"};

    public String convertTimeToWords(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour == 0 && minute == 0) {
            return "It's Midnight";
        } else if (hour == 12 && minute == 0) {
            return "It's Midday";
        } else {
            String hourText = getHourText(hour);
            String minuteText = getMinuteText(minute);
            return "It's " + hourText + " " + minuteText;
        }
    }

    private String getHourText(int hour) {
        if (hour > 12) {
            hour -= 12;
        }
        return NUMBERS[hour];
    }

    private String getMinuteText(int minute) {
        if (minute == 0) {
            return "o'clock";
        } else if (minute < 20) {
            return NUMBERS[minute];
        } else {
            int tensDigit = minute / 10;
            int onesDigit = minute % 10;
            return TENS[tensDigit] + " " + NUMBERS[onesDigit];
        }
    }
}