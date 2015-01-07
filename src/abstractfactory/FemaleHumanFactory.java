package abstractfactory;

public class FemaleHumanFactory extends AbstractHumanFactory {

    @Override
    public IHuman createYellowHuman() throws ClassNotFoundException,
            InstantiationException, IllegalAccessException

    {
        return createHuman(HumanEnum.yellowFeMaleHuman);
    }

    @Override
    public IHuman createWhiteHuman() throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        return createHuman(HumanEnum.WhiteFeMaleHuman);
    }

    @Override
    public IHuman createBlackHuman() throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        return createHuman(HumanEnum.BlackFeMaleHuman);
    }

}
