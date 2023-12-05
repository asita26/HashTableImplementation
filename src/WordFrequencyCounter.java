public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but "
                + "because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = paragraph.split("\\s+"); // Split words by whitespace

        MyHashTable hashTable = new MyHashTable();

        for (String word : words) {
            hashTable.add(word);
        }

        hashTable.displayFrequency();
    }
}
