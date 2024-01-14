package game2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        int randomHp = (int) ((Math.random() * 51) + 50); //캐릭터 채력 랜덤 생성 50부터 100까지
        Place place = new Place();
        int fixHp = place.fixRandomNum(40,80); //초기 HP를 40~80사이 랜덤으로 설정
        Setting game = new Setting("김개발",fixHp);
        Scanner sc = new Scanner(System.in);
        boolean executeProgram = true;
        int placeIndex =2;

        while(executeProgram){
            game.gameStartPrint(); //게임 시작 문구
            String str1 = sc.nextLine();

            if(str1.toLowerCase().equals("0")){
                game.gameInfoPrint1();
                String str2 = sc.nextLine();

                if(str2.toLowerCase().equals("9")){
                    game.gameExitPrint();

                }else if(str2.isEmpty()){
                    game.gameInfoPrint2();
                    String str3 = sc.nextLine();

                    if(str3.isEmpty()){

                        game.gameCharacter();
                        int i = 0;

                        while(true){ // 이 안에 게임 내용 넣기

                            game.gameDayPrint(i,placeIndex);
                            game.gameAction();

                            int choiceNum = sc.nextInt();
                            // System.out.println(fixHp + "현재 HP값");



                            switch (choiceNum) {
                                case 1:
                                    fixHp = Math.max(0, Math.min(fixHp, 100));

                                    fixHp = place.search(fixHp, 0.7); // 선택지 1을 선택한 경우, 50% 확률로 HP 감소
                                    place.choicePlace();
                                    placeIndex = (sc.nextInt())-1;

                                    fixHp = Math.max(0, Math.min(fixHp, 100)); // fixHp 값을 0과 100 사이로 제한

                                    if (fixHp <= 0) {
                                        System.out.println("좀비에게 물렸습니다. HP가 0이 되어 게임 오버입니다. ");
                                        System.exit(0);
                                    } else if (fixHp >= 100) {
                                        System.out.println("축하합니다! HP가 100을 넘어 게임을 클리어했습니다.");
                                        System.out.println("     이제 구역을 넘어갈 체력이 생겼습니다. ");
                                        System.out.println("            꼭 살아 남으십시오! ");
                                        System.out.println("            게임을 종료 합니다.");
                                        System.exit(0);
                                        System.exit(0);
                                    }
                                     break;
                                case 2:
                                    fixHp = place.sleep(fixHp, 0.4); // 선택지 2를 선택한 경우, 30% 확률로 HP 감소
                                    place.choicePlace();
                                    placeIndex = sc.nextInt();
                                    if(fixHp >= 100) {
                                        System.out.println("축하합니다! HP가 100을 넘어 게임을 클리어했습니다.");
                                        System.out.println("     이제 구역을 넘어갈 체력이 생겼습니다. ");
                                        System.out.println("            꼭 살아 남으십시오! ");
                                        System.out.println("            게임을 종료 합니다.");
                                        System.exit(0);
                                    }else if(fixHp <= 0){
                                        System.out.println("좀비에게 물렸습니다. HP가 0이 되어 게임 오버입니다. ");
                                        System.exit(0);
                                    }
                                    break;
                                case 9:
                                    game.gameExitPrint(); // 선택지 9를 선택한 경우, 게임종료
                                    break;
                                default:
                                    System.out.println("잘못된 선택입니다.");
                                    break;
                            }
                            i++;

                        }

                    }
                }
            }else if(str1.toLowerCase().equals("9")) {
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

        game.gameExitPrint();



    }
}
