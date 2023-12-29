import java.util.Scanner;
public class game1 {


    static  int[][] map = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,2,1,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,1,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,1,0,0,0,0,0,0,0,1,0,0,1},
            {1,0,0,1,1,1,1,1,0,0,0,1,0,0,1},
            {1,0,0,1,0,0,0,1,0,0,0,1,0,0,1},
            {1,0,0,0,0,0,0,1,0,0,0,1,0,0,1},
            {1,0,0,0,0,0,0,1,0,0,0,1,0,0,1},
            {1,0,0,1,0,0,0,1,0,0,0,1,0,0,1},
            {1,0,0,1,0,0,0,1,1,0,0,1,0,0,1},
            {1,0,0,1,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,1,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,1,0,0,0,0,0,0,0,0,3,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };

   static int hud = 1;
   static int hlr = 2;
   static int move(int a){



       if (a==1 && map[hud][hlr-1]!=1){
           map[hud][hlr]=0;
           hlr--;
           map[hud][hlr]=2;

           return map[hud][hlr];
       }
       if (a==2 && map[hud+1][hlr]!=1){
           map[hud][hlr]=0;
           hud++;
           map[hud][hlr]=2;

           return map[hud][hlr];
       }
       if (a==3 && map[hud][hlr+1]!=1){
           map[hud][hlr]=0;
           hlr++;
           map[hud][hlr]=2;

           return map[hud][hlr];
       }
       if (a==4 && map[hud-1][hlr]!=1){
           map[hud][hlr]=0;
           hud--;
           map[hud][hlr]=2;

           return map[hud][hlr];
       }else {
           return map[hud][hlr];
       }
   }
    static void dispMap(){
        for (int i=0;i< map.length; i++){
            for (int j=0; j<= map.length; j++){
                if ( map[i][j] == 0 ){
                    System.out.print(" ");
                }else if ( map[i][j] == 1){
                    System.out.print("■");
                }else if ( map[i][j] == 2){
                    System.out.print("●");
                }else {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       for (;;){
           String space = sc.next();
           if (space.charAt(0)=='a'){
               move(1);

           }
           else if (space.charAt(0) == 's'){
               move(2);
           }
           else if (space.charAt(0) == 'd'){
               move(3);
           }
           else if (space.charAt(0) == 'w'){
               move(4);
           }
           dispMap();
           if (map[12][12]==2){
               System.out.println("골");
               break;

           }


       }








    }
}
