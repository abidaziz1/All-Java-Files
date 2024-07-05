public class ProductLine{
    public static void main(String[] args) {
        Thread stage1 = new Thread(new Stage1(), "Stage 1");
        Thread stage2 = new Thread(new Stage2(stage1), "Stage 2");
        Thread stage3 = new Thread(new Stage3(stage2), "Stage 3");

        stage1.start();
        stage2.start();
        stage3.start();
    }
}
class Stage1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" started");
        for(int i = 0; i<5; i++){
            System.out.println("Stage 1: Processing item "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}

class Stage2 implements Runnable{
    private Thread stage1;
    public Stage2(Thread stage1){
        this.stage1 = stage1;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" waiting for "+stage1);
        try {
            stage1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" started");
        for(int i = 0; i<5; i++){
            System.out.println("Stage 2: Processing item "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Thread.yield();
        }
}
}

class Stage3 implements Runnable{
    private Thread stage2;
    public Stage3(Thread stage2){
        this.stage2 = stage2;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" waiting for "+stage2);
        try {
            stage2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" started");
        for(int i = 0; i<5; i++){
            System.out.println("Stage 3: Processing item "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}