import java.util.Scanner;
import java.util.Random;
public class ex70 {
    static class Monster{
        int health = 100;
        int defence = 10;
        int attack = 10;
         void damaged(int damage){

            health = health - (damage-defence);

            System.out.println("몬스터가 " + (damage - defence) + " 만큼 데미지를 입었습니다 ");
            if (health<=0){
                System.out.println("몬스터 사망");
            }
        }
    }

static class Boss  {
    int health = 300;

    int defence = 30;
    int attack = 100;

    void damaged(int damage) {

        health = health - (damage - defence);
        System.out.println("보스가 " + (damage - defence) + " 만큼 데미지를 입었습니다 ");
        if (health <= 0) {
            System.out.println("보스 사망");
        }
    }
}

static class Hero {
    int health = 500;
    int defence = 10;
    int attack = 50;
    void damaged(int damage) {

    health = health - (damage - defence);
    if ((damage - defence)>0){
        System.out.println("주인공이 " + (damage - defence) + " 만큼 데미지를 입었습니다 ");
    } else if ((damage - defence)<=0) {
        System.out.println("주인공이 공격을 막았습니다");
        health = health + (damage - defence);
    }
        if (health <= 0) {
        System.out.println("주인공 사망");

    }
}


}














    public static void main(String[] args) {

        Monster mo = new Monster();
        Boss bo = new Boss();
        Hero he = new Hero();

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();





        System.out.println("주인공이 몬스터를 조우했다");
        for (;;) {

            System.out.println("주인공의 공격");
            mo.damaged(he.attack);
            he.damaged(mo.attack);

            if (mo.health <= 0) {
                break;
            } else if (he.health <= 0) {
                break;
            }
        }
        System.out.println("주인공이 보스와 전투를 시작한다");
        for (;;){

            int c = ra.nextInt(9);

                if (c==0||c==1||c==2){
                    System.out.println("치명타 발동");
                    bo.damaged(he.attack*3);
                    he.damaged(bo.attack);
                }else {
                    bo.damaged(he.attack);
                    he.damaged(bo.attack);
                }
                if (bo.health<=0){
                    break;
                } else if (he.health<=0) {
                    break;
                }




        }



        //연습
        //길동이가 게임개발자가 되어 몬헌을 개발하고있다
        //일반몹 보스몹을 객체지향으로 개발중
        //또한 주인공 객체도 개발중이다
        //아래와 같이 클래스를 설계하고 몬스터와 주인공이 모의 전투를 실행하시오


        // - 클래스이름: Monster
        // - 속성
        //   + 체력 : int health 초기값 100
        //   + 방어력 : int defence 초기값 10
        //   + 공격력 : int attack 초기값 10
        // - 행동
        //   +데미지 : damaged() 체력이 damaged만큼 깍임
        //          : 방어력만큼 깍인후에 체력이 깍임

        // - 클래스이름: Boss
        // - 속성
        //   + 체력 : int health 초기값 300
        //   + 방어력 : int defence 초기값 30
        //   + 공격력 : int attack 초기값 100
        // - 행동
        //   +데미지 : damaged() 체력이 damaged만큼 깍임
        //          : 방어력만큼 깍인후에 체력이 깍임

        // - 클래스이름: Hero
        // - 속성
        //   + 체력 : int health 초기값 500
        //   + 방어력 : int defence 초기값 100
        //   + 공격력 : int attack 초기값 50
        // - 행동
        //   +데미지 : damaged() 체력이 damaged만큼 깍임
        //          : 방어력만큼 깍인후에 체력이 깍임

        //4. 주인공, 보스, 몬스터의 객체를 생성하고
        // 주인공이 몬스터를 공격해서 (damaged함수호출) 체력이 0이하가 되도록 하시오
        // 출력예) 주인공이 몬스터 공격 50
        //        몬스터: damaged 50
        //        몬스터: dead!
        // 주인공이 보스를 공격한다. 치명타 확률은 30프로이다
        // 치명타를 때리면 공격력이 3배상승
        // 보스 체력이 0이하가 되도록 공격
        // 출력예) 주인공이 보스 공격 50
        //        몬스터: damaged 50
        //        치명타 발동! 몬스터: damaged 150
        //        몬스터: dead!

    }







}


