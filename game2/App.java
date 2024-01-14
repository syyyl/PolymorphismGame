package game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Place place = new Place();
        Place[] place1 = new Place[]{new Apartment(), new Home(), new Hiacademy(), new River()};
        int fixHp = place.fixRandomNum(50,80); //초기 HP를 40~80사이 랜덤으로 설정
        Setting game = new Setting("김개발",fixHp);
        Scanner sc = new Scanner(System.in);

        int placeIndex =2;

        while(true){
            game.gameStartPrint(); //게임 시작 문구
            String str1 = sc.nextLine();

            if(str1.equalsIgnoreCase("0")){
                game.gameInfoPrint1();
                String str2 = sc.nextLine();

                if(str2.equalsIgnoreCase("9")){
                    game.gameExitPrint();

                }else if(str2.isEmpty()){
                    game.gameInfoPrint2();
                    String str3 = sc.nextLine();

                    if(str3.isEmpty()){

                        game.gameCharacter();
                        int i = 0;
                        boolean isFirstTure = true;
                        boolean isFirstTure2 = true;

                        while(true) { // 이 안에 게임 내용 넣기
                            if (isFirstTure2) {
                                game.gameDayPrint(i, placeIndex);
                                isFirstTure2 = false; //딱 한번만 실행
                            }else{
                                game.gameDayPrint(i, placeIndex - 1);
                            }

                            game.gameAction();

                            int choiceNum = sc.nextInt();

                            switch (choiceNum) {
                                case 1:
                                    if(isFirstTure){
                                        fixHp = ((Place) place1[2]).search(fixHp, 0.7);
                                        isFirstTure = false; //딱 한번만 실행
                                    }else {
                                        int idx = placeIndex -1;
                                        fixHp = ((Place) place1[idx]).search(fixHp, 0.7); // 선택지 1을 선택한 경우, 70% 확률로 HP 감소
                                    }

                                    if (fixHp == 0) {
                                        game.gameEndPrint();
                                    } else if (fixHp == 100) {
                                        game.gameClearPrint();
                                    }

                                    Place.choicePlace();
                                    placeIndex = sc.nextInt();

                                    break;
                                case 2:
                                    if(isFirstTure){
                                        fixHp = ((Place) place1[2]).sleep(fixHp, 0.7);
                                        isFirstTure = false; //딱 한번만 실행
                                    }else {
                                        int idx = placeIndex -1;
                                        fixHp = ((Place) place1[idx]).sleep(fixHp, 0.7); // 선택지 1을 선택한 경우, 70% 확률로 HP 감소
                                    }

                                    if (fixHp == 0) {
                                        game.gameEndPrint();
                                    } else if (fixHp == 100) {
                                        game.gameClearPrint();
                                    }

                                    Place.choicePlace();
                                    placeIndex = sc.nextInt();

                                    break;
                                case 9:
                                    game.gameExitPrint2(); // 선택지 9를 선택한 경우, 게임종료
                                    break;
                                default:
                                    System.out.println("             잘못된 선택입니다.");
                                    System.out.println(" 잘못된 선택으로 인해 아무일도 일어나지 않았습니다.");
                                    break;
                            }
                            i++;

                        }

                    }
                }
            }else if(str1.equalsIgnoreCase("9")) {
                game.gameExitPrint();//게임 종료 문구
            } else {
                System.out.println();
                System.out.println("===========================================");
                System.out.println("      잘못 누르셨습니다. 다시 입력해주세요.");
                System.out.println("===========================================");
                System.out.println();
            }
        }
        //fixHp = Math.min(fixHp,100 );

        //game.gameExitPrint();



    }
}
