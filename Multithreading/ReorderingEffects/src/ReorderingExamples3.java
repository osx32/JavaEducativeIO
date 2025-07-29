public class ReorderingExamples3 {
    int x = 0;

    //executed by thread1
    void method1(){
        int read1 = x;
        x = 1;
    }

    //executed by thread2
    void method2(){
        int read2 = x;
        x = 2;
    }

}





class TryReordering {

    int x = 3;
    int y = 7;
    int a = 4;
    int b = 9;
    Object lock1 = new Object();
    Object lock2 = new Object();

    public void writerThread() {

        // BLOCK#1
        // The statements in block#1 and block#2 aren't dependent
        // on eachother and the two blocks can be reordered by the
        // compiler
        x = a;

        // BLOCK#2
        // These two writes within block#2 can't be reordered, as
        // they are dependent on eachother. Though this block can
        // be ordered before block#1
        y += y;
        y *= y;

        // BLOCK#3
        // Because this block uses x and y, it can't be placed before
        // the assignments to the two variables, i.e. block#1 and block#2
        synchronized (lock1) {
            x *= x;
            y *= y;
        }

        // BLOCK#4
        // Since this block is also not dependent on block#3, it can be
        // placed before block#3 or block#2. But it can't be placed before
        // block#1, as that would assign a different value to x
        synchronized (lock2) {
            a *= a;
            b *= b;
        }
    }

    public void readerThread() {

        a *= 10;

        // BLOCK#4
        // Moved out to readerThread() method from writerThread() method
        synchronized (lock2) {
            a *= a;
            b *= b;
        }
    }
}