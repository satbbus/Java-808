public class RobotApp {
}

interface Speakable{
    public void speak(String s);
}

abstract  class Robot implements Speakable{
   abstract public void process();
}

abstract class C{
    abstract public void process();
    public void manilY(){}
}