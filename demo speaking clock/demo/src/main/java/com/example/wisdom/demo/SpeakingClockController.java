package com.example.wisdom.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clock")
public class SpeakingClockController {
    private final SpeakingClockService speakingClockService;

    @Autowired
    public SpeakingClockController(SpeakingClockService speakingClockService) {
        this.speakingClockService = speakingClockService;
    }

    @GetMapping("/{time}")
    public String convertTimeToWords(@PathVariable String time) {
        return speakingClockService.convertTimeToWords(time);
    }
}
