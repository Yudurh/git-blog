public class ex35 {
    public static void main(String[] args) {

        //중첩반복문에서 브레이크나 컨티뉴 사용하는법
        //for문안에 for문에서
        //break할때/ 자기루프 또는 부모루프인지를 선택가능
        //레이블 label을 사용함
        loop1: for (int i=0;i<5;i++){
            System.out.println("i:"+i);
            loop2: for (int j=0;j<5;j++){
                System.out.print(" j:"+j);
                break loop1;
            }
        }
        System.out.println();




    }
}
