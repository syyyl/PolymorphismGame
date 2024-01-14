package com.ohgiraffers.section00.hw;

import java.awt.*;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        // 게임 시작, 캐릭터 생성

        int randomHp = (int) ((Math.random() * 51) + 50); //캐릭터 채력 랜덤 생성 50부터 100까지
        Game game = new Game("김개발",randomHp);
        Scanner sc = new Scanner(System.in);
        boolean executeProgram = true;

        while(executeProgram){
            game.gameStartPrint(); //게임 시작 문구
            String str1 = sc.nextLine();

            if(str1.toLowerCase().equals("y")){
                game.gameInfoPrint();
                game.gameCharacter();

                //장소 선택


                Place place = new Place();
                Home home = new Home();
                Apartment apartment = new Apartment();
                School school = new School();

                int dayCount = 1;

                while (game.getCharacterHp() > 0 && game.getCharacterHp() < 100) {
                    System.out.println("=================== " + dayCount + "일차 ===================");
                    dayCount++;


                    System.out.println("하루동안 시간을 보낼 장소를 선택해주세요. ");
                    System.out.println("1.집  2.학교  3.아파트");
                    int choicePlace = sc.nextInt();
                    //            sc.nextLine(); // 입력 버퍼 정리 (오류해결)

                    if (choicePlace == 1) {
                        System.out.println("───────────────────────────────────────────");
                        System.out.println("============== 집을 탐색합니다. ==============");
                        home.search(game);
                        System.out.println("=============== 밤이 되었습니다 ==============");
                        System.out.println("휴식을 시작합니다.");
                        home.sleep(game);
                    } else if (choicePlace == 2) {
                        System.out.println("============= 학교를 탐색합니다. =============");
                        apartment.search(game);
                        System.out.println("============== 밤이 되었습니다 ==============");
                        System.out.println("휴식을 시작합니다.");
                        apartment.sleep(game);
                    } else if (choicePlace == 3) {
                        System.out.println("============ 아파트를 탐색합니다. ============");
                        school.search(game);
                        System.out.println("============== 밤이 되었습니다 ==============");
                        System.out.println("휴식을 시작합니다.");
                        school.sleep(game);
                    } else {
                        System.out.println("올바른 숫자를 선택해주세요.");
                    }


                }

                if (game.getCharacterHp() > 100) {
                    System.out.println("생존에 성공했습니다.");
                    System.out.println("게임을 종료합니다.");
                    System.exit(0);
                } else {
                    System.out.println("생존에 실패했습니다.");
                    System.out.println("게임을 종료합니다.");
                    System.exit(0);
                }


                String str2 = sc.nextLine();
                if(str2.toLowerCase().equals("n")){
                    game.gameExitPrint();
                    executeProgram = false; // (추가) 프로그램 종료
                }
            }else if(str1.toLowerCase().equals("n")) {
                game.gameExitPrint();//게임 종료 문구
                executeProgram = false; // (추가) 프로그램 종료
            } else {
                System.out.println();
                System.out.println();
                System.out.println("잘못 누르셨습니다. 다시 입력해주세요.");
            }
        }










    }
}
