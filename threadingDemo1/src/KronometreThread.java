public class KronometreThread implements Runnable{

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println(threadName + "olusturuluyor..");
    }
    @Override
    public void run() {
        System.out.println("Calistiriliyor.." + threadName);

        try {
            for (int i = 0;i<=10;i++){
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Kesildi :" + threadName);
        }
        System.out.println("Thread bitti" + threadName);
    }

    public void start(){
        System.out.println("Thread nesnesi olusuyor");
        if (thread==null){
            thread = new Thread(this,threadName);
            thread.start();

        }
    }
}
