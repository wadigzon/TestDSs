package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Data Structures");
        testArray();
        testArrayList();
        testLinkedList();
        testHashMap();
        testHashSet();
        testStack();
        testQueue();
        testPriorityQueue();
        testTreeMap();
        testTreeMap();
        testDeque();
    }

    public static void testArray() {
        System.out.println("-----------------");
        System.out.println("1. Testing arrays");
        System.out.println("-----------------");

        int[] numbers = {1, 2, 3, 4, 5};
        int[] others = new int[5];

        for (int i : numbers) {
            System.out.println(i);
        }

        for (int i : others) {
            System.out.println(i);
        }

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }

    public static void testArrayList() {
        System.out.println("--------------------");
        System.out.println("1. Testing ArrayList");
        System.out.println("--------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");

    }

    public static void testLinkedList() {
        System.out.println("---------------------");
        System.out.println("1. Testing LinkedList");
        System.out.println("---------------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        for (String letter : linkedList) {
            System.out.println(letter);
        }

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }

    public static void testHashMap() {
        System.out.println("------------------");
        System.out.println("1. Testing HashMap");
        System.out.println("------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Price of Apple: " + map.get("Apple"));
        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }

    public static void testHashSet() {
        System.out.println("------------------");
        System.out.println("1. Testing HashSet");
        System.out.println("------------------");

        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate, will not be added

        for (String fruit : set) {
            System.out.println(fruit);
        }

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }

    public static void testStack() {
        System.out.println("----------------");
        System.out.println("1. Testing Stack");
        System.out.println("----------------");

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // Output: 30
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());  // Output: 20

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }

    public static void testQueue() {
        System.out.println("----------------");
        System.out.println("1. Testing Queue");
        System.out.println("----------------");

        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Head of the queue: " + queue.peek());  // Output: A
        queue.remove();
        System.out.println("Head of the queue after removal: " + queue.peek());  // Output: B

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }

    public static void testPriorityQueue() {
        System.out.println("------------------------");
        System.out.println("1. Testing PriorityQueue");
        System.out.println("------------------------");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(20);
        pq.add(30);
        pq.add(60);

        System.out.println("Head of the PriorityQueue: " + pq.peek());  // Output: 20 (smallest element)
        pq.poll();  // Remove the head element
        System.out.println("New head: " + pq.peek());  // Output: 30

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }

    public static void testTreeMap() {
        System.out.println("------------------");
        System.out.println("1. Testing TreeMap");
        System.out.println("------------------");

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 20);
        treeMap.put("Apple", 10);
        treeMap.put("Cherry", 30);

        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));  // Output sorted by key
        }

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }

    public static void testTreeSet() {
        System.out.println("------------------");
        System.out.println("1. Testing TreeSet");
        System.out.println("------------------");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");

        for (String fruit : treeSet) {
            System.out.println(fruit);  // Output: Apple, Banana, Cherry (sorted order)
        }

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }

    public static void testDeque() {
        System.out.println("----------------");
        System.out.println("1. Testing Deque");
        System.out.println("----------------");

        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");
        deque.addLast("D");
        deque.addLast("E");

        System.out.println(deque.removeFirst());  // Output: A
        System.out.println(deque.removeLast());   // Output: E

        System.out.println("Now printing content of deque:");
        for (String e : deque) {
            System.out.println(e);
        }

        System.out.println("------------");
        System.out.println("End of test!");
        System.out.println("------------");
    }
}