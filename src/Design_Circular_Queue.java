public class Design_Circular_Queue {

    public int size, currentSize = 0, start = 0, end = 0;
    public int[] arr;

    public Design_Circular_Queue(int k) {
        size = k;
        arr = new int[k];
    }

    public boolean enQueue(int value) {
        if(isFull())
            return false;
        currentSize += 1;
        arr[end] = value;

        end = (end+1)%size;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        currentSize -= 1;
        start = (start+1)%size;
        return true;
    }

    public int Front() {
        if(isEmpty()) return -1;
        return arr[start];
    }

    public int Rear() {
        if(isEmpty()) return -1;
        return arr[(end-1+size)%size];
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == size;
    }

}
