package polymorphism;

public class SamsungTV implements TV {
    private final String brandName = "SamsungTV";

    public SamsungTV() {
        System.out.println("==> " + brandName + " 객체 생성");
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

    public void initMethod() {
        System.out.println(brandName + ": 객체 초기화 작업 처리...");
    }

    public void destroyMethod() {
        System.out.println(brandName + ": 객체 삭제 전에 처리할 로직 처리...");
    }
}
