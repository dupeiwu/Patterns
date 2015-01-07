package singleton.thread;

public class Thread_client {

    public static void main(String[] args) {
//        Emperor_Thread e1=Emperor_Thread.getEmperor_Thread();
//        Emperor_Thread e2=Emperor_Thread.getEmperor_Thread();
//        System.out.println(e1==e2);
        
        Emperor_Synchronized e1=Emperor_Synchronized.getInstance();
        Emperor_Synchronized e2=Emperor_Synchronized.getInstance();
        
        System.out.println(e1==e2);
    }

}
