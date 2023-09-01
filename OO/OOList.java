package OO;
public interface OOList {
    int sum();
}
class Nil implements OOList{
    public int sum(){
        return 0;
    }
}

class Cons implements OOList{
    int head;
    OOList tail;
    public int sum(){
        try{
            return head + tail.sum();
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
            return 0;
        }
    }
}