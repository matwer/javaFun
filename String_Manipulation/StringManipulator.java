public class StringManipulator {
    // trim both input strings and then concatenate them
    public String trimAndConcat(String one, String two) {
        String s = one.trim();
        String t = two.trim();
        return s.concat(t);
    }

    // get the index of the character the first time it appears in a string and return either the index or null
    public Integer getIndexOrNull(String str, char c) {
        int idx = str.indexOf(c);

        if (idx >= 0) {
            return idx;
        } else {
            return null;
        }
    }

    // overridign getIndexOrNull to get the index of the start of the substring and return either the index or null
    public Integer getIndexOrNull (String str, String sub) {
        int idx = str.indexOf(sub);

        if (idx >= 0) {
            return idx;
        } else {
            return null;
        }
    }

    // get a substring using a starting and ending index, and concatenate that with the second string input to our method.
    public String concatSubstring(String str, int start, int end, String str2) {
        String sub = str.substring(start,end);
        String newStr = sub.concat(str2);
        return newStr;
    }
}