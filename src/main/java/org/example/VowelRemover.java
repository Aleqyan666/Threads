package org.example;

import java.util.function.Predicate;

public class VowelRemover {

    public String removeVowels(String string) {
        StringBuilder sb = new StringBuilder(string);
        Predicate<Character> isVowel = c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';

        for (int i = 0; i < sb.length() ; i++) {
            if (isVowel.test(sb.charAt(i))) {
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }





}
