package com.orchid.TypeRacerBackend.controller;

import com.orchid.TypeRacerBackend.entity.Word;
import com.orchid.TypeRacerBackend.service.WordService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/words")
@NoArgsConstructor
public class WordController {

    public static final int TEXT_LENGTH = 120;
    @Autowired
    private WordService wordService;

    @GetMapping()
    public List<Word> getWords() {
        return wordService.getWords();
    }

    @GetMapping(path="/generate")
    public List<Word> getGeneratedText() {
        return wordService.getRandomText(TEXT_LENGTH);
    }
}
