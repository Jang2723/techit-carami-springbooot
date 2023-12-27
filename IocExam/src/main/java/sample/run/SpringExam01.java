package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sample.MyBean;
import sample.config.MyBeanConfig;

public class SpringExam01 {
    public static void main(String[] args) {
        System.out.println("ApplicationContext 생성 전");
        ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);
        System.out.println("ApplicationContext 생성 후");

        //DL
        MyBean bean =(MyBean) context.getBean("bean"); // 형변환(MyBean), 이름으로 조회
        bean.setName("kang");
        System.out.println(bean.getName());


        MyBean bean2 = context.getBean("bean",MyBean.class); // 타입으로 조회(lookup)
        bean2.setName("kim");
        System.out.println(bean2.getName());


        MyBean bean3 = context.getBean("bean", MyBean.class);

        // singleton이기 때문에 객체가 1개만 생성됨
        // bean에서 kang을 만들고 bean2가 id를 bean으로 만들어져 kim을 만들었기 때문에 bean은 kim
        // been3는 name이 bean이기 때문에 kim을 출력x
        System.out.println(bean3.getName());
        System.out.println(bean.getName());

        // 주소 비교
        if (bean == bean2){
            // 위의 bean2에서 name이 'bean'이면 같고 'bean2'면 다르다.
            System.out.println("bean == bean2");
        }
    }
}
