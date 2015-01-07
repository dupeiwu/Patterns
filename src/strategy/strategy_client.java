package strategy;

public class strategy_client {

    public static void main(String[] args) {
        try {
            Knowhow.getStrategy(StrategyEnum.scheme_one).operate();;
            Knowhow.getStrategy(StrategyEnum.scheme_two).operate();;
            Knowhow.getStrategy(StrategyEnum.scheme_three).operate();;
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
