import java.util.LinkedList;

public class MyHashTable {
    private LinkedList<MyMapNode>[] buckets;
    private static final int SIZE = 10;

    public MyHashTable() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(String key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % SIZE);
    }

    public void add(String key) {
        int index = getBucketIndex(key);
        LinkedList<MyMapNode> bucket = buckets[index];

        for (MyMapNode node : bucket) {
            if (node.key.equals(key)) {
                node.value++;
                return;
            }
        }

        bucket.add(new MyMapNode(key, 1));
    }

    public void displayFrequency() {
        System.out.println("Word Frequency:");
        for (LinkedList<MyMapNode> bucket : buckets) {
            for (MyMapNode node : bucket) {
                System.out.println(node.key + ": " + node.value);
            }
        }
    }
}
