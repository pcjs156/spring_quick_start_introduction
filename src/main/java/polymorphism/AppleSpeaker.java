package polymorphism;

public class AppleSpeaker implements Speaker {
    private final String brandName = "AppleSpeaker";

    public AppleSpeaker() {
        System.out.println("===> " + brandName + " 객체 생성");
    }

    public void volumeUp() {
        System.out.println(brandName + "--- 소리 올린다.");
    }

    public void volumeDown() {
        System.out.println(brandName + "--- 소리 내린다.");
    }
}
