
import java.util.Arrays;
import java.util.Objects;


public class Hashing1 {
 
private NodeG []arr; 
private LinkedListG list;

    public Hashing1() {
        arr=new NodeG[5];
    }

    public Hashing1(NodeG[] arr, LinkedListG list) {
        this.arr = arr;
        this.list = list;
    }

    public NodeG[] getArr() {
        return arr;
    }

    public void setArr(NodeG[] arr) {
        this.arr = arr;
    }

    public LinkedListG getList() {
        return list;
    }

    public void setList(LinkedListG list) {
        this.list = list;
    }
    public void add(NodeG node){
     int index=(Integer)node.data%5;
        System.out.println(index);
         if(arr[index]==null)
            arr[index]=node;
        else{ NodeG curr= arr[index];
        while(curr.next!=null){curr=curr.next;
             }
        curr.next=node;
        }

     
    }
    public String toString(){
        String s="";
        for(int i=0;i<arr.length;i++){
            NodeG curr=arr[i];
            while(curr!=null){
                s+=curr.data+" ";
                curr=curr.next;
            }
            s+="\n";
        }
        return s;
    }

}
