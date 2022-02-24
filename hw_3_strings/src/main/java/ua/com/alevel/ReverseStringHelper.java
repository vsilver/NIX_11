package ua.com.alevel;


public class ReverseStringHelper {
    private ReverseStringHelper() {
    }

    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        return result.toString();
    }

    public static String reverseAllWords(String str) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            reverseWord += reverseString(w).toString() + " ";
        }
        return reverseWord.trim();
    }

    public static String reverseAllWordsForSubstring(String str, String dest) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            reverseWord += reverseSubString(w, dest).toString() + " ";
        }
        return reverseWord.trim();
    }

    public static String reverseAllWordsForSymbols(String str, char firstSymbol, char lastSymbol) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            reverseWord += reverseForSymbols(w, firstSymbol, lastSymbol).toString() + " ";
        }
        return reverseWord.trim();
    }

    public static String reverseAllWordsForIndexes(String str, int firstIndex, int lastIndexl) {
        String words[] = str.split("\\s");
        String reverseWord = "";
        for (String w : words) {
            reverseWord += reverseForIndexes(w, firstIndex, lastIndexl).toString() + " ";
        }
        return reverseWord.trim();
    }

    public static String reverseSubString(String str, String substr) {
        if (str.contains(substr)) {
            String substrResult = reverseString(substr);
            return reverseSubStr(str, substr, substrResult);
        } else
            return null;
    }

    private static String reverseSubStr(String str, String substr, String substrResult) {
        int index = str.indexOf(substr);
        StringBuilder finallyStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == index) {
                i += substrResult.length() - 1;
                finallyStr.append(substrResult);
            } else
                finallyStr.append(str.charAt(i));
        }
        return finallyStr.toString();
    }

    public static String reverseForIndexes(String str, int firstIndex, int lastIndex) {
        if (firstIndex >= 0 && lastIndex <= str.length() - 1 && firstIndex < lastIndex)
            return reverseSubString(str, str.substring(firstIndex, lastIndex + 1));
        else
            return null;
    }

    public static String reverseForSymbols(String str, char firstSymbol, char lastSymbol) {
        int firstS = str.indexOf(firstSymbol);
        int lastS = str.indexOf(lastSymbol);

        if (firstS != -1 && lastS != -1 && firstS < lastS)
            return reverseForIndexes(str, firstS, lastS);
        else
            return null;
    }


}
