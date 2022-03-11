package polymorphism;

public class SamsungTV implements TV {
    private final String brandName = "SamsungTV";
    private SonySpeaker speaker;

    public SamsungTV(SonySpeaker speaker) {
        System.out.println("==> " + brandName + " 객체 생성");
        this.speaker = speaker;
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

    public void initMethod() {
        System.out.println(brandName + ": 객체 초기화 작업 처리...");
    }

    public void destroyMethod() {
        System.out.println(brandName + ": 객체 삭제 전에 처리할 로직 처리...");
    }
}
