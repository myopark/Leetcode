public class ValidWordAbbr {
    
    HashMap<String, String> map = new HashMap<String, String>();
    
    public ValidWordAbbr(String[] dictionary) {
        for(String s: dictionary){
            String a = getAbbr(s);
            if(map.containsKey(a) && !map.get(a).equals(s)){
                map.put(a, "");
            }
            else{
                map.put(a, s);
            }
        }
    }
    
    public String getAbbr(String s){
        if(s.length() <= 2){
            return s;
        }
        StringBuffer result = new StringBuffer();
        int len = s.length();
        if(len == 0){
            return "";
        }
        int count = len - 2;
        result.append(s.charAt(0) + "" + count + s.charAt(len - 1));
        return result.toString();
    }

    public boolean isUnique(String word) {
        String a = getAbbr(word);
        return !map.containsKey(a) || map.get(a).equals(word);
        //check if word is in dictionary, if it is then you need to check if there is another one that has the same abbr
        //if not in dictionary, check if there is another word that has same abbr in dictionaryh
    }
}
