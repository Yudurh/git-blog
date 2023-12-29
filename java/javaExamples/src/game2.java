import java.util.Random;
public class game2 {

    static int[][] map = new int[10][10];





    public static void main(String[] args) {

        Random ra = new Random();

      for (int i=0; i<20; i++){

        int a = ra.nextInt(10);
        int b = ra.nextInt(10);

        if (map[a][b]!=9){
            map[a][b]=9;
        }else {
            i--;
        }
      }
        for (int i=0; i<10;i++){
            for (int j=0;j<10;j++){
                int count = 0;
                if (map[i][j]!=9){
                    if (i>0 && map[i-1][j]==9){
                        count++;
                    }
                    if (i>0&& j>0 && map[i-1][j-1]==9){
                        count++;
                    }
                    if (j<9 && i>0 && map[i-1][j+1]==9){
                        count++;
                    }
                    if (j<9 && map[i][j+1]==9){
                        count++;
                    }
                    if (j>0 && map[i][j-1]==9){
                        count++;
                    }
                    if (i<9 && map[i+1][j]==9){
                        count++;
                    }
                    if (j>0 && i<9 && map[i+1][j-1]==9){
                        count++;
                    }
                    if (j<9 && i<9 && map[i+1][j+1]==9){
                        count++;
                    }
                    map[i][j]= count;
                }




            }
        }
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if (map[i][j]==9){
                    System.out.print("*" + " ");
                }else {
                    System.out.print(map[i][j] + " ");
                }

            }
            System.out.println();
        }



    }
}
