public class CircularQueueWithAlgo<X> {
    private X [] array;
    private int front =-1;
    private int end =-1;
    private int size=0;
    public CircularQueueWithAlgo(int size){
        this.size=size;
        array = (X[]) new Object[size];
    }

    private int currentSize=-1;

    public static void main(String[] args) throws IllegalAccessException{
        CircularQueueWithAlgo<Integer> circularQueue = new CircularQueueWithAlgo<>(10);

        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        circularQueue.enQueue(5);
        circularQueue.enQueue(6);
        circularQueue.enQueue(7);
        circularQueue.enQueue(8);
        circularQueue.enQueue(9);
        circularQueue.enQueue(10);

        System.out.println("circularQueue.deQueue(1) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(2) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(3) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(4) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(5) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(6) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(7) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(8) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(9) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(10) = " + circularQueue.deQueue());

        circularQueue.enQueue(11);
        circularQueue.enQueue(12);
        circularQueue.enQueue(13);
        circularQueue.enQueue(14);
        circularQueue.enQueue(15);
        circularQueue.enQueue(16);
        circularQueue.enQueue(17);
        circularQueue.enQueue(18);
        circularQueue.enQueue(19);
        circularQueue.enQueue(20);

        System.out.println("circularQueue.deQueue(11) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(12) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(13) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(14) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(15) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(16) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(17) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(18) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(19) = " + circularQueue.deQueue());
        System.out.println("circularQueue.deQueue(20) = " + circularQueue.deQueue());

        //     circularQueue.enQueue(10);
     //   circularQueue.enQueue(11);
     //   circularQueue.enQueue(12);

    }

    private X deQueue() throws IllegalAccessException{


        if (front ==(front+1)%size){
            throw new IllegalAccessException("Queue has no element");
        }
        currentSize--;

        X temp =array[front];

        front= (front+1)%size;
       return temp;
    }

    private void enQueue(X element) throws IllegalAccessException{
        //Its first element
        if(front==-1 && end==-1){
            array[0]=element;
            front =end =0;
            currentSize++;
            return;
        }

        //check if queue is full.
        if( end==(end+1)%size){
            throw new IllegalAccessException("Queue Is full : "+front+":"+end);

        }
        currentSize++;

       end =(end+1)%size;
       array[end]=element;

        System.out.print("front = " + front);
        System.out.print(":end = " + end);




    }


}
