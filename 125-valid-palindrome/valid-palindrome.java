class Solution {

    boolean alphanum(char ch) {
        if (Character.toLowerCase(ch) >= 'a' &&
            Character.toLowerCase(ch) <= 'z' || ch >= '0' && ch <= '9') {
            return true;
        }

        return false;
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {

            if (!alphanum(s.charAt(i))) {
                i++;
                continue;
            }

            if (!alphanum(s.charAt(j))) {
                j--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}