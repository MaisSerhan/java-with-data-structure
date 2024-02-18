

public class LinkedListG <T>{
private NodeG<T> head;
private NodeG<T> tail;
private int size=0;

    public LinkedListG() {
        this.head = null;
        this.tail = null;
    }

    public NodeG getHead() {
        return head;
    }

    public void setHead(NodeG head) {
        this.head = head;
    }

    public NodeG getTail() {
        return tail;
    }

    public void setTail(NodeG tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

  public void addAtFirst(T value){
        NodeG temp=new NodeG(value);
        if(this.head==null)this.head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
}
 public void addAtLast(T value){
        NodeG temp=new NodeG(value);
        if(this.tail==null)this.head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
}
 public T removeAtFirst(){
     T value=head.data;
     head=head.next;size--;
     return value; 
 }
 
 public T removeAtLast(){
     T value=tail.data;
     NodeG c=head;
    /* for(int i=0;i<size-2;i++)
         c=c.next;*/
     while(c.next!=tail)
         c=c.next;
   c.next=null;
     tail=c;
     size--;
     return value;
 }
 

 public T removeByIndex(int index){
     if(index<0||index>size)return null;
     else{T val=null;
         if(index==0)removeAtFirst();
         else if(index==size)removeAtLast();
         else{
             NodeG curr=head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }val=(T) curr.next.data;
             System.out.println("c.d "+curr.data);
             System.out.println("c.d.n.n "+curr.next.next.data);
             //if(curr.next.next!=null)
            curr.next=curr.next.next;
         }size--;
         return val;
     }
 }
         
         
 public NodeG mid(){
     NodeG mid=head,curr=head;
     if(size%2!=0)
     while(mid!=tail){
        curr=curr.next;
        mid=mid.next.next;
     }
     else 
       while(mid.next!=tail){
       curr=curr.next;
        mid=mid.next.next;
     }
     return curr;
 }    
 public NodeG NodeOn(LinkedListG first,LinkedListG second){
     NodeG <T> curr1=first.head,curr2=second.head;
     int size1=first.getSize(),size2=second.getSize();
     int c1=size1-size2,c2=size2-size1;
     if(size1>size2){
         
          while(c1>0){
             curr1=curr1.next; c1--;}
          while(!curr1.equals(first.tail)){
          if(curr1.data==curr2.data){
          return curr1;}
          curr1=curr1.next;
          curr2=curr2.next;
          }
          return null;}
     
     else{
          while(c2>0){
             curr2=curr2.next; c2--;}
          
          while(curr2.data.equals(second.tail.data)){
         if(curr1.data==curr2.data){
             return curr1;
         }
         else{
             curr1=curr1.next;
             curr2=curr2.next;
       }}  
      return null;
 }}
 public void rotation(int r){
     int dif=r%size;
    
     if(dif>0){
         tail.next=head;
     } 
     while(dif>0){
         head=head.next;
         tail=tail.next;
     dif--;
     }
     System.out.println("1 ");
     tail.next=null;
 }
 
 
 
 
 
 public String toString(){
     String s="";
     NodeG curr=head;
     for(int i=0;i<size;i++){
         s+=curr.data+" ";
     curr=curr.next;}
     return s;
 }
 public String toStringStack(){
     String s="[";
     NodeG curr=head;
     for(int i=0;i<size;i++){
         s+=" "+curr.data;
     curr=curr.next;}
     s+="]";
     return s;
 }
  
}
