package package1;

public class Test11 {

     static class Node{
        int value;
        Node next;
         public Node() {
         }
        public Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Node node1 = new Node(3);
        node1.next = new Node(2);
        node1.next.next = new Node(5);
        node1.next.next.next = new Node(6);
        node1.next.next.next.next = new Node(1);

       Node node = nodeSort(node1,3);
        printLinkedList(node);
    }
    private static void printLinkedList(Node node) {
        while (node!=null){
            System.out.print(node.value);
            node = node.next;
        }
        System.out.println();
    }
    private static Node nodeSort(Node node1,int num) {
         int[] arr = new int[5];
         int i = 0;
         while(node1!=null){
             arr[i++] = node1.value;
             node1 = node1.next;
         }
        arrSort(arr,num);
        Node head = new Node();
        Node p=head;
        System.out.println(arr.length);

        for(int j=0;j<arr.length;j++){
            if(j<arr.length-1){
                p.next=new Node();
            }else {
                p.next = null;
            }
            p.value = arr[j];
            p = p.next;
        }
//        for (int j = 0; j < arr.length; j++) {
//            if (node2!=null) {
//                node2.value = arr[j];
//                node2.next = ;
//            }
//        }
        return head;
     }
    public static void arrSort(int arr[],int num){
        int left = -1;
        int right = arr.length;
        int index = 0;
        while(index<right){
            if(arr[index]<num){
                swap(arr,++left, index++);
            }
            if(arr[index]>num){
                swap(arr,--right, index);
            }
            if(arr[index]==num){
                index++;
            }
        }
    }
    public static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
