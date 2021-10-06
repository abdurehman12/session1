/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21772
 */
public class driver {
    public static void main(String [] args){
        ArrayStack<Integer> stck = new ArrayStack<>(7);
        stck.PUSH(1);
        stck.PUSH(2);
        stck.PUSH(3);
        stck.PUSH(4);
        stck.PUSH(5);
       System.out.println(stck);
        stck.POP();
        System.out.println(stck);
     
       System.out.print(stck.PEEK());
       
         boolean tr=(stck.validate("{2+[3*(5+6}]}"));
    System.out.print(tr);
    }
  
}
