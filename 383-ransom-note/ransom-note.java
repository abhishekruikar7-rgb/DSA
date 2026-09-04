class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> mp = new HashMap<>();
        
        for(char i : m.toCharArray()){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i = 0;i < r.length();i++){
            if(mp.getOrDefault(r.charAt(i),0) == 0){
                return false;
            }
            mp.put(r.charAt(i),mp.getOrDefault(r.charAt(i),0)-1);
        }
        return true;
    }
}