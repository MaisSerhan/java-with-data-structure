
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class BinarySearchTree {
    TreeNode root=null;
    int size=0;
    public BinarySearchTree() {
     
    }

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }
    
    public int fun(TreeNode root){
        if(root==null)return 00;
        int c=fun(root.left)+1;
        c+=fun(root.right);
        return c;
        
    }
    public void insert(Integer value){
    if(root==null)root= insert(value,root);
      else  insert(value,root);
    size++;
    }

    private TreeNode insert(Integer value, TreeNode root) {
    if(root==null)
    return root=new TreeNode(value);
    else{
        if(root.data>value){ 
            if( root.left==null)root.left=insert(value,root.left);
       return insert(value,root.left);
        }
    else if(root.data<value){
        if(root.right==null)root.right=insert(value,root.right);
       return insert(value,root.right);}
    else return null;
    
    }}
    
    public void print(){
        print(root);
        System.out.println("");
    } 

    private void print(TreeNode root) {
    if(root==null)return;
        print(root.left);
        System.out.print(root.data+"\t");
        print(root.right);
    }
    public boolean remove(Integer value){
    //when we not have node in tree
        if(size==0)return false;
    //when we have just 1 node
        else if(size==1){
            if(root.data==value){
                root=null; size--;
                return true;}
            else return false;}
    //when we have more nodes
        else{ //remove the rooot
            if(value==root.data){ 
               if(root.left!=null&&root.right==null)root=root.left;
               else if(root.left==null&&root.right!=null)root=root.right;
               else{
               rightLef(root.left,root.right);
               root=root.left; }
            size--;return true;}
        //remove another node call private method
            else {
          if(remove(value,root,null)!=null)    
          return true;
          else return false;}
            }
                                     }
    
    private TreeNode remove(Integer value, TreeNode root,TreeNode prev) {
        if(root==null)return null;
        else if(root.data==value){
            if(root.right==null&&root.left==null){
              if(prev.data>value) prev.left=root.left;
              else prev.right=root.right;}
         //have 1 child
            else if(root.right!=null&&root.left==null){
            return prev.right=root.right;}
            else if(root.left!=null&&root.right==null){
            return prev.left=root.left;}
         //have 2 children
            else{
              if(prev.data>value){
               prev.left=root.left;
               rightLef(root.left,root.right);}
              else{
               prev.right=root.right;
               leftLef(root.right,root.left);
                 }
               }                } 
   
        else if(value<root.data)return remove(value,root.left,root);
        else if(value>root.data)return remove(value,root.right,root);
    return null;
    }
    
    private void rightLef(TreeNode head,TreeNode right){
     if(head.right==null)
      head.right=right;
     else rightLef(head.right,right);    }
    
    private void leftLef(TreeNode head,TreeNode left){
     if(head.left==null)
      head.left=left;
     else rightLef(head.left,left);   }
    /*    
        
        
        
    if(root==null)return false;
    if(root.data==value){
        TreeNode curr=root.right;
        leafRight(root).right=curr;
        
    }*/
    
    public void updet(int value,int value2){
    
    set(value,value2);//تغير القيمة
    ArrayList<Integer> a=new ArrayList<>();
    a=inorder(root,a);
       // System.out.println(a.toString());
        Collections.sort(a); 
       // System.out.println(a.toString());
        copy(root,a);
}
      public static ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> arr) { 
		if (root == null) { 
			return arr; 
		} 
		inorder(root.left,arr); 
		arr.add(root.data); 
		inorder(root.right,arr); 
		return arr; 
	} 
    
    
    private void copy(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return ;
        }
        copy(root.left,arr);
        root.data=arr.get(0);
        arr.remove(0);
        copy(root.right,arr);
        
      
    }
   
    public void set(Integer value,Integer newValue){
        if(root!=null) 
          set(value,newValue,root);
       
    }

    private void set(Integer value, Integer newValue, TreeNode root) {
        if(root==null)return;
     if(root.data==value){
      root.data=newValue;
     }
     
    else{ if(value<root.data)set(value,newValue,root.left);
        else if(value>root.data)set(value,newValue,root.right);
        else{ 
            root.data=newValue;
        }
     }    }
    public boolean search(Integer value){
    return search(root,value);    
    }

    private boolean search(TreeNode root,Integer value) {
    if(root==null)return false;
    else{
        if(root.data==value)return true;
    else if(root.data<value)
    return search(root.right,value);
    else if(root.data>value)
    return search(root.left,value);
    else return true;
    }
    }
        
}
