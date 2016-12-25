package StrStr;

public class StrStr {
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        
        if (haystack.length() < needle.length()) {
            return -1;
        }
        
        int i = 0;
        int j = 0;
        for (i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (j = 1; j < needle.length(); j++) {
                	if (i + j >= haystack.length()) {
                		return -1;
                	}
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needle.length())
                	return i;
            }
        }
        return -1;
    }
	
	public static void main(String[] args) {
		String a = "aaaa";
		String b = "baaa";
		StrStr solution = new StrStr();
		System.out.print(solution.strStr(a, b));
	}
}
