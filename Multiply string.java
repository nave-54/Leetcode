/*Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088" */

//SOLUTIONS

class Solution {
    public String multiply(String num1, String num2) {
        char[] ch1=num1.toCharArray();
        char[] ch2=num2.toCharArray();
        int l1=ch1.length,l2=ch2.length;
        char[] ans=new char[l1+l2];
        Arrays.fill(ans,'0');
        for(int i=l1-1;i>=0;i--){
            for(int j=l2-1;j>=0;j--){
                int mul=(ch1[i]-'0')*(ch2[j]-'0');
                int temp=ans[i+j+1]-'0' + mul;
                ans[i+j+1]=(char)(temp%10 + '0');
                ans[i+j]=(char)((ans[i+j]-'0' + temp/10) +'0');
            }
        }
        StringBuilder s=new StringBuilder();
        boolean check=false;
        for(char c:ans){
            if(c=='0' && !check){
                 continue;
            }
                s.append(c);
                check=true; 
        }
        return s.length()==0?"0":s.toString();
    }
}