package org.example.lesson3.homework;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    private String name;
    protected int wordLength;
    protected int tryCount;
    protected String word;
    protected GameStatus status = GameStatus.INIT;

    public AbstractGame(int wordLength, int tryCount, String word, GameStatus status) {
        this.wordLength = wordLength;
        this.tryCount = tryCount;
        this.word = word;
        this.status = status;
    }

    public AbstractGame() {
    }

    public String getName() {
        return name;
    }
    public int getWordLength() {
        return wordLength;
    }

    @Override
    public String start(int wordLength, int attempts) {
        status = GameStatus.START;
        this.wordLength = wordLength;
        this.tryCount = attempts;
        word = generateWord();
        return word;
    }

    @Override
    public String startRuGame(int wordLength, int tryCount) {
        status = GameStatus.START;
        String[] ruWord = {"баня", "дичь", "сито", "стол"};
        Random random = new Random();
        int r1 = random.nextInt(ruWord.length);
        this.wordLength = ruWord[r1].length();
        this.tryCount = tryCount;
        this.word = ruWord[r1];
        return word;
    }

    @Override
    public String startEngGame(int wordLength, int tryCount) {
        status = GameStatus.START;
        String[] engWord = {"base", "rose", "word", "answer"};
        Random random = new Random();
        int r2 = random.nextInt(engWord.length);
        this.wordLength = engWord[r2].length();
        this.tryCount = tryCount;
        word = engWord[r2];
        return word;
    }

    @Override
    public Answer inputValue(String input) {
        if ((tryCount--) == 0) {
            status = GameStatus.FINISH;
            return null;
        }
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            if (word.contains(String.valueOf(input.charAt(i)))) {
                cows++;
            }
        }
        if (bulls == wordLength) {
            status = GameStatus.WIN;
        }
        return new Answer(bulls, cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }

    private String generateWord() {
        List<String> strList = generateCharList();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordLength; i++) {
            int idx = random.nextInt(strList.size());
            sb.append(strList.get(idx));
            strList.remove(idx);
        }
        return sb.toString();
    }

    public abstract List<String> generateCharList();
}