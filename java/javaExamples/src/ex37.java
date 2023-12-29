public class ex37 {
    public static void main(String[] args) {

        //문자열 관련 함수들
        String str = "This is my mom!";

        //문자열의 길이
        System.out.println(str.length());

        //문자열 비교 ==(숫자비교할때만 씀)
        // .equals 사용
        String str2 = "This is my papa!";
        System.out.println(); //주소를 비교하는 것
        System.out.println(str.equals(str2));//내용 비교

        //문자열 치환 replaceAll
        String str3 = str.replaceAll("mom", "hero");
        //문자열 일부 가져오기 substring    시작인덱스 끝인덱스
        System.out.println(str.substring(8, 11));
        //문자 한자 가져오기 charAt
        char ch = str.charAt(5);
        System.out.println(ch);


        //연습
        String str4 = "java programming is good!";
        //1. str4의 문자열의 길이를 출력
        //2. good 문자열을 perfect로 치환하여 출력
        //3. "programming" 문자열만 가져와서 출력
        //4. str4의 'i'문자가 몇개인지를 갯수를 출력

        System.out.println(str4.length());
        String str5 = str4.replaceAll("good", "perfact");
        System.out.println(str5);
        System.out.println(str4.substring(5, 16));
        int c = 0;
        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'i') {
                c++;
            }
        }
        System.out.println(c);


        //특정문자열의 시작 인덱스 얻어오기 indexOf
        String str6 = "Java Programmin is Good!";
        System.out.println(str6.indexOf("Programming"));
        //영소문자로 바꾸기
        System.out.println(str6.toLowerCase());
        //영대문자로 바꾸기
        System.out.println(str6.toUpperCase());
        //문자열 연결하기 + concat함수
        String str7 = "Spring is also Good!";
        System.out.println(str6.concat(" "));

        String str8 = " This is Trimed String ";
        //문자열의 시작과 끝의 공백을 제거 Trim
        System.out.println(str8.trim());
        //모든 공백을 제거 replaceAll
        System.out.println(str8.replaceAll(" ", ""));

        //특정 문자열을 포함하는지? true/ false
        System.out.println(str7.contains("Spring"));
        //문자열을 분리(Tokenizing, Split)
       /* String[] arrayStr = str7.split(" ");
         for (String s : arrayStr){
           System.out.println(s);
         }*/
        //연습
        String str9 = "Web Programming is funny~";
        //1. "funny"의 시작인덱스를 출력
        //2. str9를 모두 소문자
        //3.   ''   모두 대문자
        //4. str7과 str9를 concat함수를 이용하여 연결하여 출력
        String test = " This is Test ";
        //5. test문자열을 시작과 끝 공백을 제거 출력
        //6. str9dml 모든 공백을 *로 채워서 출력
        //7. str9가 web 문자열을 포함하는지 true/false로 출력
        //8. str9를 문자열배열로 만들고 ,
        //  그중에 "Web"과 "Funny~"만 출력

        //1
        System.out.println(str9.indexOf("funny~"));
        //2
        System.out.println(str9.toLowerCase());
        //3
        System.out.println(str9.toUpperCase());
        //4
        System.out.println(str7.concat(str9));
        //5
        System.out.println(test.trim());
        //6
        String str10 = str9.replaceAll(" ", "*");
        System.out.println(str10);
        //7
        System.out.println(str9.contains("Web"));
        //8
        String[] arrayStr1 = str9.split(" ");

            System.out.println(arrayStr1[0]+","+arrayStr1[3]);



        }
    }

