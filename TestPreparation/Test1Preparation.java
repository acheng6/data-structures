
import java.util.ArrayList;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Qiong
 */
public class Test1Preparation {
    //merge is the method name
    
    public <T extends Comparable<T>> ArrayList<T> merge
            (T[] list1, T[] list2) throws Exception{
               if (list1 == null || list2 == null)
                   throw new Exception();
                  
               Stack<T> stack1 = new Stack<>();   
               for (T item : list1){
                   stack1.push(item);
               }
               
               Stack<T> stack2 = new Stack<>();   
               for (T item : list2){
                   stack2.push(item);
               }
               
               ArrayList<T> newList = new ArrayList<>();
               while ((! stack1.empty()) && ! stack2.empty()){
                   T item1 = stack1.peek();
                   T item2 = stack2.peek();
                   if (item1.compareTo(item2) < 0){
                       newList.add(stack1.pop());
                   }else{
                       newList.add(stack2.pop());
                   }
               }
               
               while (!stack1.empty()){
                   newList.add(stack1.pop());
               }
               
               while (!stack2.empty()){
                   newList.add(stack2.pop());
               }
               
               return newList;
            }
            
            public static void main(String[] argv){
                Integer [] list1 = {1, 4, 2};
                Integer [] list2 = {5, 7, 3};
                Test1Preparation test = new Test1Preparation();
                try{
                    System.out.println(test.merge(list1, list2));
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            }
    
}
