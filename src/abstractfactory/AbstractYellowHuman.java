package abstractfactory;

public abstract class AbstractYellowHuman implements IHuman
{
    //大笑
    public void laugh(){System.out.println("黄种人大笑");};
    //哭泣，呼喊
    public void cry(){System.out.println("黄种人哭泣");};
    //说话，讨论
    public void talk(){System.out.println("黄种人讨论");};
}
