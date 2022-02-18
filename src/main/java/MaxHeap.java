//import java.util.*;
//
////-----------------------------------------------------------------//
//public class MaxHeap<T extends Comparable<T>> {
//    //-----------------------------------------------------------------//
//    //------------- !!Do not change the following lines!! -------------//
//    public String toString() {
//        return heap_.toString();  // do not change this!!!
//    }
//
//    //---------------------------------------------------------------//
//    //--------------- !!Insert your solution below!! ----------------//
//    private List<T> heap_;
//    private int size;
//
//    //---------------------------------------------------------------//
//    public MaxHeap() {
//        heap_ = new ArrayList<>();
//        size = 0;
//    }
//
//    //---------------------------------------------------------------//
//    public MaxHeap(T[] arr) {
//        heap_ = new ArrayList<>();
//        for (T t : arr) {
//            insert(t);
//        }
//
//    }
//
//    //---------------------------------------------------------------//
//    public List<T> getHeap() {
//        return new ArrayList<>(heap_);
//    }
//
//    //---------------------------------------------------------------//
//    public int getSize() {
//        return heap_.size();
//    }
//
//    //---------------------------------------------------------------//
//    public boolean isEmpty() {
//        return heap_.isEmpty();
//    }
//
//    //---------------------------------------------------------------//
//    public void sink(int n) {
//        while (2 * n <= size) {
//
//            int j = 2 * n;
//            if ((j < size) && compare(j, j + 1))
//                j++;
//            if (compare(j, n))
//                break;
//            swap(n, j);
//            n = j;
//        }
//    }
//
//    //---------------------------------------------------------------//
//    public void insert(T obj) {
//        heap_.add(obj);
//        size++;
//        swim(size);
//    }
//
//    //---------------------------------------------------------------//
//    private void swim(int n) {
//        while ((n > 1) && compare(n / 2, n)) {
//            swap(n / 2, n);
//            n = n / 2;
//        }
//    }
//
//    private boolean compare(int v, int w) {
//        return (heap_.get(v - 1).compareTo(heap_.get(w - 1)) < 0);
//    }
//
//    private void swap(int i, int j) {
//        T tmpI = heap_.get(i - 1);
//        T tmpJ = heap_.get(j - 1);
//        heap_.remove(i - 1);
//        heap_.add(i - 1, tmpJ);
//        heap_.remove(j - 1);
//        heap_.add(j - 1, tmpI);
//    }
//
//
//    //---------------------------------------------------------------//
//    public static void main(String[] args) {
//        Integer[] s = { 8, 3, 7, 1, 5, 6, 18, 9};
//        MaxHeap<Integer> test = new MaxHeap<>(s);
//        System.out.println(test.toString());
//    }
//}