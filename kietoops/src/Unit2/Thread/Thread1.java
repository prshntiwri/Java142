package Unit2.Thread;

public class Thread1 extends Thread {
    public void run(){
        for(int i = 0; i < 10; i++){
            try{
                Thread.sleep(10000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Hi I am your thread 1");
        }
    }
}
