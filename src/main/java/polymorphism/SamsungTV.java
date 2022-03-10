package polymorphism;

public class SamsungTV implements TV {
    private final String brandName = "SamsungTV";

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
}
