
public class MyLinkedList {
private Node head=null;
private Node tail=null;
private int size=0;

    public MyLinkedList() {
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public Integer getLast(){
        return tail.data;
    }
    public Integer getFirst(){
        return head.data;
    }
  public void addAtFirst(Integer value){
        Node temp=new Node(value);
        if(this.head==null)this.head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
}
 public void addAtLast(Integer value){
        Node temp=new Node(value);
        if(this.tail==null)this.head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
}
 public Integer removeAtFirst(){
     Integer value=head.data;
     head=head.next;size--;
     return value; 
 }
 
 public Integer removeAtLast(){
     Integer value=tail.data;
     Node c=head;
    /* for(int i=0;i<size-2;i++)
         c=c.next;*/
     while(c.next!=tail)
         c=c.next;
   c.next=null;
     tail=c;
     size--;
     return value;
 }
 

 public Integer removeByIndex(int index){
     if(index<0||index>size)return-1;
     else{Integer val=0;
         if(index==0)removeAtFirst();
         else if(index==size)removeAtLast();
         else{
             Node curr=head;
            for(int i=0;i<index-1;i++){
                curr=curr.next;
            }val=curr.next.data;
             System.out.println("c.d "+curr.data);
             System.out.println("c.d.n.n "+curr.next.next.data);
             //if(curr.next.next!=null)
            curr.next=curr.next.next;
         }size--;
         return val;
     }
 }
 public void copy(MyLinkedList list){
     Node curr=list.head;
     while(curr!=null){
        this.addAtLast(curr.data);
        curr=curr.next;
     }
 }
         
 public Node mid(){
     Node mid=head,curr=head;
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
 public Node NodeOn(MyLinkedList first,MyLinkedList second){
     Node curr1=first.head,curr2=second.head;
     int size1=first.size,size2=second.size;
     int c1=size1-size2,c2=size2-size1;
     if(size1>size2){
         
          while(c1>0){
             curr1=curr1.next; c1--;}
          while(curr1!=first.tail){
          if(curr1.data==curr2.data){
          return curr1;}
          curr1=curr1.next;
          curr2=curr2.next;
          }
          return null;}
     
     else{
          while(c2>0){
             curr2=curr2.next; c2--;}
          
          while(curr2.data!=second.tail.data){
         if(curr1.data==curr2.data){
             return curr1;
         }
         else{
             curr1=curr1.next;
             curr2=curr2.next;
       }}  
      return null;
 }}
 public void reverse (){
     Node prev=head,curr=head.next;
     while(curr!=null){
         prev.next=curr.next;
         curr.next=head;
         head=curr;
         curr=prev.next;
     }
 }
 public void swap(int n1,int n2){
     Node prev1=null,curr1=head,prev2=null,curr2=head;
     
     while(curr1.data!=n1){
         prev1=curr1;
         curr1=curr1.next;
     }
     while(curr2.data!=n2){
         prev2=curr2;
         curr2=curr2.next;
     }
     System.out.println(curr1.data+"  "+curr2.data+"   "+curr1.next.data+"   "+curr2.next.data);
     if(curr1==head){
         Node c=curr1;
         
         prev2.next=curr1;
        curr1.next=curr2.next;
        curr2.next=c;
        head=curr2;
     }
     else{ Node tem=prev1.next,temp=curr1.next;
     prev1.next=prev2.next;
     curr1.next=curr2.next;
     prev2.next=tem;
     curr2.next=temp;
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
     Node curr=head;
     for(int i=0;i<size;i++){
         s+=curr.data+" ";
     curr=curr.next;}
     return s;
 }
 
 public MyLinkedList sumTowNum(MyLinkedList l1,MyLinkedList l2){
     MyLinkedList list=new MyLinkedList();
     Node cur1=l1.head;
     Node cur2=l2.head;
     while(cur1!=null&&cur2!=null){
     list.addAtLast(cur1.data+cur2.data);
     cur1=cur1.next;cur2=cur2.next;}
     while(cur1!=null){
     list.addAtLast(cur1.data);
     cur1=cur1.next;}
     while(cur2!=null){
     list.addAtLast(cur2.data);
     cur2=cur2.next;}
     return list;
 }
 public MyLinkedList[] SpiralMatrix(MyLinkedList list,int m,int n){
     MyLinkedList[] l=new MyLinkedList[m];
     int j=0,k=0;
     System.out.println("l "+list.size);
     Node curr=list.head;
     for(int i=0;i<list.size;i++){
         System.out.println("l");

         //if(k>=n){j++;k=0;}
         k++;
     
      l[j].addAtLast(curr.data);
     curr=curr.next;
 }return l;
 }
 
 public String toStringStack(){
     String s="[";
     Node curr=head;
     for(int i=0;i<size;i++){
         s+=" "+curr.data;
     curr=curr.next;}
     s+="]";
     return s;
 }
 public MyLinkedList caluclater(MyLinkedList list1,MyLinkedList list2){
  MyLinkedList l1=new MyLinkedList(),l2=new MyLinkedList(),s=new MyLinkedList();   
  
  l1.copy(list1);l2.copy(list2);
  l1.reverse();l2.reverse();
  Node curr1=l1.head,curr2=l2.head;
   
   while(curr1!=null&&curr2!=null){
      Integer sum=curr1.data+curr2.data;
  
    if(sum<10)s.addAtFirst(sum);
      else{
          s.addAtFirst(sum%10); 
          if(curr1.next!=null){
          curr1.next.data+=sum/10;}
          else {
              s.addAtFirst(sum/10);
                  
              }}
      curr1=curr1.next;
      curr2=curr2.next;
   }   
          
          
          
          
          
            while(curr1!=null){
              s.addAtFirst(curr1.data);
              curr1=curr1.next;
          }
            while(curr2!=null){
              s.addAtFirst(curr2.data);
              curr2=curr2.next;
          }
    
  
 return s; 
  
 }
 
 
 public void reverseByRang(Integer n1,Integer n2,Node list){
     Node curr1=list,prev=list,curr2=head;
     for(int i=0;i<n1-1;i++){
         prev=prev.next;
         curr1=curr1.next;
     }
     curr1=curr1.next;
     for(int i=0;i<n2;i++){
         curr2=curr2.next;
     }
     while(curr1!=curr2){
         prev.next=curr1.next;
         curr1.next=curr2.next;
         curr2.next=curr1;
         curr1=prev.next;
     }

 }                            //n=2      m=4
 public void addRemove(Integer n,Integer m,Node lhead){
 Node curr1=null,curr2=lhead;
 int i=1,c=1,size=1;
 if(n>0)curr1=lhead;
 while(curr2.next!=null){ System.out.print(" "+curr1.data+"   ");
   curr2=curr2.next;
   if(i<n){curr1=curr2;size++;}i++;
   
   if(i==m+n){i=0;curr1.next=curr2;}}
 
 curr2=lhead;
 while(curr2!=null){
     System.out.print(curr1.data+" ");
     curr2=curr2.next;
  /* else {if(i==m+n){i=0;
       
       
   
  size=n;
   
      System.out.println(curr1.data);}
     
  
 }//size-=(c*n);
 System.out.println(m+n+" "+size);*/
 }}
 public void minMaxNumber(Node head,int x){
     Node curr=head,prv=null,c1=null,c2=head;int i=0;
    if(c2.data<x){
        c1=c2;
        c2=c2.next;
    }
    
     while(curr.next!=null){
        // 
     // System.out.println(c1.data+" +"+c2.data);
       if(curr.data<x&&curr!=head){
            prv.next=curr.next; 
            c1.next=curr;
            curr.next=c2;System.out.println(toString());
         c1=c1.next;
         c2=c2.next;            System.out.println(prv.data+" "+curr.data+" "+c1.data+" "+c2.data);

         }
        
         prv=curr;
         curr=curr.next;
        
     }System.out.println(toString());
     System.out.println(c1.data+ " "+c2.data);
     if(curr.data<x){
           c1.next=curr;
           curr.next=c2;
           c1=c1.next;
           c2=c2.next;}}
 
 
}
