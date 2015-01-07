package singleton.simple;

public class singleton_simple_client {

    public static void main(String[] args)
    {
        Emperor e1=Emperor.getEmperor();
        Emperor e2=Emperor.getEmperor();
        System.out.println(e1==e2);
    }
}
