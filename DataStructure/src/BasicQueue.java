public class BasicQueue<X> {
    private X [] data;
    private int front =-1;
    private int end =-1;

    public  int MAX=0;
    public BasicQueue(int max){
        this.MAX=max;
        data = (X[]) new Object[max];
    }

    public static void main(String[] args) throws IllegalAccessException{
        BasicQueue<Integer> queue = new BasicQueue<>(7);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
     //   queue.enQueue(7);

        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);


        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
        System.out.println("queue.deQueue() = " + queue.deQueue());
    //    queue.enQueue(5);
//        queue.enQueue(6);


  //      queue.enQueue(6);
    //    queue.enQueue(7);

        queue.printAll();
        System.out.println("queue.size() = " + queue.size());


    }

    private void printAll() {

    }

    private int size() {
        return end-front +1;
    }

    private X deQueue() throws IllegalAccessException {

        if(front >end){
            throw new IllegalAccessException("Queue Empty");
        }
        X temp = data[0];

        // as we have removed the front element so copying all the data to front.
        for(int i=0;i<end;i++){
            data[i]=data[i+1];
        }
            end--;
//        System.out.println("front = " + front +" : end :"+end);
        return temp;
    }

    private void enQueue(X element) throws IllegalAccessException {
        //put the element at end of array always
        //put the element at end of array always

        //its the first element so put at the end
        if(front ==-1 && end  ==-1){
            System.out.println("First element = " + element);
            data[0]=element;
            front =0;
            end =0;
        }else{
            if(front <0) {
                throw new IllegalAccessException("Queue Full For Element: "+element);
            }
            data[++end] = element;
            System.out.println("elemebt "+element+"added at end:"+end);


        }


    }



}
