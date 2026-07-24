class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character, Integer> mp2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i);
            if (!mp1.containsKey(a)) mp1.put(a, i);
            if (!mp2.containsKey(b)) mp2.put(b, i);
            if (mp1.get(a) != mp2.get(b)) return false;
        }
        return true;

    }
}