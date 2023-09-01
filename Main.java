import NAIVE.ImplementationNaive;
import OO.ImplementationOO;
import VISITOR.ImplementationVisitor;

class Main{
    public static void main(String args[]){
        System.out.println("\n\n\t\t\t NAIVE \t\t\t OO \t\t\t VISITOR");
        for(int n=1;n<=5000;n+=200){
            System.out.printf("\n%10d",n);
            
            ImplementationNaive.main(n);
            
            if(n<4000){
                ImplementationOO.main(n);
                ImplementationVisitor.main(n);
            }
            else{
                System.out.printf("%12.5f Can't compute\t",0.0);
                System.out.printf("%12.5f Can't compute\t",0.0);
            }
            if(n<10){
                n--;
            }
            
            
        
        }   
    }
}