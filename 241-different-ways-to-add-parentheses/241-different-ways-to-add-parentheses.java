class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i < expression.length();i++){
            char ch = expression.charAt(i);
            
            if(ch == '-' || ch == '+' || ch == '*'){
            String a = expression.substring(0 , i);
            String b = expression.substring(i+1);
            List<Integer> list1 = diffWaysToCompute(a);
            List<Integer> list2 = diffWaysToCompute(b);
            
            for(int val1 : list1){
                for(int val2 : list2){
                    if(ch == '-'){
                        res.add(val1 - val2);
                    }else if (ch == '+'){
                        res.add(val1 + val2);
                    }else if(ch == '*'){
                        res.add(val1*val2);
                    }
                }
             }
            }
        }
        if(res.size() == 0)res.add(Integer.valueOf(expression));
       return res;
    }
}