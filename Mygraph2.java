import java.util.*;
class Mygraph2{
    HashMap<Integer,List<Integer>> adjList;
    Mygraph2(){
        adjList =new HashMap();
    }
    void addVertex(int i){
        adjList.put(i,new ArrayList());

    }
    void addEdge(int src,int desc){
        adjList.get(src).add(desc);
        adjList.get(desc).add(src);
    }
    void printGraph(){
        for(Map.Entry<Integer,List<Integer>> e: adjList.entrySet()){
            System.out.println(e.getKey()+": ");
            for(int ele : e.getValue()){
                System.out.println(ele+" ");
            }
            System.out.println();
        }

    }
    void BFS(int start){
        Set<Integer> vis=new HashSet<Integer>();
        Queue<Integer> q=new LinkedList<Integer>();
        vis.add(start);
        while(!q.isEmpty()){
            int v=q.poll();
            System.out.println(
            for(int ele:adjList.get(v+ "")){
                if(!)
            }
        }
    }
    void DFS(int start){
        HashSet<Integer> vis=new hashSet<Integer>();
        dfsHelper(start,visited);
    }
    void dfsHeplre(int start hashSet<Integer> visited){
        visited.add(start);
        System.out.println(startvertex+: );
        for(int ele: )
    }
    public static void main(String[] args){
        Mygraph2 g=new Mygraph2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vertices");
        int v=sc.nextInt();
        for(int i=0;i<v;i++)
            g.addVertex(i);
        int e=sc.nextInt();
        for(int i=0;i<e;i++)
            g.addEdge(sc.nextInt(),sc.nextInt());
        g.printGraph();
    }
}