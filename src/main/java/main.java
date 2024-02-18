
import java.util.*;

public class main {
   private static Stack<Character> stack=new Stack<>();
    
  /*  
    public static ArrayList<ArrayList> tree(int n){
    ArrayList <ArrayList> arr=new ArrayList<>();
     for(int i=0;i<n;i++){
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
         for(int j=1;j<i;j++){
          
             int k=(Integer)arr.get(i-1).get(j);
             int k2=(Integer)arr.get(i-1).get(j-1);
             arr1.add(k+k2);
             
         }
         if(i>0)
     arr1.add(1);
     arr.add(arr1);}
        

     return arr;
    }
    
    public static void rev(Node n,LinkedList l){
     int c=0;
        if(l.size()%2==1){
     n=n.next;c++;
     }
      while(n!=null){
      l.addFirst(n.next);
      n=n.next;
      c++;
      }
      while(c>0){
          c--;
          l.removeLast();
      }
    
    }
    public static Node mid(LinkedList <Integer> l){
    Node c1=l.head,c2=l.head; 
    while(c2!=null&&c2.next!=null){
     c1=c1.next;
     c2=c2.next.next;
    }
    return c1;
    }
    public static boolean isPal(LinkedList <Integer> l){
    rev(mid(l),l);
    Node mid=mid(l);
    Node c1=head,c2=mid;
    
    while(c1!=mid&&c2!=null){
        if(c1.data!=c2.data)
            return false;
        c1=c1.next;
        c2=c2.next;
    }
    return true;
    }
    
    public static void fun(char c,int op){
        //System.out.println("1");
        if(stack.empty())
        stack.push(c);
        else if(op==3){
        stack.push(c);
        }
        else if(op==1){
            while(!stack.empty()){
               // System.out.print(stack.peek());
                if(stack.peek()=='{'||stack.peek()=='('||stack.peek()==']'){
                stack.push(c);break;}
                else System.out.print(stack.pop());}
            if(stack.empty())stack.push(c);
        }
          else if(op==2){
            while(!stack.empty()){
                if(stack.peek()=='{'||stack.peek()=='('||stack.peek()==']'||stack.peek()=='+'||stack.peek()=='-'){
                stack.push(c);break;}
                else System.out.print(stack.pop());}
            if(stack.empty())stack.push(c);
        }
          else if(op==4){
              while(!stack.empty()){
                  if(c=='}'&&stack.peek()=='{'){
                     stack.pop();  break;}
                  else if(c==']'&&stack.peek()=='[')break;
                  else if(c==')'&&stack.peek()=='(')break;
                  
                  System.out.print(stack.pop());
          }}
        
        
    }*/
    public static void main(String []args){
     Scanner in=new Scanner(System.in);
     main m=new main();
     Hashing1 hash=new Hashing1();
     BinarySearchTree tree=new BinarySearchTree();
     tree.insert(2);
     tree.insert(5);
     tree.insert(8);
     tree.insert(10);}}
    // tree.print();
   /*  NodeG<Integer> node1=new <Integer>NodeG(5);
     hash.add( node1);hash.add( new <Integer>NodeG(1));hash.add(new <Integer>NodeG(8));hash.add( new <Integer>NodeG(0));
     hash.add( new <Integer>NodeG(8));hash.add( new <Integer>NodeG(2));hash.add( new <Integer>NodeG(8));hash.add( new <Integer>NodeG(7));
     hash.add( new <Integer>NodeG(4));hash.add( new <Integer>NodeG(7));hash.add(new <Integer>NodeG(41) );hash.add( new <Integer>NodeG(6));
     hash.add( new <Integer>NodeG(15));hash.add( new <Integer>NodeG(7)); hash.add( new <Integer>NodeG(14)); hash.add( new <Integer>NodeG(5)); hash.add(new <Integer>NodeG(3));
        System.out.println(hash.toString());
  //   ArrayList <Integer> arr=new ArrayList(Arrays.asList(2,5,1,3,4,7));
       // System.out.println(arr); 
       // System.out.println( tree(5));
      //  System.out.println(arr);
    /* String s=in.next();
     for(int i=0;i<s.length();i++){
         switch(s.charAt(i)){
             case '+':
             case '-':fun(s.charAt(i),1);break;
             case '*':
             case '/':
             case '%':fun(s.charAt(i),2);break;
             case '{':
             case '(':
             case '[':fun(s.charAt(i),3);break;
             case '}':
             case ')':
             case ']':fun(s.charAt(i),4);break;
             default:System.out.print(s.charAt(i));
         }}
         while(!stack.empty())
             if(stack.peek()=='{'||stack.peek()=='['||stack.peek()=='(')
                 stack.pop();
            else System.out.print(stack.pop());
     */
     
     
     
     
     
     
     
     
     
     
     
       // System.out.println(l.);       
        
      /*  MyLinkedList list=new MyLinkedList();
        list.addAtFirst(9);
        list.addAtFirst(1);
        list.addAtFirst(2);
        list.addAtFirst(4);
        list.addAtFirst(8);
        list.addAtFirst(2);
        list.addAtFirst(5);
        list.addAtFirst(2);
        list.addAtFirst(3);
        list.addAtFirst(4);
        list.addAtFirst(1);
        MyLinkedList list2=new MyLinkedList();
        list2.addAtLast(2);
        list2.addAtLast(3);
        list2.addAtLast(5);
        list2.addAtLast(4);
        list2.addAtLast(1);
        System.out.println(list.toString());
        //list.reverseByRang(2,4,list.getHead());
        list.minMaxNumber(list.getHead(), 3);
        System.out.println(list.toString());
       // System.out.println(list.toString());
      //  list.reverse();
      //  System.out.println(list2.toString());
      // list.swap(8, 1);
      //  System.out.println(list.caluclater(list, list2).toString());
    //    System.out.println(list.toString());
     //   System.out.println(list2.toString());
      //  System.out.println(list.sumTowNum(list, list2).toString());
       // MyLinkedList [] l=list.SpiralMatrix(list, 2, 5);
     /*   for(int j=0;j<l.length;j++){
            System.out.println(l[j].toString());
        }
        
        
        
        
        
        /**  
        
       
        System.out.println("list  "+list.toString());
        list.rotation(8);
        System.out.println("list  "+list.toString());
        list.removeByIndex(0);
        list.removeByIndex(3);
        
        System.out.println("list2  "+list2.toString());
        System.out.println("list  "+list.toString());
        if(list2.NodeOn(list2, list)==null)
        System.out.println();
        else System.out.println(list2.NodeOn(list2, list).data);*/
     /*   MyStack s = new MyStack();


        MyStack s3;

s.push(3);
s.push(2);
s.push(6);
s.push(10);
s.push(7);
s.push(4);
//s.pop(); 
System.out.println("s "+s.toString());    
//System.out.println("s "+s.sort().toString());

        System.out.println("max "+s.max());
System.out.println("s "+s.toString()); 
;

/*s2.push(3);
s2.push(2);
s2.push(6);
s2.push(10);
s2.push(7);
s2.push(4);
s2.pop(); 
System.out.println("s "+s2.toString());*/

//    System.out.println("stack "+s.toString());
//  list.removeAtFirst();
       // list.removeAtLast();
       
      //  System.out.println("mid "+list.mid().data);
    /*    System.out.println(main.isBalance(n));
//       int l=n;
//        for (int i = 0; i < n; i++) {
//           o.push(in.nextInt());  
//        }
//        for (int i = 0; i < n; i++) {
//          System.out.println(o.top());  
//          o.pop();
//        }*/
    
    
    
    
    
    
    
    
  /* static  boolean isBalance(String s){
        boolean b=false;
    
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
            if(s.charAt(i)=='{'||s.charAt(j)=='}'){
             b=true; 
            break;}
            else if(s.charAt(i)=='('||s.charAt(j)==')'){
                b=true; break;
            }
            else if(s.charAt(i)=='['||s.charAt(j)==']'){
                b=true; break;
               
            }
            else b=false;
           //     System.out.println(s.charAt(i)+" "+s.charAt(j));

        }
    }
        if(b)return true;
        else return false;
}
}*/