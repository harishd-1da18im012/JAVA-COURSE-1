package COLLECTIONS;
public class ProducerTask implements Runnable{
    private BUFFER buffer;
    public ProducerTask(BUFFER buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        // putting just three elements
        for(int i = 0; i < 3; i++){
            buffer.put(i);
        }
    }
}
