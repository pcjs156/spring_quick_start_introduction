package polymorphism;

public class TVUser {
    public static void main(String[] args) {
        BeanFactory factory = new BeanFactory();

        // 원래는 (TV) factory.getBean(args[0]); 인데, 그냥 삼성으로 고정함
        // 클라이언트 소스를 따로 수정하지 않고 문자열(beanName param)만 바꿀 수 있다는 점이 중요
        TV tv = (TV) factory.getBean("samsung");
        tv.turnOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOff();
    }
}
