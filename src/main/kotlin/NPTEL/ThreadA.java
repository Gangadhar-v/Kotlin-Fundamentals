package NPTEL;

public class ThreadA extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i =1;i<5;i++){
            System.out.println(i++ + "a");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new ThreadA();
        t1.start();
        int num =5;
        int inc = num++;
        System.out.println(inc);
    }
}
