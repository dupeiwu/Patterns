package abstractfactory;

public abstract class AbstractYellowHuman implements IHuman
{
    //��Ц
    public void laugh(){System.out.println("�����˴�Ц");};
    //����������
    public void cry(){System.out.println("�����˿���");};
    //˵��������
    public void talk(){System.out.println("����������");};
}
