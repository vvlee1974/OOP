package org.example.lesson3.classwork.ex303;

import java.util.Scanner;

//3)Разработка игры “быки - коровы” (игрок против компьютера)
//a)Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue,getGameStatus)
//b)Абстрактный класс AbstractGame (который предзаполняет слово компьютера - generateWord(), на основе generateCharList() - который является абстрактным методом)
//c)Статусная модель с помощью перечислений(GameStatus)
//d)Класс ответа Answer
//e)Классы реализующие AbstractGame(предполагается игра на числах,англ буквах, русских буквах)
//f)* реализовать restart().
public class Main {
    public static void main(String[] args) {
        AbstractGame game = new NumberGame();
        System.out.println(); // todo: comment Of the Year
        Scanner scanner = new Scanner(System.in);
        int wordLength = scanner.nextInt();

    }
}
