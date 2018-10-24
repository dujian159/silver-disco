package package1;

public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.push(0);
        arrayQueue.push(1);
        arrayQueue.push(2);
        System.out.println(arrayQueue.pop());
        arrayQueue.push(2);
        System.out.println(arrayQueue.peek());
    }


}
class ArrayQueue {
    Integer[] arr;
    Integer size;
    Integer first;
    Integer last;

    public ArrayQueue(Integer num) {
        if (num < 0) {
            throw new IllegalArgumentException("参数必须大于0");
        }
        this.arr = new Integer[num];
        this.size = 0;
        this.first = 0;
        this.last = 0;
    }
    public void push(Integer num){
        if (size==arr.length){
            throw new ArrayIndexOutOfBoundsException("The queue is full");
        }
        arr[last] = num;
        size++;
        last = last==arr.length-1?0:last+1;
    }
    public Integer pop(){
        if (size==0){
            throw new ArrayIndexOutOfBoundsException("The queue is empty");
        }
        Integer temp = arr[first];
        size--;
        first = first==arr.length-1?0:first+1;
        return temp;
    }
    public Integer peek(){
        if (size==0){
           return null;
        }
        return arr[first];
    }
}
