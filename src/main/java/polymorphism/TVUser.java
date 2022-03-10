package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
    public static void main(String[] args) {
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
        TV tv = (TV) factory.getBean("tv");
        tv.turnOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOff();

        // 아래 call 이 없는 경우 spring container가 종료되지 정상적으로 종료되지 않기 때문에 destroy-method가 호출되지 않음
        factory.close();
    }
}
