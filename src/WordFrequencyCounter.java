public class WordFrequencyCounter {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.split(" ");

        MyHashTable hashTable = new MyHashTable();

        // Add each word to the hash table
        for (String word : words) {
            hashTable.add(word);
        }

        // Display the frequency of each word
        hashTable.displayFrequency();
    }
}
