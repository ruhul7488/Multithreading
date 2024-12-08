class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i=6;i<=10;i++){
            System.out.println(i);
        }
    }
}
class Thread3 extends Thread{
    public void run(){
        for(int i=11;i<=15;i++){
            System.out.println(i);
        }
    }
}


public class TestTH {
    public static void main(String[]a){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t3.start();


    }
}
