package simple_factory;

public class Client {

    public static void main(String[] args)
    {
//        try {
//            //className必须包括包名路径
//            run(AnimalFactory.createAnimal("simple_factory.Dog"));
//            run(AnimalFactory.createAnimal("simple_factory.Fish"));
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
        
        try {
            run(AnimalFactory.getAnimal(Dog.class));
            run(AnimalFactory.getAnimal(Fish.class));
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private static void run(IAnimal animal)
    {
        animal.run();
    }
}
