package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("tv")
public class LGTV implements TV {
    protected final String brandName = "LGTV";

    public LGTV() {
        System.out.println("===> " + brandName + " 객체 생성");
    }

    public void turnOn() {
        System.out.println(brandName + "---" + "전원 켠다.");
    }

    public void turnOff() {
        System.out.println(brandName + "---" + "전원 끈다.");
    }

    public void volumeUp() {
        System.out.println(brandName + "---" + "소리 올린다.");
    }

    public void volumeDown() {
        System.out.println(brandName + "---" + "소리 내린다.");
    }

    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
        TV tv = (LGTV) ctx.getBean("tv");
    }
}
