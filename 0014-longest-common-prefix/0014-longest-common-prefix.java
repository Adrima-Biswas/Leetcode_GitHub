class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String prefix = strs[0];  // smallest string becomes first string and it stores into prefix variable

        for(int i=1; i<strs.length; i++) {

            String str = strs[i];  // strs[1] = ""
            if(str.length() == 0) return str;

            for(int j=0; j<str.length(); j++) {

                if(j < prefix.length() && prefix.charAt(j) != str.charAt(j)) {
                    prefix = prefix.substring(0, j);    // bathj
                    break;
                }
            }

            if(prefix.length() == 0) return prefix;
        }

        return prefix;
    }
}

/*
       0     1     2      3
    ["bat","bag","bank","band", ""]

    prefix = arr[0] = "bat"

    i = 1 | arr[1] = "b a g" || loop j=0 to arr[1].length()
                                j = 0 | prefix.isPresent('b') -> Yes
                                j = 1 | prefix.ispresent('a') -> Yes
                                j = 2 | prefix.ispresent('g') -> No | prefix = "ba" [Update prefix]

    i = 2 | arr[2] = "b a n k" || loop j=0 to arr[2].length()
                                j = 0 | prefix.isPresent('b') -> Yes
                                j = 1 | prefix.ispresent('a') -> Yes
                                j = 2 | prefix.ispresent('n') -> No | prefix = "ba" [Update prefix]

    i = 3 | arr[3] = "b a n d" || loop j=0 to arr[d].length()
                                j = 0 | prefix.isPresent('b') -> Yes
                                j = 1 | prefix.ispresent('a') -> Yes
                                j = 2 | prefix.ispresent('n') -> No | prefix = "ba" [Update prefix]

    i = 4 --- x
    return prefix;



*/