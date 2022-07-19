/*
import java.util.Arrays;

public class BasicStack<X> {
    private X [] data;
    private int stackPointer;

    public  int MAX=100000;
    public BasicStack(int max){
        this.MAX=max;
        data = (X[]) new Object[max];
    }

    public static void main(String[] args) {
        BasicStack<Integer> stack = new BasicStack<>(100);
        
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(12);
        stack.push(12);
    //    System.out.println("stack.pop() = " + stack.pop());
    //    System.out.println("stack.pop() = " + stack.pop());
    //    System.out.println("stack.pop() = " + stack.pop());

        System.out.println("stack.contains(23) = " + stack.contains(23));
    }

    private boolean contains(X searchElement) {

        return recursiveFindAlgorithm(searchElement,this.stackPointer);

    }

    private boolean recursiveFindAlgorithm(X searchElement, int index) {

        System.out.println("index = " + data[index]);
        int FALSE =1;
        if(index <=0){
            System.out.println("Reached Limit of Stack");

            return false;
        }

        if(data[index]==searchElement){
            System.out.println("searchElement = " + searchElement);

        }else{
            FALSE= FALSE * recursiveFindAlgorithm(searchElement,--index);
        }
        return true;

    }

    private int pop() {
        if(stackPointer<=0){
            throw new StackOverflowError("Stack Limit of underflow Reached");
        }
        return (int) data[stackPointer--];
    }

    private void push(X element) {
        if(stackPointer >=this.MAX){
            throw new StackOverflowError("Stack Overflowing");
        }

        data[++stackPointer]= element;

    }
}
*/
