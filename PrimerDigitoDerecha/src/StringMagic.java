public class StringMagic {
 
    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {
 
      
        if (str.isEmpty()) {
            return -1;
        }
 

        int length = str.length();
 
      
        for (int i = length - 1; i >= 0; i--) {

            char c = str.charAt(i);
 
         
            if (Character.isDigit(c)) {

                return Character.getNumericValue(c);
            }
        }
 

        return -1;
    }
}