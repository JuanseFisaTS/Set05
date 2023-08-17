public class StringMagic {
 
    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        
 
        if (str.isEmpty() || str.length() == 1) {
            return false;
        }
 
      
        for (int i = 0; i < str.length() - 1; i++) {

            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            

            if (currentChar == nextChar) {
                return true;
            }
        }

        return false;
    }
}