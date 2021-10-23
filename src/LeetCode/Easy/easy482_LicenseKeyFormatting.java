package LeetCode.Easy;

public class easy482_LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        String result = s.toUpperCase().replaceAll("-", "");
        int charAtCount = 0;
        for(int i = result.length() ; i >= 0 ; i--){

            if(charAtCount == k && i != 0){
                charAtCount = 0;
                result = insertAt(result, i, "-");
            }
            charAtCount++;
        }

        return result;
    }

    public String insertAt(String v, int i, String k){
        return v.substring(0, i) + k + v.substring(i);
    }
}
