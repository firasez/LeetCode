class Base7 { // class Solution
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0"; // always 0
        }

        String base = ""; 
        boolean isNegative = num < 0; // checks if negative

        num = Math.abs(num);

        while (num > 0) {
            base = (num % 7) + base;
            num /= 7;
        }

        return (isNegative ? "-" : "") + base; 
    }
}