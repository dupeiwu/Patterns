package simple_factory;

public class AnimalFactory {

    public static IAnimal createAnimal(String className) 
            throws ClassNotFoundException,InstantiationException,IllegalAccessException
    {
            //className必须包括包名路径
            
            return (IAnimal) Class.forName(className).newInstance();
    }
    
    public static IAnimal getAnimal(Class<? extends IAnimal> clazz)
            throws InstantiationException,IllegalAccessException
    {
            return clazz.newInstance();
    }
    
}
