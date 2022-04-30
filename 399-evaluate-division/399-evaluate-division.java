class Solution {
    
    HashMap<String, HashMap<String, Double>> graph; 
    
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        //create graph
        graph = new HashMap();
        for(int i = 0; i < equations.size(); i++){
            List<String> equation = equations.get(i);
            
            String dividend = equation.get(0);
            String divisor  = equation.get(1);
            double quotient = values[i];
            
            graph.putIfAbsent(dividend, new HashMap<String, Double>());
            graph.putIfAbsent(divisor, new HashMap<String, Double>());
            
            graph.get(dividend).put(divisor, quotient);
            graph.get(divisor).put(dividend, 1 / quotient);
        }
        
        
        //get all query result
        double[] results = new double[queries.size()];
        
        for(int i = 0; i < queries.size(); i++){
            String dividend = queries.get(i).get(0);
            String divisor  = queries.get(i).get(1);
            
            if(!graph.containsKey(dividend) || !graph.containsKey(divisor)){
                results[i] = -1.0;
            }else if(dividend == divisor){
                results[i] = 1.0;
            }else{
                results[i] = queryUsingDfs(dividend, divisor, 1, new HashSet());
            }
        }
        
        
        return results;
    }
    
    private double queryUsingDfs(String currNode, String targetNode, double currProduct, Set<String> visited){
        visited.add(currNode);
        
        double result = -1.0;
        
        Map<String, Double> neighbors = graph.get(currNode);
            
        if(neighbors.containsKey(targetNode)){
            result = currProduct * neighbors.get(targetNode);
        } else {
            
            for(String nextNode : neighbors.keySet()){
                
                if(visited.contains(nextNode)) continue;
                
                double quotient = neighbors.get(nextNode);
                
                result = queryUsingDfs(nextNode, targetNode, currProduct * quotient, visited);
                
                //found
                if(result != -1.0) break; 
            }
            
        }
        //visited.remove(currNode);
        return result;
    }
    
    
}