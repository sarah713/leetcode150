public class Haystack {
    public int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                j++;
                if (j == n) {
                    return i;
                }
            }
        }
        return -1;
    }
}
