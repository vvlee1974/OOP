package org.example.lesson2.claasswork.ex201;
//4)Создать метод свернуться в клубок у кота.
public class Main {
    public static void main(String[] args) {
 /*       Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
        cat.setName("Тиша");
        cat.setColor("Black");
        cat.setAge(31);
        System.out.println("cat = " + cat);
        cat.jump();
        cat.voice();
        cat.animalInfo();*/

        Animal[] catAndDogs = new Animal[]{
                new Cat("qwe", "asd", 21),
                new Dog("bobik", "black", 31)
        };
        for (Animal o : catAndDogs) {
            o.voice();
        }
        Animal cat = new Cat("a","b",1);
        ((Cat) cat).klubok();


    }
}