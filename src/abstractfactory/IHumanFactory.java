package abstractfactory;

public interface IHumanFactory {

    IHuman createYellowHuman() throws ClassNotFoundException, InstantiationException, IllegalAccessException;
    IHuman createWhiteHuman() throws ClassNotFoundException, InstantiationException, IllegalAccessException;
    IHuman createBlackHuman() throws ClassNotFoundException, InstantiationException, IllegalAccessException;
    IHuman getHuman(HumanEnum humanEnum) throws ClassNotFoundException, InstantiationException, IllegalAccessException;
}
