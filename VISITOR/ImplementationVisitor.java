package VISITOR;



public class ImplementationVisitor {
    public static void main(int N){
        try {
            VisitorList l = new Cons();
            VisitorList head = l;
            for(int i=1;i<=N;i++){
                ((Cons) l).head = i;
                if(i<N)
                ((Cons) l).tail = new Cons();
                else
                ((Cons) l).tail = new Nil();
                l = ((Cons) l).tail;
            }

            SumVisitor sv = new SumVisitor();
            double start, stop;

            start = System.nanoTime()/1000.0;
            head.accept(sv);
            stop = System.nanoTime()/1000.0;
            System.out.printf(" %12.5f micro sec \t",(stop-start));
            // System.out.print("Visitor "+N+ " SUM IS "+sv.sum);
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
         
    }
}
