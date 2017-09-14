package c346ut;

public class MyLinkedList<T> implements ILinkedList<T>{
    private ILinkedList<T> next;
    private T value;
    private ILinkedList<T> first;
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
           for (int i = 0; i < n; i++) {
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
        next=null;
        return temp;
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
        this.value = value;
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
    public void append(ILinkedList<T> next){
        this.next=next();
    }

   // /**
   //  * Adds the current list as the next of newFirst
   //  * @param newFirst the new head of the list
   //  */
    @Override
    public void insert(ILinkedList<T> newFirst){
        newFirst.setNext(first);
		first = newFirst;
    }
}

