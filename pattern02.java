package JavaPlacement;

public class pattern02 {
    public static void main(String[] args) {
      for (int i=1;i<=5;i++){
          for (int j=1;j<=5;j++){
              if (j==1){
                  System.out.print("a");
              }
              if (j==2){
                  System.out.print("e");
              }
              if (j==3){
                  System.out.print("i");
              }
              if (j==4){
                  System.out.print("o");
              }
              if (j==5){
                  System.out.print("u");
              }
          }
          System.out.println();
      }
    }
}
