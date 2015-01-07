package abstractfactory;

public enum HumanEnum {

    yellowMaleHuman("AbstractFactory.YellowMaleHuman"), yellowFeMaleHuman(
            "AbstractFactory.YellowFemaleHuman"), WhiteMaleHuman(
            "AbstractFactory.WhiteMaleHuman"), WhiteFeMaleHuman(
            "AbstractFactory.WhiteFemaleHuman"), BlackMaleHuman(
            "AbstractFactory.BlackMaleHuman"), BlackFeMaleHuman(
            "AbstractFactory.BlackFemaleHuman");

    private String value;

    public String getValue() {
        return this.value;
    }

    private HumanEnum(String value) {
        this.value = value;
    }
}
