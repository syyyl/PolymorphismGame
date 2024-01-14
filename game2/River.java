package game;

public class River extends Place{
    public River() {}


    @Override
    protected int search(int hp, double probability) {
        if (Math.random() < probability) {
            int damage = super.fixRandomNum(90, 100); //데미지 90 - 100 랜덤
            hp -= damage;
            System.out.println("      한강에서 좀비의 습격을 받았습니다!!!");
            System.out.println("        HP : " + damage + " 감소, 현재 HP는 " + Math.max(0, Math.min(hp, 100)) + "입니다.");
            return Math.max(0, Math.min(hp, 100));
        }else if(Math.random() == probability) {
            System.out.println("        아무런 일도 일어나지 않았습니다.");
            return Math.max(0, Math.min(hp, 100));
        }else {
            int recovery = super.fixRandomNum(10, 20); //회복은 10 - 20 랜덤
            hp += recovery;
            System.out.println("  한강에서 탐색에 성공하여 물자를 획득하셨습니다. ");
            System.out.println("     HP : " + recovery + " 증가, 현재 HP는 " + Math.max(0, Math.min(hp, 100)) + "입니다.");
            return Math.max(0, Math.min(hp, 100));
        }
    }

    @Override
    protected int sleep(int hp, double probability) {
        if (Math.random() < probability) {
            int damage = super.fixRandomNum(90, 100); //데미지 90 - 100 랜덤
            hp -= damage;
            System.out.println("한강에서 휴식하는 중 좀비의 습격을 받았습니다!!!");
            System.out.println("     HP : " + damage + " 감소, 현재 HP는 " + Math.max(0, Math.min(hp, 100)) + "입니다.");
            return Math.max(0, Math.min(hp, 100));
        }else if(Math.random() == probability) {
            System.out.println("        아무런 일도 일어나지 않았습니다.");
            return Math.max(0, Math.min(hp, 100));
        }else {
            int recovery = super.fixRandomNum(10, 20);  //회복은 10 - 20 랜덤
            hp += recovery;
            System.out.println("  한강에서 휴식에 성공하여 HP를 회복 하셨습니다. ");
            System.out.println("     HP : " + recovery + " 증가, 현재 HP는 " + Math.max(0, Math.min(hp, 100)) + "입니다.");
            return Math.max(0, Math.min(hp, 100));
        }
    }
}
