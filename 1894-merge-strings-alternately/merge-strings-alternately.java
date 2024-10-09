class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Merge letters alternately
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(j));
            i++;
            j++;
        }

        // Append remaining letters from word1
        if (i < word1.length()) {
            merged.append(word1.substring(i));
        }

        // Append remaining letters from word2
        if (j < word2.length()) {
            merged.append(word2.substring(j));
        }

        return merged.toString();
    }
}
