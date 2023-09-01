package VISITOR;

public interface VisitorList {
    void accept(Visitor v);
}

class Nil implements VisitorList{
    public void accept(Visitor v){
        v.visit(this);
    }
}
class Cons implements VisitorList{
    int head;
    VisitorList tail;
    public void accept(Visitor v){
        try{
            v.visit(this);
        }catch(Exception e){
            return;
        }
    }
}
interface Visitor{
    void visit(Nil x);
    void visit(Cons x);
}
class SumVisitor implements Visitor{

    int sum = 0 ;
    public void visit(Nil x){}
    public void visit(Cons x){
        try{
        sum = sum + x.head;
        x.tail.accept(this);
        }
        catch(Exception e){
            System.out.println("EXCEPTION: "+e.getMessage());
            return;
        }
        
    }
}
