package game2;

import java.util.Scanner;

public class Setting {
    //필드

    private String characterName;
    private int characterHp;
    private int countDay;

    //생성자

    public Setting(){}

    public Setting(String characterName, int characterHp) {
        this.characterName = characterName;
        this.characterHp = characterHp;
    }

//    public Setting(int countDay) {
//        this.countDay = countDay;
//    }

    //메소드
        //--method
        public void gameStartPrint() {  //게임 시작을 알리는 출력 메소드
            System.out.println();
            System.out.println("┌─────────────────────────────────────────┐");
            System.out.println("           게임을 시작 하시겠습니까?");
            System.out.println("└─────────────────────────────────────────┘");
            System.out.print("         게임 시작 0  │  게임 종료 9    : ");
        }
        public void gameExitPrint() {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("┌─────────────────────────────────────────┐");
            System.out.println("           게임을 종료 하시겠습니까?");
            System.out.println("└─────────────────────────────────────────┘");
            System.out.print("          게임 종료 0  │  돌아 가기 9    : ");
            String str1 = sc.nextLine();
                if(str1.toLowerCase().equals("0") /*|| str1.toLowerCase().equals("n")*/ ) {
                    System.out.println();
                    System.out.println();
                    System.out.println("게임을 종료합니다...");
                    System.exit(0);
                } else if(str1.toLowerCase().equals("9")) {

                }else {
                    System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
                }
        }
        public void gameInfoPrint1() {
            System.out.println();
            System.out.println();
            System.out.println("[좀비 촹궐] 게임을 시작합니다...");
            System.out.println();
            System.out.println("┌─────────────────────────────────────────┐");
            System.out.println("    [좀비 촹궐]에 오신것을 환영합니다.(Enter)");
            System.out.println("└─────────────────────────────────────────┘");
        }
        public void gameInfoPrint2() {
            System.out.println();
            System.out.println("[[간단한 설명]]");
            System.out.println();
            System.out.println("학원에서 개발을 배우던 중,");
            System.out.println("갑작스럽게 좀비 사태가 발생 했습니다.");
            System.out.println("가까스로 목숨을 건진 당신!");
            System.out.println("사태가 해결되기 전까지 살아남으세요.");
            System.out.println();
            System.out.println("*HP가 0이 되면 죽습니다.");
            System.out.println("-파밍해서 자원을 얻거나, 휴식을 통해 HP는 증가합니다.");
            System.out.println("-하루가 지나면 장소를 이동할 수 있습니다.");
            System.out.println("-HP가 100을 달성하면 구출됩니다.");
            System.out.println();
            System.out.println("===========================================");
            System.out.println("───────준비가 되셨으면 Enter를 눌러주세요───────");
            System.out.println("===========================================");
        }
        public void gameCharacter() {
            //System.out.println("┌─────────────────────────────────────────┐");
            System.out.println("           캐릭터가 생성 되었습니다.");
            //System.out.println("└─────────────────────────────────────────┘");
            System.out.println();
            System.out.println("              이름 : " + characterName);
            System.out.println("                HP : " + characterHp);
        }


        public void gameDayPrint(int countDay, int placeIndex) {
            String[] placeName = {"아파트","집","hi학원"};
            System.out.println();
            //System.out.println("┌─────────────────────────────────────────┐");
            System.out.println("      [ " + (countDay+1)+" 일차 ] " + "현재 위치는 '" + placeName[placeIndex] + "'입니다.");
           // System.out.println("└─────────────────────────────────────────┘");
            System.out.println();
        }
        public void gameAction(){
            System.out.println();
            System.out.println("┌─────────────────────────────────────────┐");
            System.out.println("           어떤 행동을 하시겠습니까?");
            System.out.println("         1.탐색  2.휴식  9.게임종료");
            System.out.println("└─────────────────────────────────────────┘");
        }
        public void clearMessage() {
            System.out.println();
            System.out.println("    축하합니다!! HP가 100이 되어 구역을 벗어나 ");
            System.out.println("     구조지역으로 이동할 수 있게 되었습니다.");
            System.out.println("      게임을 성공적으로 Clear 하셨습니다.");
            System.out.println();
            System.out.println("게임을 종료합니다...");
            System.exit(0);
            System.out.println();
        }


        //--getter

        //--setter

}
