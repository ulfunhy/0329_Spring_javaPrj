package kr.hs.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        ctx.close();
    }
}