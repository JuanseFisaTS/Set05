public class StringMagic {
 
    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public String findLongestWord(String sentence) {
 
        if (sentence.isEmpty()) {
            return "";
        }
 
        String[] words = sentence.split(" ");
 

        String longestWord = "";
        int maxLength = 0;
 
        for (String word : words) {
 
            
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
 

       
 
 return longestWord;
    }
}