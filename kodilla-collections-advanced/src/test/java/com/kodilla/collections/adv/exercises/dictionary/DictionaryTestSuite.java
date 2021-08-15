package com.kodilla.collections.adv.exercises.dictionary;

import jdk.nashorn.api.tree.ArrayLiteralTree;
import org.graalvm.compiler.hotspot.nodes.EndLockScopeNode;
import org.junit.jupiter.api.Test;
import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord() {
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        dictionary.addWord(polishWord, englishWord);
        assertEquals(1, dictionary.size());
    }

    @Test
    void findEnglishWords() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        List<EnglishWord> result = dictionary.findEnglishWords( "gra");
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        assertEquals(expectedList, result);
    }

    @Test
    void testFindEnglishWords_withPartOfSpeech() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        List<EnglishWord> result = dictionary.findEnglishWords("brać", PartOfSpeech.NOUN);
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        assertEquals(expectedList,result);

    }
}