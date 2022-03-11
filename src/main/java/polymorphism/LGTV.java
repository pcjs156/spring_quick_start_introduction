package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("tv")
public class LGTV implements TV {
    protected final String brandName = "LGTV";

    // Constructor, setter 위에 붙여도 상관 없음
    @Autowired
    private Speaker speaker;

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
        speaker.volumeUp();
    }

    public void volumeDown() {
        speaker.volumeDown();
    }

    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
        TV tv = (LGTV) ctx.getBean("tv");
    }
}
