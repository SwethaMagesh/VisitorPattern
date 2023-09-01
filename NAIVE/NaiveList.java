package NAIVE;
public interface NaiveList {
    
}
class Nil implements NaiveList{}

class Cons implements NaiveList{
    int head;
    NaiveList tail;
}