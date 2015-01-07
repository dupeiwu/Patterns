package abstractfactory;

public class Client {

    public static void main(String[] args) {
        MaleHumanFactory maleHumanFactory=new MaleHumanFactory();
        FemaleHumanFactory femaleHumanFactory=new FemaleHumanFactory();
        IHuman human=null;
        try {
            human=maleHumanFactory.createBlackHuman();
            human.cry();
            human.laugh();
            human.talk();
            human.sex();
            System.out.println("----------------------------------------------------");
            human=maleHumanFactory.createWhiteHuman();
            human.cry();
            human.laugh();
            human.talk();
            human.sex();
            System.out.println("----------------------------------------------------");
            human=maleHumanFactory.createYellowHuman();
            human.cry();
            human.laugh();
            human.talk();
            human.sex();
            System.out.println("=================================================================");
            human=femaleHumanFactory.createBlackHuman();
            human.cry();
            human.laugh();
            human.talk();
            human.sex();
            System.out.println("----------------------------------------------------");
            human=femaleHumanFactory.createWhiteHuman();
            human.cry();
            human.laugh();
            human.talk();
            human.sex();
            System.out.println("----------------------------------------------------");
            human=femaleHumanFactory.createYellowHuman();
            human.cry();
            human.laugh();
            human.talk();
            human.sex();
            System.out.println("=================================================================");
            human=maleHumanFactory.createHuman(HumanEnum.BlackFeMaleHuman);
            human.cry();
            human.laugh();
            human.talk();
            human.sex();
            System.out.println("----------------------------------------------------");
            human=maleHumanFactory.createHuman(HumanEnum.BlackMaleHuman);
            human.cry();
            human.laugh();
            human.talk();
            human.sex();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
