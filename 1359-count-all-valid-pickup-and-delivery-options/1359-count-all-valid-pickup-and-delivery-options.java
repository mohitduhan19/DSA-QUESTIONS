class Solution {
    public int countOrders(int n) {
        long pickup = 1 , delivery = 1 ,ans = 1;
        int mod = 1000000007;
        
        for(int i = 1; i <= n;i++){
            pickup = (pickup * i)%mod;
        }
        
        for(int i = 1; i <= n;i++){
            delivery = (delivery * (2 *i - 1) )%mod;
        }
        
         ans = (pickup * delivery)%mod;
        
        return (int)ans;
    }
}