package com.orchid.TypeRacerBackend.service;

import com.orchid.TypeRacerBackend.entity.Word;
import com.orchid.TypeRacerBackend.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.SplittableRandom;
import java.util.function.IntConsumer;

@Service
@RequiredArgsConstructor
public class WordService {

    @Autowired
    private WordRepository wordRepository;

    public List<Word> getWords(){
        return wordRepository.findAll();
    }

    /**
     * Generate a paragraph based on random words from database
     * @param size number of words to be generated
     * @return list containing random words
     */
    public List<Word> getRandomText(int size) throws IllegalArgumentException{
        if (size <= 0) {
            throw new IllegalArgumentException("Size cannot be lower than 0");
        }
        List<Word> words = wordRepository.findAll();

        List<Word> generatedText = new ArrayList<>();
        int noOfWords = words.size();
        SplittableRandom random = new SplittableRandom();

        IntConsumer addWord = wordIndex -> {generatedText.add(words.get(wordIndex));};
        random.ints(size, 1, noOfWords).distinct().forEach(addWord);

        return generatedText;
    }
}
