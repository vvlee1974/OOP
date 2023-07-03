package org.example.lesson2.homework;

public class Human extends Players {
    int runLimit;
    int jumpLimit;

    public Human(String name, int runLimit, int jumpLimit) {
        super(name);
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run(int size) {
        if (size > this.runLimit){
            System.out.println(super.name + " не смог пробежать");
        }else {
            System.out.println(super.name + " пробежал");
        }
    }

    @Override
    public void jump(int size) {
        if (size > this.jumpLimit){
            System.out.println(super.name + " не смог перепрыгнуть");
        }else {
            System.out.println(super.name + " перепрыгнул");
        }
    }

}
