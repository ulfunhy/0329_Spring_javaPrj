package kr.hs.study.config;


import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링에게 명령을 내리는 설정파일
@Configuration
public class BeanConfigClass {
    @Bean
    public TestBean1 java1() {
        TestBean1 t1 = new TestBean1();
        return t1;
    }

    @Bean(name = "new") // name : 이름 변경
    public TestBean2 java2() {
        return new TestBean2();
    }
}