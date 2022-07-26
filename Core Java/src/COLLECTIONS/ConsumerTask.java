package COLLECTIONS;
public class ConsumerTask implements Runnable{
    private BUFFER buffer;
    public ConsumerTask(BUFFER buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        try {
            // delay to make sure producer starts first
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        buffer.get();
    }    
}