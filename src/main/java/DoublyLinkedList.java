
class DoublyLinkedList {
NodeDouble head;
NodeDouble tail;
int size;
    public DoublyLinkedList() {
    }
    public void add(int value){
    NodeDouble tem =new NodeDouble(value);
    if(size==0)head=tail=tem;
    else{
    NodeDouble curr=head;
    while(curr.next!=null)
    curr=curr.next;
    curr.next=tem;tail=tem;
    tem.prev=curr;
    }
    size++;
    }
    
    public boolean remove(int value){
        //not have node
        if(size==0)return false;
        //have one node
        else if(size==1){
            if(head.data==value){
                head=tail=null;
                size--;
                return true;
            }
            else return false;
        }
        // have more 1 node
        else{
        NodeDouble curr=head;
        if(curr.data==value){
            head=head.next;
            head.prev=null;
            size--;
            return true;
        }
        else if(tail.data==value){
        tail=tail.prev;
        tail.next=null;
        size--;
        return true;
        }
        while(curr!=null&&curr.next!=null){
        if(curr.next.data==value){
            if(curr.next==tail) tail=curr;
            curr.next=curr.next.next;
            (curr.next).prev=curr;
            size--;
            return true;
        }
        curr=curr.next;
        }
        return false;
      
    }
}

    public boolean search(int value){
        NodeDouble curr=head;
        while(curr!=null){
            if(curr.data==value)return true;
            curr=curr.next;
        }
    return false;
    }
    
    public void updet(int valuePef,int valueNew){
        NodeDouble curr=head;
        while(curr!=null){
        if(curr.data==valuePef){
        curr.data=valueNew;
        return;
        }
        curr=curr.next;
    }
    }
    public void print (){
    NodeDouble curr=head;
    while(curr!=null){
        System.out.print(curr.data+"\t");
        curr=curr.next;
    }
        System.out.println("");
    }




}
