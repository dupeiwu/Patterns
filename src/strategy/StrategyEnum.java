package strategy;

public enum StrategyEnum {

    scheme_one("strategy.scheme_one"),
    scheme_two("strategy.scheme_two"),
    scheme_three("strategy.scheme_three");
    
    private String value;
    private StrategyEnum(String value)
    {
        this.value=value;
    }
    public String getValue()
    {
        return this.value;
    }
}
