package apFreeResponse2014.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sonicdeadlock on 5/20/2014.
 */
public class WorldScramblerComplete {
    /** Scrambles a given word.
     * @param word the word to be scrambled
     * @return the scrambled word (possibly equal to word)
     * Precondition: word is either an empty string or contains only uppercase letters.
     * Postcondition: the string returned was created from word as follows:
     * - the word was scrambled, beginning at the first letter and continuing from left to right
     * - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
     * - letters were swapped at most once
     */
    public static String scrambleWord(String word)
{
        String finalString="";
       char[] charArray = word.toCharArray();
    for (int i = 0; i <word.length()-1 ; i++) {
        if(charArray[i]=='A' && charArray[i+1]!='A'){
            finalString+=charArray[i+1];
            finalString+=charArray[i];
            i++;
        }
        else {
            finalString += charArray[i];
            if (i == word.length() - 2)
                finalString += charArray[i + 1];
        }
    }

        return finalString;
    }

    /** Modifies wordList by replacing each word with its scrambled
     * version, removing any words that are unchanged as a result of scrambling.
     * @param wordList the list of words
     * Precondition: wordList contains only non-null objects
     * Postcondition:
     * - all words unchanged by scrambling have been removed from wordList
     * - each of the remaining words has been replaced by its scrambled version
     * - the relative ordering of the entries in wordList is the same as it was
     * before the method was called
     */
    public static void scrambleOrRemove(List<String> wordList){
        List<String> newList = new ArrayList<String>();
        for(int i=0;i<wordList.size();i++){
            String scrambled = scrambleWord(wordList.get(i));
            if(!wordList.get(i).equals(scrambled)){
                wordList.set(i,scrambled);
            }
            else{
                wordList.remove(i);
                i--;
            }
        }
        for (String s : wordList) {
            System.out.println(s);
        }
    }

}
