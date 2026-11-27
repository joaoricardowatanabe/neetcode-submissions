class DynamicArray {

    private int[] newArray;
    private int size;

    public DynamicArray(int capacity) {
         newArray = new int [capacity];
         size = 0;
    }

    public int get(int i) {
        
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }

        return newArray[i];
    }

    public void set(int i, int n) {

        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }

        newArray[i] = n;
    }

    public void pushback(int n) {
        if (size == newArray.length){
            resize();
        }
        
        newArray[size] = n;
        size++;
    }

    public int popback() {
        int lastElement = newArray[size - 1];
        newArray[size - 1] = 0;
        size--;
        return lastElement;
    }

    private void resize() {
       int [] temp = new int [newArray.length *2];

       for (int i = 0; i < size; i++){
        temp[i] = newArray[i];
       }

       newArray = temp;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return newArray.length;
    }
}
