// 解法 1:
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ;i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

// 解法 2:

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0 ;i--) {
           if (digits[i] != 9) {
               digits[i] ++;
                return digits;
           } else {
               if (i != 0) {
                   digits[i] = 0;
               } else {
                   digits = new int[digits.length + 1];
                   digits[0] = 1;
                   return digits;
               }
           }
        }
        return digits;
    }
}