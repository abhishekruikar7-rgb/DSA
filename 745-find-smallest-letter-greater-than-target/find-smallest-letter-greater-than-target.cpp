class Solution {
public:
    char nextGreatestLetter(vector<char>& s, char target) {
        char ans = '{';
        for(int i = 0;i < s.size();i++){

            if(s[i] > target && s[i] < ans){

                ans = s[i];
            }
        }
        if(ans == '{'){
            return s[0];
        }
        return ans;
    }
};