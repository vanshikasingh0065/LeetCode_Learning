class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuffer sb = new StringBuffer();

        for (String str : words) {
            sb.append(str);
            String k = sb.toString();
            if (s.equals(k)) {
                return true;
            }
        }

        return false;
    }
}