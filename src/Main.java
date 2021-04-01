public class Main {

    public static void main(String[] args) {

        CustomQueue<Integer> myCustomQueue =  new CustomQueue<>();

        myCustomQueue.add(1);
        myCustomQueue.add(2);
        myCustomQueue.add(3);
        myCustomQueue.add(4);
        myCustomQueue.add(5);
        myCustomQueue.add(6);

        System.out.println(myCustomQueue.removeByUser(2));
        System.out.println(myCustomQueue.removeByUser(6));
        System.out.println(myCustomQueue.removeByUser(10));
        myCustomQueue.move(3,1);
        myCustomQueue.print();
        myCustomQueue.reverse();
        System.out.println("before reverse");
        myCustomQueue.print();
        myCustomQueue.swap(6,1);
        System.out.println("after reversing");
        myCustomQueue.print();
        myCustomQueue.removeByPosition(3);
        myCustomQueue.removeByUser(1);
        System.out.println("after removing some elements");
        myCustomQueue.removeByPosition(6);
        myCustomQueue.add(7);
        myCustomQueue.add(8);
        System.out.println("==================");
        myCustomQueue.print();

        myCustomQueue.print();
    }
}
