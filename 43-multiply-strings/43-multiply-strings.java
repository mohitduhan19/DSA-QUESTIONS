class Solution{ 
public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        if(num1.equals("1")) return num2;
        if(num2.equals("1")) return num1;
        int[] arr=new int[num1.length()+num2.length()];
        
        int i =num2.length() -1;
        int powerfactor = 0;
        int carry = 0;
        while(i>=0){
            int ival = (num2.charAt(i) - '0');
            i--;
            int k = arr.length - 1 - powerfactor;
            int j= num1.length() -1;
            while(j>=0 || carry!=0){
                int jval= j>=0 ?(num1.charAt(j) - '0'):0;
                int prod =jval*ival + carry + arr[k];
                j--;
                arr[k]=prod%10;
                carry =prod/10;
                k--;
            }
            powerfactor++;
        }
     
        boolean flag =false;
        
        StringBuilder ans=new StringBuilder();
        for( int x = 0; x < arr.length;x++){
            if(arr[x] == 0 && flag == false)continue;
            else{
                flag = true;
                ans.append(arr[x]);
            }
        }
     return ans.toString();
 }
}