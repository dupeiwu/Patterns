package singleton.thread;

public class Emperor_Synchronized {

    private static Emperor_Synchronized EMPEROR_SYNCHRONIZED=null;
    private Emperor_Synchronized(){}
    public static Emperor_Synchronized getInstance()
    {
        if(EMPEROR_SYNCHRONIZED==null)
        {
            synchronized (Emperor_Synchronized.class) {
                EMPEROR_SYNCHRONIZED=new Emperor_Synchronized();
            }
        }
        return EMPEROR_SYNCHRONIZED;
    }
}
