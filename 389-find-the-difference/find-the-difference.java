class Solution {
    public char findTheDifference(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        int j = 0;
        for(int i = 0;i < s1.length;i++){
            if(s1[i] != t1[j]){
                break;
            }
            j++;
        }
        return t1[j];

    }
}