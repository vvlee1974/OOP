package org.example.lesson2.homework;

public class Robot implements Skills {
    private Obstacle currentStage;
    private String name;
    int runLimit;
    int jumpLimit;

    public Robot(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public Robot() {
    }

    @Override
    public boolean jump(int limit) {
        boolean x;
        if (limit > jumpLimit) {
            System.out.println(name + " - не смог перепрыгнуть...");
            x = false;
        } else {
            System.out.println("\t\t\t\t" + name + " - перепрыгнул!");
            x = true;
        }
        return x;
    }

    @Override
    public boolean run(int limit) {
        boolean x;
        if (limit > runLimit) {
            System.out.println(name + " - не смог пробежать...");
            x = false;
        } else {
            System.out.println("\t\t\t\t" + name + " - пробежал!");
            x = true;
        }
        return x;
    }

    @Override
    public void start(Obstacle stage) {
        if (currentStage == null) {
            stage.begin();
            currentStage = stage;
        } else {
            System.out.println();
        }
    }

    @Override
    public void stop(Obstacle obstacle) {
        if (currentStage != null) {
            currentStage.end();
            currentStage = null;
        } else {
            System.out.println();
        }
    }
}
