package singleton.thread;

public class Emperor_Thread {

    private final static Emperor_Thread EMPEROR_THREAD=new Emperor_Thread();
    
    private Emperor_Thread(){}
    
    public static Emperor_Thread getEmperor_Thread()
    {
        return EMPEROR_THREAD;
    }
}
