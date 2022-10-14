package com.orchid.TypeRacerBackend.service;

import com.orchid.TypeRacerBackend.entity.Word;
import com.orchid.TypeRacerBackend.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WordService {

    @Autowired
    private WordRepository wordRepository;

    public List<Word> getWords(){
        return wordRepository.findAll();
    }

}
