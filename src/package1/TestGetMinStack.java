package package1;

import java.util.Stack;

public class TestGetMinStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(3);
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.getMin());
        myStack.push(0);
        System.out.println(myStack.getMin());
        myStack.pop();
        System.out.println(myStack.getMin());
    }

}
class MyStack{
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyStack() {
        this.stack1 =  new Stack<>();
        this.stack2 =  new Stack<>();
    }

    public void push(Integer num){
        if (stack2.isEmpty()){
            stack2.push(num);
        }else if(num<this.getMin()){
            stack2.push(num);
        }
        stack1.push(num);
    }
    public Integer pop(){
        if (stack1.isEmpty()){
            throw new RuntimeException("empty");
        }
        int value = stack1.pop();
        if(value ==this.getMin()){
            stack2.pop();
        }
        return value;
    }
    public Integer getMin() {
        return stack2.peek();
    }
}