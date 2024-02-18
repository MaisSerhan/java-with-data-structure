
import java.util.*;


public class DataStructurePerformanceComparison {
 private static final int NUM_OPERATIONS = 500;
 
//insert NUM_OPERATIONS random value to BinarySearchTree
 public static Long insertBST(BinarySearchTree BST){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  BST.insert(rand.nextInt());
  }
  return  System.currentTimeMillis()-Time; 
 }
 
 //remove NUM_OPERATIONS random value to BinarySearchTree
  public static Long removeBST(BinarySearchTree BST){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
      System.out.println(System.currentTimeMillis());
  for(int i=0;i<NUM_OPERATIONS;i++){
  BST.remove(rand.nextInt());
  }

  return  System.currentTimeMillis()-Time; 
 }
  
 //Seacrch NUM_OPERATIONS random value to BinarySearchTree
  public static Long SeacrchBST(BinarySearchTree BST){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  BST.search(rand.nextInt());
  }
  return  System.currentTimeMillis()-Time; 
 }
 
 //Updet NUM_OPERATIONS random value to BinarySearchTree
  public static Long UpdetBST(BinarySearchTree BST){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  BST.updet(rand.nextInt(),rand.nextInt()+5);
  }
  return  System.currentTimeMillis()-Time; 
 }
  
 //Print NUM_OPERATIONS random value to BinarySearchTree
  public static Long printBST(BinarySearchTree BST){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  BST.print();
  return  System.currentTimeMillis()-Time; 
 }
 
 //insert NUM_OPERATIONS random value to BinarySearchTree
 public static Long insertDLL(DoublyLinkedList DLL){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  DLL.add(rand.nextInt());
  }
  return  System.currentTimeMillis()-Time; 
 }
 
 //remove NUM_OPERATIONS random value to DoublyLinkedList
  public static Long removeDLL(DoublyLinkedList DLL){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  DLL.remove(rand.nextInt());
  }
  return  System.currentTimeMillis()-Time; 
 }
  
 //Seacrch NUM_OPERATIONS random value to DoublyLinkedList
  public static Long SeacrchDLL(DoublyLinkedList DLL){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  DLL.search(rand.nextInt());
  }
  return  System.currentTimeMillis()-Time; 
 }
 
 //Updet NUM_OPERATIONS random value to DoublyLinkedList
  public static Long UpdetDLL(DoublyLinkedList DLL){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  DLL.updet(rand.nextInt(),rand.nextInt()+5);
  }
  return  System.currentTimeMillis()-Time; 
 }
  
 //Print NUM_OPERATIONS random value to DoublyLinkedList
  public static Long printDLL(DoublyLinkedList DLL){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  DLL.print();
  return  System.currentTimeMillis()-Time; 
 }
 
  //insert NUM_OPERATIONS random value to HashMap
 public static Long insertHM(HashMap <Integer,Integer> HM){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  HM.put(i,rand.nextInt());
  }
  return  System.currentTimeMillis()-Time; 
 }
 
 //remove NUM_OPERATIONS random value to HashMap
  public static Long removeHM(HashMap <Integer,Integer> HM){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  HM.remove(rand.nextInt());
  }
  return  System.currentTimeMillis()-Time; 
 }
  
 //Seacrch NUM_OPERATIONS random value to HashMap
  public static Long SeacrchHM(HashMap <Integer,Integer> HM){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  HM.containsValue(rand.nextInt());
  }
  return  System.currentTimeMillis()-Time; 
 }
 
 //Updet NUM_OPERATIONS random value to HashMap
  public static Long UpdetHM(HashMap <Integer,Integer> HM){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  for(int i=0;i<NUM_OPERATIONS;i++){
  HM.put(i,rand.nextInt()+5);
  }
  return  System.currentTimeMillis()-Time; 
 }
  
 //Print NUM_OPERATIONS random value to HashMap
  public static Long printHM(HashMap <Integer,Integer> HM){
  Long Time = System.currentTimeMillis();
  Random rand=new Random();
  System.out.println(HM.toString());
  return  System.currentTimeMillis()-Time; 
 }
  public static void main(String[] args) {
    BinarySearchTree BST = new BinarySearchTree();
    DoublyLinkedList DLL = new DoublyLinkedList();
    HashMap<Integer, Integer> HM = new HashMap<>();   
   
    long bstInsertTime =insertBST(BST);
    long bstRemoveTime =removeBST(BST);
    long bstUpdetTime =UpdetBST(BST);
    long bstSearchTime =SeacrchBST(BST);
    long bstPrintTime =printBST(BST);
    
    long dllInsertTime =insertDLL(DLL);
    long dllRemoveTime =removeDLL(DLL); 
    long dllUpdetTime =UpdetDLL(DLL);
    long dllSearchTime =SeacrchDLL(DLL);
    long dllPrintTime =printDLL(DLL);
     
    long hmInsertTime =insertHM(HM);
    long hmRemoveTime =removeHM(HM);
    long hmUpdetTime =UpdetHM(HM);
    long hmSearchTime =SeacrchHM(HM);
    long hmPrintTime =printHM(HM);
    System.out.println("");
    System.out.println("Operations_DataStructures:\t " +"Remove(Total time ms)\t"+"Insert(Total time ms)\t"+"Search(Total time ms)\t"+"Update(Total time ms)\t"+"Print(Total time ms)\t");
    System.out.println("BinarySearchTree\t\t\t\t"+bstInsertTime+"\t\t\t"+bstRemoveTime+"\t\t\t"+bstSearchTime+"\t\t\t"+bstUpdetTime+"\t\t\t"+bstPrintTime);
    System.out.println("DoublyLinkedList\t\t\t\t"+dllInsertTime+"\t\t\t"+dllRemoveTime+"\t\t\t"+dllSearchTime+"\t\t\t"+dllUpdetTime+"\t\t\t"+dllPrintTime);
    System.out.println("HashMap\t\t\t\t\t"+hmInsertTime+"\t\t\t"+hmRemoveTime+"\t\t\t"+hmSearchTime+"\t\t\t"+hmUpdetTime+"\t\t\t"+hmPrintTime);



  }  
}
