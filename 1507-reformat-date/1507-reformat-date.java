class Solution {
    public String reformatDate(String date) {
        Map<String,String> dates = new HashMap<>();
        dates.put("Jan", "01");
        dates.put("Feb", "02");
        dates.put("Mar", "03");
        dates.put("Apr", "04");
        dates.put("May", "05");
        dates.put("Jun", "06");
        dates.put("Jul", "07");
        dates.put("Aug", "08");
        dates.put("Sep", "09");
        dates.put("Oct", "10");
        dates.put("Nov", "11");
        dates.put("Dec", "12");

        String[] sp = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(sp[2]).append("-");
        sb.append(dates.get(sp[1])).append("-");
        sb.append(sp[0].length() == 3? ("0" + sp[0].substring(0,1)) : sp[0].substring(0,2));
        return sb.toString();

    }
}