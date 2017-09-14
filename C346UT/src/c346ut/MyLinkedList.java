package c346ut;

public class MyLinkedList<T> implements ILinkedList<T>{
    private ILinkedList<T> next;
    private T value;
   // @Override
    //public String toString(){
  //     return 
   // }
    public MyLinkedList(T value){
        this.value = value;
    }
    @Override
    public ILinkedList<T> next(){
        return next;
    }
    @Override
    public ILinkedList<T> last(){
       ILinkedList temp= this.next;
        while(temp!=null){
            temp.next();
        }
        return next;
    }
    
    @Override
    public ILinkedList<T> after(int n){
           return null;
    }
        

   // /**
   //  * Removes the next element (sets null)
   //  * @return the previously next element
   //  */
   @Override
    public ILinkedList<T> detach(){
        return null;
    }

   // /**
   //  * Gets the current value
   //  * @return the current value
   //  */
   @Override
    public T get(){
        return value;
    }

   // /**
   //  * Sets the value of this node
   //  * @param value the new value
   //  */
    @Override
    public void set(T value){
    }

   // /**
   //  * Sets the next element in the list
   //  * @param next the next element
   //  */
    @Override
    public void setNext(ILinkedList<T> next){
        this.next=next;
    }

   // /**
   //  * Sets the next element after this current element
   //  * @param next the next element
   //  */
    @Override
    public void append(ILinkedList<T> next){}

   // /**
   //  * Adds the current list as the next of newFirst
   //  * @param newFirst the new head of the list
   //  */
    @Override
    public void insert(ILinkedList<T> newFirst){}
}

