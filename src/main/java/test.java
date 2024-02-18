
import java.util.*;


public class test {
  
    public static Integer[] trebile(Integer[] a,int x){
    HashMap<Integer,Integer[]> hash=new HashMap<>();
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                Integer b[]=new Integer[2];
                b[0]=a[i];b[1]=a[j];
              hash.put(a[i]+a[j],b);  
            }
        }
         
        for (int i = 0; i < a.length; i++) {
            if(hash.containsKey(x-a[i]));
            Integer b[]=new Integer [2];
            b=hash.get(x-a[i]);
            return b;}
        Integer o[]={-1};
            return o;
    }
    
    
public static boolean isThree(TreeSet <Integer>set){
    Integer a[]=set.toArray(new Integer[0]);
    HashMap<Integer,Integer>hash=new HashMap<>();
    for (int i = 0; i < a.length-3; i++) {
        for (int j = 0; j <  a.length-3; j++) {
         if(a[i]+a[i+1]+a[i+2]==0)return true;   
        }
   
    }
   return false;
}    
public static TreeSet fun(int a[]){       
   TreeSet <Integer> set=new TreeSet();
   for(int i=0;i<a.length;i++){
      
       set.add(a[i]);
       
   }
    System.out.println(set.toString());
    Integer b[]=set.toArray(new Integer[0]);
    TreeSet<Integer> v=new TreeSet<>(),max=new TreeSet<>();
    v.add(b[0]);
         // System.out.println(set.toArray().toString());
    for (int i = 0; i < set.size()-1; i++) {
       if(b[i+1]-b[i]==1){v.add(b[i]);
       v.add(b[i+1]);
       }
      //  System.out.println(v.size()+max.size());
         if(b[i+1]-b[i]!=1){  
           if(max.size()<v.size()){
             //  System.out.println(v.size()+" "+max.size());
               max.clear();
           max.addAll(v);}       
           
           v.clear();
        }
        
    }
    if(max.size()<v.size())
   return v;
  return max;
}
public static void main(String []args){  
   Integer a[]=new Integer [7];
   /* a[0][0]=1;a[0][1]=2;a[0][2]=0;
    a[1][0]=3;a[1][1]=1;a[1][2]=2;
    a[2][0]=2;a[2][1]=3;a[2][2]=1;*/
  // for (int i = 0; i < 10; i++) {
        a[0]=-2;
        a[1]=-1;
        a[2]=2;
        a[3]=3;
        a[4]=6;
        a[5]=8;
        a[6]=10;
    //}
    TreeSet<Integer>ar=new TreeSet<>();
    for (int i = 0; i < a.length; i++) {
        ar.add(a[i]);
    }
  Integer [] i=new Integer[2];
  i=trebile(a,3);
    for (int j = 0; j < 2; j++) {
        System.out.println(i[j]);
    }
   // System.out.println(fun(a));

}
}
