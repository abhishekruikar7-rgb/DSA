class Solution {
public:
    int longestConsecutive(vector<int>& s) {
        if(s.size() == 0){
            return 0;
        }
        unordered_set<int> st;
        for(int i = 0;i < s.size();i++){
            st.insert(s[i]);
        }
        int longest = 1;
        int c = 0;
        for(auto i : st){
            if(st.find(i-1) == st.end()){
                c = 1;
                int x = i;
                while(st.find(x+1) != st.end()){
                    x++;
                    c++;
                }
                longest = max(longest,c);
            }
        }
        return longest;
    }
};