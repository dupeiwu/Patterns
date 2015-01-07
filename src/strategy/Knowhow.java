package strategy;

public class Knowhow {

    static IStrategy getStrategy(StrategyEnum strategyEnum) 
            throws InstantiationException, IllegalAccessException, ClassNotFoundException
    {
            return (IStrategy) Class.forName(strategyEnum.getValue()).newInstance();
    }
}
