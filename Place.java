package com.ohgiraffers.section00.hw;

import java.util.Random;

public class Place {

    public Place() {}

    int searchP;
    int sleepP;


    Random random = new Random();
    double min = 0.0;
    double max = 1.0;
    double range = max - min;

    public boolean randomAct (double probability) {

        double randomValue = random.nextDouble() * range;
        return randomValue <= probability;
    }


    public void search() {
        if (randomAct(range)) {
            System.out.println("탐색 성공");
        } else {
            System.out.println("탐색 실패");
        }
    }

    public void sleep() {
        if (randomAct(range)) {
            System.out.println("휴식 성공");
        } else {
            System.out.println("휴식 실패");
        }
    }



}
