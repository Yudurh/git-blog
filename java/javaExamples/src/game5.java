import java.util.ArrayList;
import java.util.Scanner;
class Student {
        String name;
        int kor;
        int eng;
        int math;
        //생성자
        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }
public class game5 {
    static ArrayList<Student> scoreList = new ArrayList<>();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            //5. 성적 관리 프로그램
            // ArrayList 클래스 객체 배열을 사용해보자.
            //입력 및 출력 예시
            //-----------성적 관리 프로그램-------------
            //1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 1
            //이름 입력 : 홍길동
            //국어점수 입력 : 70
            //영어점수 입력 : 80
            //수학점수 입력 : 90
            //-----------성적 관리 프로그램-------------
            //1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 : 2
            //이름: 홍길동 국어: 70 영어: 80 수학: 90 총점: 240 평균: 80.0



        for (;;){

            System.out.println("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료");

            int num = sc.nextInt();
        if (num==1) {
        String n = sc.next();
        int k = sc.nextInt();
        int e = sc.nextInt();
        int m = sc.nextInt();
            scoreList.add(new Student(n, k, e, m));
        } else if (num==2) {
            System.out.println(scoreList);
        } else if (num==3) {

            String strSearch = sc.next();
            for (Student student : scoreList) {
                if (strSearch.equals(student.name)) {
                    System.out.println(student.name);
                }
            }
        } else if (num==4) {
            System.out.println("학생이름 입력");
            String nn = sc.next();

        }

        }
        }
    }

