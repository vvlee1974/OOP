package org.example.lesson3.classwork.ex303;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{
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

    @Override
    public void start(int wordLength, int countTry) {
        status = GameStatus.START;
        this.wordLength = wordLength;
        this. tryCount = countTry;
        word = generateWord();
    }

    @Override
    public Answer inputValue(String input) {
        if (status == GameStatus.FINISH){
            return null;
        }
        int bulls = 0;
        int cows = 0;

        // todo: дополнить
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
        //todo: word generation
        for (int i = 0; i < wordLength; i++) {
            int idx = random.nextInt(strList.size());
            sb.append(strList.get(idx));
            strList.remove(idx);
        }
        return sb.toString();
    }

    public List<String> generateCharList(){
        return generateCharList();
    }
}
