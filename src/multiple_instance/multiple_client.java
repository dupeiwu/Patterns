package multiple_instance;

public class multiple_client {

    public static void main(String[] args)
    {
        EmperorFactory.getEmperor(EmperorFactory.ROBBY).printInfo();
        EmperorFactory.getEmperor(EmperorFactory.TONY).printInfo();
    }
}
