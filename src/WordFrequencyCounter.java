public class WordFrequencyCounter {
    public static void main(String[] args) {
        String phrase = "Paranoids are not paranoid because they are paranoid but "
                + "because they keep putting themselves deliberately into paranoid avoidable situations";

        MyHashTable hashTable = new MyHashTable();

        // Add each word to the hash table
        String[] words = phrase.split("\\s+");
        for (String word : words) {
            hashTable.add(word);
        }

        // Remove the word "avoidable"
        hashTable.remove("avoidable");

        // Display the updated frequency
        hashTable.displayFrequency();
    }
}
