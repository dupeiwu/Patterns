package abstractfactory;

public abstract class AbstractHumanFactory implements IHumanFactory {

  protected IHuman createHuman(HumanEnum humanEnum)
          throws ClassNotFoundException,InstantiationException,IllegalAccessException
  {
        return (IHuman) Class.forName(humanEnum.getValue()).newInstance();
  }

  public IHuman getHuman(HumanEnum humanEnum) 
          throws ClassNotFoundException, InstantiationException, IllegalAccessException
  {
      return createHuman(humanEnum);
  }
}
