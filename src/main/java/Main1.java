
import java.util.Scanner;


public class Main1 {
  public static void main(String []args){
      Scanner in=new Scanner(System.in);
      int l1=10;
      String nume = "Elzero Web School ";
      int []array={1,2,2,5};
      String letterZ ="O";
      System.out.println(array[0]);
      System.out.println(nume);
     BinarySearchTree tree=new BinarySearchTree();
     BinarySearchTree tree1=new BinarySearchTree();
      System.out.println(System.currentTimeMillis());
     tree.insert(4);
     tree.insert(2);
     tree.insert(3);
     tree.insert(1);
     tree.insert(5);
     tree.insert(6);
     tree.insert(7);
     tree.insert(8);
     tree.insert(9);
     tree.insert(10);
      //System.out.println(tree.root);
    // System.out.println(System.currentTimeMillis());
    // System.out.println(tree.root.data);     
    // tree.print();
    /// tree.remove(8);
     //
      System.out.println(tree.fun(tree.root));
     tree.print();
     tree.updet(3, 18);
      //System.out.println(tree.root);
    // System.out.println(System.currentTimeMillis());
tree.print(); 
   DoublyLinkedList l=new DoublyLinkedList();
   l.add(5);
   l.add(3);
   l.add(6);
   l.add(4);
   l.add(2);
     // System.out.println(l.head.data+" "+l.tail.data);
   
    
  // l.print();
  }  }

