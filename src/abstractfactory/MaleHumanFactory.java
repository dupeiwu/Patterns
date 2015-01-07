package abstractfactory;

public class MaleHumanFactory extends AbstractHumanFactory {

    @Override
    public IHuman createYellowHuman() 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
        return super.createHuman(HumanEnum.yellowMaleHuman);
    }

    @Override
    public IHuman createWhiteHuman() 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        return createHuman(HumanEnum.WhiteMaleHuman);
    }

    @Override
    public IHuman createBlackHuman() 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        return createHuman(HumanEnum.BlackMaleHuman);
    }
}
