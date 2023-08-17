public class StringMagic {
    
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        int cont = 0;
        for(int i =0; i< str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                cont++;
            }
        }
        
        return cont;
    }
}