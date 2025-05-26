/*
Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports
 */
interface Playable{
     void play();
}
class Football implements Playable{
    public void play() {
        System.out.println("He plays football.");
    }
}
class Volleyball implements Playable{
    public void play() {
        System.out.println("He plays volleyball.");
    }
}

class Basketball implements Playable{
    public void play() {
        System.out.println("He plays basketball.");
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        Football fc = new Football();
        Volleyball vb = new Volleyball();
        Basketball bb = new Basketball();
        fc.play();
        vb.play();
        bb.play();
    }
}
