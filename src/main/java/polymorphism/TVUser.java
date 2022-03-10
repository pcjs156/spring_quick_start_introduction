package polymorphism;

public class TVUser {
    public static void main(String[] args) {
        TV tv = new LGTV();
        tv.turnOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOff();
    }
}
