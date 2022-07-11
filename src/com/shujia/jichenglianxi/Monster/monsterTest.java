package com.shujia.jichenglianxi.Monster;


public class monsterTest {
    public static void main(String[] args) {
        Snake snake = new Snake("蛇妖甲", 5, 20);
        snake.attack();
        if (snake.getPh() < 10) {
            snake.addph();
        }
        snake.move();
        System.out.println("=====================================");
        CentipedeEssence centipedeEssence = new CentipedeEssence("蜈蚣精", 60, 15);
        centipedeEssence.attack();
        centipedeEssence.move();
    }
}