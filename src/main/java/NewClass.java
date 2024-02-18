
import java.util.*;


public class NewClass {
    static String str="";
    static Stack<Integer> num=new Stack<>();
    static Stack<Character>stack=new Stack<>();
    
      public static boolean isSort(Node head){
        Node curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.next.data<curr.data)
                return false;
            curr=curr.next;
        }
        return true;
    }
    public static void fun(char c,int n){
        
        
        
        
        
    if(stack.empty())stack.push(c);
    else{
    if(n==3){
    stack.push(c);
    }
    else if(n==2){
    if(stack.peek()=='+'||stack.peek()=='-'||stack.peek()=='(')
        stack.push(c);
    else{
        if(stack.peek()=='*'){
         int sum=num.pop();
         sum*=num.pop();
         num.push(sum);
         stack.pop();
        }
        if(stack.peek()=='/'){
         int sum=num.pop();
         sum=num.pop()/sum;
         num.push(sum);
         stack.pop();
            
        }
        stack.push(c);
    }
    }
    else if(n==1){
    if(stack.peek()=='(')
      stack.push(c);
    else{while(!stack.empty()&&stack.peek()!='('){System.out.println(num.toString()+"  "+stack.toString());
        int sum=num.pop();
        if(stack.peek()=='*')sum*=num.pop();
        else if(stack.peek()=='/')sum=num.pop()/sum;
        else if(stack.peek()=='+')sum+=num.pop();
        else if(stack.pop()=='-')sum=num.pop()-sum;
        stack.pop();
        num.push(sum);
    }
    stack.push(c);
    }
    }    
    }
    }
    
    
 public static void main(String[]args){
     MyLinkedList l=new MyLinkedList();
     l.addAtLast(1);
     l.addAtLast(2);
     l.addAtLast(31);
     l.addAtLast(4);
     l.addAtLast(15);
      System.out.println(isSort(l.getHead()));
     
    
     
     
     
     String str="8+3*9/7-1";
     int i=0;
     while(i<str.length()){
     char c=str.charAt(i);
         
     switch(c){
         case '+':
         case '-':fun(c,1);break;
         case '/':
         case '*':fun(c,2);break;
         case '(':fun(c,3);break;
         case ')':fun(c,4);break;
         default:
             Integer n=Character.getNumericValue(c);
             num.push(n);
             
     }
     i++;
     }//System.out.println(num.toString());
    // System.out.println(stack.toString());
     while(!stack.empty()){
        if(stack.peek()=='*'){
         int sum=num.pop();
         sum*=num.pop();
         num.push(sum);
         stack.pop();
        }
        else if(stack.peek()=='/'){
         int sum=num.pop();
         sum=num.pop()/sum;
         num.push(sum);
         stack.pop();
         //  System.out.println("num "+num.toString());
        }
        else  if(stack.peek()=='+'){
         int sum=num.pop();
         sum+=num.pop();
         num.push(sum);
         stack.pop();
        }
        else if(stack.peek()=='-'){
         int sum=num.pop();
         sum=num.pop()-sum;
         num.push(sum);
         stack.pop();
        }
         //System.out.println(num.peek());
     }
     System.out.println(num.toString());
 }  
}
