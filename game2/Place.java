package game;

import java.util.Random;

public class Place {


    private int searchP;
    private int sleepP;
    private int countDay;

    public Place() {}


    protected int search(int hp, double probability) {
        if (Math.random() < probability) {
            int damage = fixRandomNum(10, 20);
            hp -= damage;
            System.out.println("           좀비의 습격을 받았습니다!!!");
            System.out.println("       HP : " + damage + " 감소, 현재 HP는 " + Math.max(0, Math.min(hp, 100)) + "입니다.");
            return Math.max(0, Math.min(hp, 100));
        }else if(Math.random() == probability) {
            System.out.println("        아무런 일도 일어나지 않았습니다.");
            return Math.max(0, Math.min(hp, 100));
        }else {
            int recovery = fixRandomNum(10, 20);
            hp += recovery;
            System.out.println("     탐색에 성공하여 물자를 획득하셨습니다. ");
            System.out.println("     HP : " + recovery + " 증가, 현재 HP는 " + Math.max(0, Math.min(hp, 100)) + "입니다.");
            return Math.max(0, Math.min(hp, 100));
        }
    }
    protected int sleep(int hp, double probability) {
        if (Math.random() < probability) {
            int damage = fixRandomNum(10, 20);
            hp -= damage;
            System.out.println("    휴식하는 중 좀비의 습격을 받았습니다!!!");
            System.out.println("     HP : " + damage + " 감소, 현재 HP는 " + Math.max(0, Math.min(hp, 100)) + "입니다.");
            return Math.max(0, Math.min(hp, 100));
        }else if(Math.random() == probability) {
            System.out.println("        아무런 일도 일어나지 않았습니다.");
            return Math.max(0, Math.min(hp, 100));
        }else {
            int recovery = fixRandomNum(10, 20);
            hp += recovery;
            System.out.println("     휴식에 성공하여 HP를 회복 하셨습니다. ");
            System.out.println("     HP : " + recovery + " 증가, 현재 HP는 " + Math.max(0, Math.min(hp, 100)) + "입니다.");
            return Math.max(0, Math.min(hp, 100));
        }
    }

    protected static void choicePlace(){
        System.out.println();
        System.out.println("   하루가 지났습니다. 이동할 장소를 선택해주세요.");
        System.out.println("      1.아파트   2.집   3.hi학원  4.한강");
        System.out.println();
    }
    protected int fixRandomNum(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }
    protected int fixRandomNum99To100() {
        return (int) (Math.random() * (100 - 99 + 1) + 99);
    }



}