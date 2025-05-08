public class MyThread extends Thread{
    private int nStampe;
    private String simbolo;

    public MyThread(int nStampe, String simbolo){
        this.nStampe = nStampe;
        this.simbolo = simbolo;
    }

    @Override
    public void run(){
        for(int i = 1; i <= nStampe; i++){
            if(i%50 == 0)
                System.out.println("\n");
            else System.out.print(simbolo);
        }
    }
    
}
