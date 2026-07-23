class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char,string> mp1;
        unordered_map<string,char> mp2;

        stringstream ss(s);
        vector<string> words;
        string word;
        while(ss >> word){
            words.push_back(word);
        }
        if(pattern.size() != words.size()){
            return false;
        }

        for(int i = 0;i < pattern.size();i++){
            if(mp1.count(pattern[i]) || mp2.count(words[i])){
                if(mp1[pattern[i]] != words[i] || mp2[words[i]] != pattern[i]){
                    return false;
                }
            }
            else{
                mp1[pattern[i]] = words[i];
                mp2[words[i]] = pattern[i];
            }
        }
        return true;
        
    }
};