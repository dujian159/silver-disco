package package1;

public class TestStack {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push(0);
        arrayStack.push(1);
        arrayStack.push(2);
        System.out.println(arrayStack.pop());
        arrayStack.push(2);
        System.out.println(arrayStack.peek());
    }
}
class ArrayStack{
    Integer[] arr;
    Integer size;


    public ArrayStack(Integer num) {
        if(num<0){
            throw new IllegalArgumentException("参数必须大于0");
        }
        this.arr = new Integer[num];
        this.size = 0;
    }
    public void push(Integer num){
        if (size==arr.length){
            throw new ArrayIndexOutOfBoundsException("The queue is full");
        }
        arr[size++] = num;
    }
    public Integer pop(){
        if (size==0){
            throw new ArrayIndexOutOfBoundsException("The queue is empty");
        }

        return arr[--size];
    }
    public Integer peek(){
        if (size==0){
            return null;
        }
        return arr[size-1];
    }
}