/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
     HashMap<Node,Node>hm=new HashMap<>();
    public Node cloneGraph(Node node) {
       hm.clear();
       return dfsclone(node);
    }
    
    Node dfsclone(Node node){
        if(node==null ) return null;
        Node nn;
        if(hm.containsKey(node))return hm.get(node);
         else{ nn=new Node(node.val);
              hm.put(node,nn);
             }
        for(Node n:node.neighbors){
           if(!hm.containsKey(n)) nn.neighbors.add(dfsclone(n));
            else nn.neighbors.add(hm.get(n));
        }
        return nn;
    }
}
