/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class MyStack {
private MyLinkedList list;
private int size=0;

 public MyStack() {
 list=new MyLinkedList();
    }
 
 public void push(Integer value)  {
 list.addAtFirst(value);
 size++;
 } 
 
 public Integer peek(){
 return list.getHead().data;
 }  
 
 public Integer pop(){
     size--;
 return list.removeAtFirst();

 }  
 
 public MyStack sort(){
 MyStack news=new MyStack();
 while(!this.isempty()){
     if(news.isempty())news.push(this.pop());
     else{
         if(this.peek()<=news.peek())
             news.push(pop());
         else{int t=pop();
         while(!news.isempty()&&t>news.peek())
             push(news.pop());
         news.push(t);
             
         }
        
     }}
   while(!news.isempty()){
       push(news.pop());
       System.out.println("1");
   }
 return news;
 }
 
 
 
 public String toString(){
     return list.toStringStack();
 }  
    
 public boolean isempty(){
     return size==0;
 }   
  public Integer max(){
      int tem=pop();MyStack s=new MyStack();
      s.push(tem);
      while(!isempty()){
          s.push(peek());
          if(peek()>tem){
              
              tem=pop();
          }
          else pop();
      }
      while(!s.isempty())push(s.pop());
      return tem;
  }  
    
  /*private int t=-1;
  private int a[]=new int [100];
   public int top(){
      if(t==-1) return -1;
      return a[t];
   }
   public void push(int i){
       if(t==99)System.out.println("no");
       else {t++; a[t]=i;}
   }
    public void pop(){
        if(t==-1)System.out.println("Error");
        else --t; 
    }
boolean isEmpity(){
    if(t<=-1)return true;

    else return false;
}*/ 

   

}
