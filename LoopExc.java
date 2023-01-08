package JavaPlacement;

public class LoopExc {
    public static void main(String[] args) {
//        n=4 then 1+2+3+4=10
        int sum = 0;
        for (int i=1;i<=4;i++){
            sum=i+sum;
        }
        System.out.println(sum);
    }
}
