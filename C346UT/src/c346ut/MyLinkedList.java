package c346ut;

public class MyLinkedList<T> implements ILinkedList<T>{
    private ILinkedList<T> next;
    private T value;

    public MyLinkedList(T value){
        this.value = value;
    }
    @Override
    public ILinkedList<T> next(){
        return next;
    }
    @Override
    public ILinkedList<T> last(){
        while(next.next()!=null){
            next=next.next();
        }
        return next;
    }
    
    @Override
    public ILinkedList<T> after(int n){
           for (int i = 0; i < n-1; i++) {
            next=next.next();
        }
           return next;
    }   

   // /**
   //  * Removes the next element (sets null)
   //  * @return the previously next element
   //  */
   @Override
    public ILinkedList<T> detach(){
        ILinkedList temp=next;
        this.next=null;
        return temp;
    }

   @Override
    public T get(){
        return value;
    }

    @Override
    public void set(T value){
        this.value = value;
    }

    @Override
    public void setNext(ILinkedList<T> next){
        this.next=next;
    }

    @Override
    public void append(ILinkedList<T> next){
        this.next=next();
    }

    @Override
    public void insert(ILinkedList<T> newFirst){
        
        newFirst.setNext(this);
	
    }
    
}

