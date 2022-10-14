package com.orchid.TypeRacerBackend.repository;

import com.orchid.TypeRacerBackend.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}

