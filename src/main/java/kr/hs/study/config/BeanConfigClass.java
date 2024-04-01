package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import org.springframework.context.annotation.*;

// 스프링에게 명령을 내리는 설정파일
@Configuration
public class BeanConfigClass {
    @Bean
    @Lazy
    @Scope("prototype")
    public TestBean1 java1() {
        TestBean1 t1 = new TestBean1();
        return t1;
    }

    @Bean(name = "new") // name : 이름 변경
    @Lazy
    @Scope("prototype")
    public TestBean2 java2() {
        return new TestBean2();
    }

    @Bean(name = "a3")
    @Lazy
    @Scope("prototype")
    public TestBean3 java3() {
        return new TestBean3();
    }

    @Bean
    @Lazy
    @Primary
    public TestBean4 java4_1() {
        return new TestBean4();
    }

    @Bean
    @Lazy
    public TestBean4 java4_2() {
        return new TestBean4();
    }
}