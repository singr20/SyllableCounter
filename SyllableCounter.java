/*
 *Counts the number of syllables for a given set of words. The number of syllables is calculated by the amount of vowels in the word. Dipthongs only count as one vowel and a silent e at the end of the word does not count as a vowel.
 *
 *@raunaq singh
 *@version 1.0
 */

public class SyllableCounter{
    int val = 0;
    public static void Syllables(){
       String[] words = {"cat", "hello", "world", "tennis", "episcopal", "count", "learn", "denise", "state","statement","fruit","calculation","spite","spiteful","reservation","late","lately","extreme","expensive"};
        for (int i = 0;i<words.length;i++){
           countSyllables(words[i]);
       }
    }
    public static void countSyllables(String eachWord){
        String[] letters = eachWord.split("(?!^)");
        int val = 0; 
        String[] vowels = {"a", "e", "i", "o", "u", "y","A","E","I","O","U","Y"};
        for (int i = 0;i<letters.length;i++){
            for(int j = 0; j<vowels.length; j++){
                if (letters[i].equals(vowels[j]))
                    val ++;
            }
        }
        
        String lastLetter = eachWord.substring(eachWord.length() - 1);

        if (lastLetter.equals("e")){
            val --;
        }
        
        if (eachWord.indexOf("ai") != -1){
            val --;
        }
                
        if (eachWord.indexOf("ay") != -1){
            val --;
        }
            
        if (eachWord.indexOf("ee") != -1){
            val --;
        }
        
        if (eachWord.indexOf("ea") != -1){
            val --;
        }
        
        if (eachWord.indexOf("ie") != -1 ){
            val --;
        }
        
        if (eachWord.indexOf("ei") != -1 ){
            val --;
        }
        
        if (eachWord.indexOf("oo") != -1){
            val --;
        }
        
        if (eachWord.indexOf("ou") != -1){
            val --;
        }
        
        if (eachWord.indexOf("ow") != -1){
            val --;
        }
        
        if (eachWord.indexOf("oe") != -1 ){
            val --;
        }
        
        if (eachWord.indexOf("ue") != -1){
            val --;
        }
        
        if (eachWord.indexOf("ey") != -1){
            val --;
        }
        
        if (eachWord.indexOf("oy") != -1){
            val --;
        }
        
        if (eachWord.indexOf("oi") != -1 ){
            val --;
        }
        
        if (eachWord.indexOf("au") != -1 ){
            val --;
        }
        
        if (eachWord.indexOf("aw") != -1){
            val --;
        }
        
        if (eachWord.indexOf("io") != -1){
            val --;
        }
        
        System.out.println(eachWord + ": " + val + " syllables");
    }
    public void checkVowel(String ch){
        String[] vowels = { "a", "e", "i", "o", "u", "y","A","E","I","O","U","Y"};
        boolean vowel = false;
        for (int i = 0;i<vowels.length;i++){
             if (ch == vowels[i]){
                vowel = true;
             }else{
                vowel = false;
             }
        }
    }   
}