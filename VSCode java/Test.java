class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();
        int l = Math.min(w1, w2);

        for (int i = 0; i < l; i++) {
            merged.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (w1 == w2) {
            return merged.toString();
        } else if (w1 > w2) {
            return merged.append(word1.substring(l)).toString();
        } else {
            return merged.append(word2.substring(l)).toString();
        }

    }

            public static void main(String[] args){
            System.out.println("Starting");
        }
}