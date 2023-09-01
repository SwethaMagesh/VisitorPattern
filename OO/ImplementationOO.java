package OO;

public class ImplementationOO {
    public static void main(int N){
        try {
            OOList head = new Cons();
            OOList l = head;
            for(int i=1;i<=N;i++){
                ((Cons) l).head = i;
                if(i<N)
                ((Cons) l).tail = new Cons();
                else
                ((Cons) l).tail = new Nil();
                l = ((Cons) l).tail;
            }
            // find sum
            double start, stop;

            start = System.nanoTime()/1000.0;
            int sum = head.sum();
            stop = System.nanoTime()/1000.0;
            System.out.printf(" %12.5f micro sec \t",(stop-start));


                
        } catch (Exception e) {
           System.out.println(e.getMessage());
           
        }
        

    }
}
