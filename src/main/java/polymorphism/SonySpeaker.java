package polymorphism;


public class SonySpeaker implements Speaker {
    private final String brandName = "SonySpeaker";

    public SonySpeaker() {
        System.out.println("===> " + brandName + " 객체 생성");
    }

    public void volumeUp() {
        System.out.println(brandName + "--- 소리 올린다.");
    }

    public void volumeDown() {
        System.out.println(brandName + "--- 소리 내린다.");
    }
}
