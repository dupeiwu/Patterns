package abstractfactory;

public class YellowFemaleHuman extends AbstractYellowHuman {

    @Override
    public void sex() {
        System.out.println("该黄种人是个女性");
    }

}
