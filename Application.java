package com.ohgiraffers.section00.hw;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1.탐색  2.휴식");
        int choiceNum = sc.nextInt();

        Place place = new Place();


        if (choiceNum == 1) {
            System.out.println("탐색을 시작합니다.");
            place.search();
        } else if (choiceNum == 2) {
            System.out.println("휴식을 시작합니다.");
            place.sleep();
        } else {
            System.out.println("올바른 숫자를 입력해주세요.");
        }

    }
}
