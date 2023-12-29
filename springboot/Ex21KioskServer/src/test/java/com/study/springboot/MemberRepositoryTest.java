package com.study.springboot;

import com.study.springboot.entity.MemberEntity;
import com.study.springboot.entity.MemberRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


//@DataJpaTest : JPA 테스트를 위한 스프링 어노테이션
//@ExtendWith : Junit5의 라이프 사이클에 Test에서 사용할 기능을 확장할때 사용된다
@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // 실제 구성된 db 사용
class MemberRepositoryTest{


    //Test코드에서는 생성자 주입 안됨
    //필드 주입으로 대체
    @Autowired
    MemberRepository memberRepository;

    @BeforeAll // 처음에 한번 호출
    static void beforeAll(){
        //setup

    }
    void setup(){

        MemberEntity memberEntity = MemberEntity.builder()
                .id(0L)
                .userId("hong")
                .userPw("1234")
                .userRole("role_user")
                .joindate(LocalDate.parse("2023-10-01"))
                .build();
        memberRepository.save(memberEntity);

        memberEntity = MemberEntity.builder()
                .id(0L)
                .userId("lee")
                .userPw("2222")
                .userRole("role_admin")
                .joindate(LocalDate.parse("2023-11-01"))
                .build();
        memberRepository.save(memberEntity);

        memberEntity = MemberEntity.builder()
                .id(0L)
                .userId("hana")
                .userPw("3333")
                .userRole("role_guest")
                .joindate(LocalDate.parse("2023-12-01"))
                .build();
        memberRepository.save(memberEntity);

    }
    @AfterAll // 마지막에 한번 호출
    static void afterAll(){
        //clean
    }
    @BeforeEach // 매 테스트 마다 호출
    void beforeEach(){
        setup();
    }
    @Test
    @DisplayName("save테스트")
    public void save(){
        //given
        MemberEntity memberEntity = MemberEntity.builder()
                .id(0L)
                .userId("hong")
                .userName("홍길동")
                .userPw("1234")
                .userRole("role_user")
                .joindate(LocalDate.now())
                .build();
        MemberEntity newEntity = memberRepository.save(memberEntity);
        //when & then
        assertEquals(newEntity.getUserId(), memberEntity.getUserId());
    }
    @Test
    @DisplayName("findAll 테스트")
    public void findAll(){

        //given




        //when&then
        List<MemberEntity> list = memberRepository.findAll();
        assertEquals(6,list.size());
        MemberEntity memberEntity = list.get(0);
        assertThat(memberEntity.getUserId()).isEqualTo("hong");

    }
    @Test
    @DisplayName("findById 테스트")
    public void findById(){

        //given


        MemberEntity memberEntity = memberRepository.findById(1L).get();
        Optional<MemberEntity> optional = memberRepository.findById(Long.valueOf(2));
//        Optional<MemberEntity> optinal2 = memberRepository.findById(Long.valueOf(1));
        if ( optional.isPresent() ){

            MemberEntity memberEntity1 = optional.get();

        }else {
            System.out.println("널입니다");
        }
        //null safety - 람다식 표현
        optional.ifPresent( memberEntity2 ->{
            System.out.println( memberEntity.getUserId());
                }
        );


//        when&then
        assertEquals("hong",memberEntity.getUserId());

    }

    @Test
    @DisplayName("count 테스트")
    public void count(){
        //given
        //SQL : SELECT COUNT(*) FROM member;
        long count = memberRepository.count();

        System.out.println("count:" + count);
        //when & then
        assertEquals(3,count);



    }


    @Test
    @DisplayName("update 테스트")
    public void update(){

        //given
        Optional<MemberEntity> optional = memberRepository.findById( 1L );

        optional.ifPresent( memberEntity -> {
            //when&then
            memberEntity.setUserId("Lee");
            MemberEntity newEntity = memberRepository.save( memberEntity );
            assertEquals( newEntity.getUserId(), memberEntity.getUserId());
        });





    MemberEntity memberEntity2 = MemberEntity.builder().id(0L)
            .userId("lee")
            .userName("이순신")
            .userPw("1234")
            .userRole("role_user")
            .joindate(LocalDate.now())
            .build();
    }




    @Test
    @DisplayName("delete 테스트")
    public void delete(){

        Optional<MemberEntity> member = memberRepository.findById(1L);
        member.ifPresent(memberEntity -> {
            memberRepository.delete(memberEntity);

            Optional<MemberEntity> member2 = memberRepository.findById( 1L );
            System.out.println("member2:" + member2);
        });



    }


    @Test
    @DisplayName("findByUserId")
    public void findByUserId(){
        // given
        List<MemberEntity> list = memberRepository.findByUserId("hong");


        // when & then
        assertThat(list.size()).isEqualTo(3);


        List<MemberEntity> list2 = memberRepository.findByUserId_JPQL("hong");
        assertThat(list2.size()).isEqualTo(3);

        List<MemberEntity> list3 = memberRepository.findByUserId_nativeQuery("hong");
        assertThat(list3.size()).isEqualTo(3);



    }

    @Test
    @DisplayName("updateById_nativeQuery")
    public void updateByUserId(){

        int result = memberRepository.updateByUserId_NativeQuery("lee",1L);
        assertEquals(result,1);
    }

//    @Test
//    @DisplayName("기본함수 Query 테스트")
//    public void queryTest(){



        //문제1
        //user_id가 hong이고, user_pw가 1234인 행의 갯수를 출력하시오.
//        List<MemberEntity> list = memberRepository.findByUserId_nativeQuery1("hong",1234);
//        System.out.println(list.size());

        //문제2
        //user_id에 "h"가 들어간 행의 갯수를 출력하시오.
//        List<MemberEntity> list2 = memberRepository.findByUserId_nativeQuery2("h");
//        System.out.println(list2.size());

        //문제3
        //문제2에서 처음 2개만 출력하시오. limit 2
//        List<MemberEntity> list3 = memberRepository.findByUserId_nativeQuery3("h");
//        System.out.println(list3);

        //문제4
        //오늘날짜(2023-10-17)보다 더 이후에 가입한 회원의 아이디만 출력하시오




//    }
@Test
@DisplayName("확장 함수 Query 테스트")
public void queryTest(){
    //문제1
    //user_id가 "hong"이고, user_pw가 "1234"인 행의 갯수를 출력하시오. 출력:1
    List<MemberEntity> list = memberRepository.findByUserIdAndUserPw("hong", "1234");
    System.out.println(list.size());
    //문제2
    //user_id에 "h"가 들어간 행의 갯수를 출력하시오. 출력:2
    list = memberRepository.findByUserIdContaining("h");
    System.out.println(list.size());
    //문제3
    //member 테이블의 모든 행에서 처음 2개만 출력하시오. 정렬방식은 joindate의 내림차순이다.
    list = memberRepository.findFirst2ByOrderByJoindateDesc();
    System.out.println(list.size());
    for(MemberEntity m : list){
        System.out.println(m.getUserId());
    }
    //문제4
    //오늘날짜(2023-10-17)보다 더 이후에 가입한 회원의 아이디만 출력하시오.
    list = memberRepository.findByJoindateGreaterThanEqual(LocalDate.now());
    for(MemberEntity m : list){
        System.out.println(m.getUserId());
    }
}


}