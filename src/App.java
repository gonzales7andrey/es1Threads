public class App {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread(550, "*");
        t1.start();

        MyThread t2 = new MyThread(550, "#");
        t2.start();
        //x
    }
}
