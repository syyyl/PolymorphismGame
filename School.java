package com.ohgiraffers.section00.hw;

import java.util.Random;

public class School extends Place {

    public School() {}

    Random random = new Random();

    public boolean randomAct (double probability) {
        double randomValue = random.nextDouble();
        return randomValue <= probability;
    }


    public void search(Game game) {
        if (randomAct(0.7)) {
            System.out.println("필요한 물건을 발견했습니다! Hp +10");
            game.changedHp(10);
        } else {
            System.out.println("아무것도 찾지 못했습니다.");
        }
    }

    public void sleep(Game game) {
        if (randomAct(0.4)) {
            System.out.println("충분한 휴식을 취했습니다. Hp +10");
            game.changedHp(10);
        } else {
            System.out.println("밤 사이에 습격을 받았습니다. Hp -10");
            game.changedHp(-10);
        }
    }




}
