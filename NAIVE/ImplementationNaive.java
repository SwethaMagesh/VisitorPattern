package NAIVE;

public class ImplementationNaive {
    public static void main(int N){
        try{
            NaiveList l = new Cons();
            NaiveList head = l;
            for(int i=1;i<=N;i++){
                ((Cons) l).head = i;
                if(i<N)
                ((Cons) l).tail = new Cons();
                else
                ((Cons) l).tail = new Nil();
                l = ((Cons) l).tail;
            }

            // after init
            // find sum
            double start, stop;

            start = System.nanoTime()/1000.0;
            l = head;
            int sum = 0;
            boolean proceed = true;
            while(proceed){
                if( l instanceof Nil ){
                    proceed = false;
                }
                else{
                    sum = sum + ((Cons) l).head;
                    l = ((Cons) l ).tail;
                }
            }
            
            // System.out.print("NAIVE "+N+ " SUM IS "+sum);

        stop = System.nanoTime()/1000.0;
        System.out.printf(" %12.5f micro sec \t",(stop-start));

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
    }
}