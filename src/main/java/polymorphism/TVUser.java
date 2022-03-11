package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
    public static void main(String[] args) {
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

        System.out.println("getBean test");
        TV tv = (TV) factory.getBean("tv");
        tv.turnOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOff();

        drawLine();
        System.out.println("Singleton bean test:");
        TV singletonTV1 = (TV) factory.getBean("tv");
        TV singletonTV2 = (TV) factory.getBean("tv");
        System.out.println("singletonTV1 " + (singletonTV1 == singletonTV2 ? "==" : "!=") + " singletonTV2");

        // 아래 두 getBean이 호출될 때마다 새 instance가 생성된다.
        System.out.println("\nPrototype bean test:");
        TV prototypeTV1 = (TV) factory.getBean("prototypeTV");
        TV prototypeTV2 = (TV) factory.getBean("prototypeTV");
        System.out.println("prototypeTV1 " + (prototypeTV1 == prototypeTV2 ? "==" : "!=") + " prototypeTV2");

        // 아래 call 이 없는 경우 spring container가 종료되지 정상적으로 종료되지 않기 때문에 destroy-method가 호출되지 않음
        factory.close();
    }

    private static void drawLine() {
        drawLine(50);
    }

    private static void drawLine(int length) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++)
            buffer.append('=');
        System.out.println(buffer.toString());
    }
}
