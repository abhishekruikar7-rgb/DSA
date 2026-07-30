class Solution {
public:
    bool isvowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }

    int maxVowels(string s, int k) {
        int maxi = 0;
        int c = 0;
        for(int i = 0;i < k;i++){
            if(isvowel(s[i])){
                c++;
            }
        }
        maxi = c;
        for(int i = k;i < s.size();i++){
            if(isvowel(s[i-k])){
                c--;
            }
            if(isvowel(s[i])){
                c++;
            }
            maxi = max(maxi,c);

        }
        return maxi;
    }
};