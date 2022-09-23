package JMM.avo;

public class Synchronized {
    static int i=0;
    static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
           for(int j=0;j<50000;j++){
               synchronized (obj){
                   i++;
               }
           }
        });
        Thread t2=new Thread(()->{
           for(int j=0;j<50000;j++){
               synchronized (obj){
                   i--;
               }
           }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.print(i);


    }
}
