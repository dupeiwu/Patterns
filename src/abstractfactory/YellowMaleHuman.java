package abstractfactory;

public class YellowMaleHuman extends AbstractYellowHuman {

    @Override
    public void sex() {
        System.out.println("该黄种人是个男性");
    }

}
