package game;

import java.awt.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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
                String str2 = sc.nextLine();
                if(str2.toLowerCase().equals("n")){
                    game.gameExitPrint();
                }
            }else if(str1.toLowerCase().equals("n")) {
                game.gameExitPrint();//게임 종료 문구
            } else {
                System.out.println();
                System.out.println();
                System.out.println("잘못 누르셨습니다. 다시 입력해주세요.");
            }
        }



    }
}
