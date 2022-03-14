class Solution {
    public String simplifyPath(String path) {
        Deque<String> q= new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");
        
        for(int i = 0; i < p.length;i++){
            if(q.size() > 0 && p[i].equals(".."))
                q.removeLast();
            else if(!p[i].equals("") &&!p[i].equals(".") &&!p[i].equals(".."))
                q.add(p[i]);
        }
        
        if(q.size() == 0)return "/";
        while(q.size() > 0){
            res.append("/").append(q.removeFirst());
        }
        return res.toString();
        }   
}