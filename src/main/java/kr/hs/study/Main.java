package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // BeanConfigClass.java파일을 읽어서 객체만들고 IoC(스프링) Container에 보관한다.
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        // 부모의 참조변수로 자식객체를 생성한다.
//        ApplicationContext c = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        // java1 : 메소드 이름
        TestBean1 t1 = ctx.getBean("java1", TestBean1.class);
        System.out.println(t1);

        TestBean2 t2 = ctx.getBean("new", TestBean2.class);
        System.out.println(t2);

        TestBean3 t3 = ctx.getBean("a3", TestBean3.class);
        System.out.println(t3);

        TestBean4 t4 = ctx.getBean(TestBean4.class);
        System.out.println(t4);

        ctx.close();
    }
}