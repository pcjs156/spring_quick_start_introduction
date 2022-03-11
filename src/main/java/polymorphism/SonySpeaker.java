package polymorphism;

public class SonySpeaker {
    public SonySpeaker() {
        System.out.println("===> " + getClass() + " 객체 생성");
    }

    public void volumeUp() {
        System.out.println(getClass() + "--- 소리 올린다.");
    }

    public void volumeDown() {
        System.out.println(getClass() + "--- 소리 내린다.");
    }
}
