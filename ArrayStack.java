/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 21772
 */
public class ArrayStack<T extends Comparable<T>> {
    T stackList[];
    int top=-1;
    //int counter=0;
// constructor
    ArrayStack(int size){

        stackList=(T[]) new Comparable[size];


    }
    // methods
    public void PUSH(T c) {
        if(this.isFull())
        {
       /* T stackList1[] =(T[]) new Comparable[stackList.length*2];
        for(int i=0;i<=top;i++){
            stackList1[i]=stackList[i];
        }
        top++;
        stackList1[top]=c;
        stackList=stackList1;*/
        }
        else{

            top++;
            stackList[top]=c;
        }
    }
    public T POP() {
        if(top !=-1){
            T temp=(T) stackList[top];
            top--;
            return temp;
        }
        else
            return null;
    }

    public T PEEK() {
        return stackList[top];
    }
    public Boolean isEmpty() {
        if(top==-1)
            return true;
        else
            return false;
    }

    public Boolean isFull(){
        if(top==stackList.length-1) return true;
        else
            return false;
    }

    @Override
    public String toString(){
        String s="";
        for(int i=top;i>=0;i--)
        {
            s+= stackList[i] +"\n";
        }
        return s;
    }

    public boolean validate(String Exp){
//  Create stack s
        ArrayStack<Character> stck=new ArrayStack<Character>(Exp.length());
        int index=0;
        while (index<Exp.length()){

            char symb = Exp.charAt(index);
            if(symb == '(' || symb == '{' || symb == '[')
                stck.PUSH(symb);
            if (symb == ')' || symb == '}' || symb == ']'){
                if (stck.isEmpty())
                    return false;
                else{
                    char item=stck.PEEK();
                    if (item=='(' && symb==')' || item=='[' && symb==']' || item=='{' && symb=='}') {// open and close parenthesis pair check
                        stck.POP();
                    }
                    else
                    {
                        return false;
                    } }
            }
            index++;
        }
        if(stck.isEmpty() ) return true;
        else return false;
    }
}
