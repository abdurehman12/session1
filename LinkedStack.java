/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21772
 */
public class LinkedStack<T> {
    StackNode<T> top;

    public void PUSH(T c){
        StackNode<T> newNode=new StackNode(c);

        if(top!=null){
            newNode.next=top;
            top=newNode;
        }
        else
            top=newNode;

    }
    public T POP() {
        if(top!=null){
            StackNode<T> newNode=top;
            top=top.next;
            return (T)newNode.info;
        }
        else
            return null;
    }
    public T PEEK() {
        return top.info;
    }
    public Boolean isEmpty() {
        if(top==null)
            return true;
        else
            return false;
    }
    @Override
    public String toString(){
        StackNode temp=top;
        String s="";

        while(temp!=null){
            s+=temp.info +"\n";
            temp=temp.next;
        }
        return s;
    }
}
