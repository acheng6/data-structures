/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*; 
/**
 *
 * @author amandacheng
 */
public class TestPreparation {
    
    public<T extends Comparable<T>> ArrayList<T> merge(T[] list1, T[]list2) throws Exception{
       
        if(list1 == null||list2==null)
        //if(list1.length==0||list2.length==0)
           
       
        throw new Exception();   
       
        Stack<T> stack1 = new Stack<T>(); 
        for(T item : list1)
        {
            stack1.push(item);
        }
        Stack<T> stack2 = new Stack<T>(); 
        for(T item2: list2)
        {
            
            stack2.push(item2);
            
        }
        ArrayList<T> newList = new ArrayList<>();
        while(!stack1.empty() && !stack2.empty()){
            
            T item1 =stack1.peek(); 
            T item2 = stack2.peek();
            if(item1.compareTo(item2)<0)//if the int that comes back is less than 0 than it means its less than
            {
                newList.add(stack1.pop());
            }
            else
                newList.add(stack2.pop()); 
                
            
        }
    while (!stack1.empty()){
        newList.add(stack1.pop());
    }    
        
    while(!stack2.empty()){
        newList.add(stack2.pop());
    }
    return newList; 
    }
    
    public static void main(String[]args){
        Integer [] list1 = {1,4,2};
        Integer [] list2 = {5,7,3}; 
        TestPreparation test = new TestPreparation();
        try{
        System.out.println(test.merge(list1, list2)); 
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
        
    }
    
}
