package com.ohgiraffers.section00.hw;

public class Apartment extends Place {

    public Apartment() {

        double min = 0.0;
        double max = 0.6;
        double range = max - min;

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
}

