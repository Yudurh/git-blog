public class ex81 {
    public static void main(String[] args) {
        //제네릭 Generic
        //  : JDK 1.5부터 지원하기 시작
        //JDK의 주요버전 1.8(8) 11 17
        //기능 : 형(타입)에 따른 데이타 전송을 편하게 하기 위해
        //    예)다형성은 객체타입(참조변수)만 가능
        //    : 기본8가지타입 + 참조변수(클래스타입)도 가능
        //    : 가변적인 타입 선언이 가능함
        Keyboard1 k1 = new Keyboard1();
        //String -> Object 업캐스팅됨
        k1.setObject( "키보드1" );
        //Object -> String 다운캐스팅됨
        String str1 = (String) k1.getObject();
        k1.setObject(10);
        int n = (int)k1.getObject();
        System.out.println(n);

        //타입선언시에 사용한 타입을 결정해서 사용함
        Keyboard2<String> k2 = new Keyboard2<String>();
        k2.setObject("키보드2");
        String str2 = k2.getObject();

    }
}
class Keyboard1 { //다형성을 이용한 객체타입 유연성 제공
    //Object : 최상위 클래스 - 모든클래스 객테의 타입을 제공할 수 있다.
    private Object object;
    //Getter/Setter


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
class Keyboard2< MyType > { //제네릭을 이용한 타입 유연성 제공
    private MyType object;

    public MyType getObject() {
        return object;
    }

    public void setObject(MyType object) {
        this.object = object;
    }
}