package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import sample.MyBean;

public class MyBeanConfig {
    // singleton pattern - 객체가 1개만 생성됨
    @Bean
//    @Scope("prototype") // 요청할 때마다, 빈을 받아올떄마다 인스턴스를 새로 생성
    public MyBean bean() {
        return new MyBean();
    }

    // Bean 여러개 등록 가능
//    @Bean
//    public MyBean bean2() {
//        return new MyBean();
//    }
    // <bean id="bean" class='sample.MyBean"> -> xml
}
