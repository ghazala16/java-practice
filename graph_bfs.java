import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class graph_bfs {
        static class edge
        {
            int src,dest,wt;
            public edge(int s,int d,int w)
            {
                this.src=s;
                dest=d;
                wt=w;
            }
        }
        static void createGraph(ArrayList<edge>graph[])
        {
            for(int i=0;i<graph.length;i++)
            {
                graph[i]=new ArrayList<>();
            }
            graph[0].add(new edge(0,1,1));
            graph[0].add(new edge(0,2,1));
    
            graph[1].add(new edge(1,0,1));
            graph[1].add(new edge(1,3,1));
    
            graph[2].add(new edge(2,0,1));
            graph[2].add(new edge(2,4,1));
            
            graph[3].add(new edge(3,1,1));
            graph[3].add(new edge(3,4,1));
            graph[3].add(new edge(3,5,1));
    
            graph[4].add(new edge(4,2,1));
            graph[4].add(new edge(4,3,1));
            graph[4].add(new edge(4,5,1));
    
            graph[5].add(new edge(5,3,1));
            graph[5].add(new edge(5,4,1));
            graph[5].add(new edge(5,6,1));
    
            graph[5].add(new edge(6,5,1));
    
    
            //2's neighbour
            for(int i=0;i<graph[2].size();i++)
            {
                edge e = graph[2].get(i);
                System.out.println(e.dest);
            }
        }
        public static void main(String[] args) {
            int v=7;
            ArrayList<edge> graph[]=new ArrayList[v];
            createGraph(graph);
            bfs(graph);
        }
        public static void bfs(ArrayList<edge>[] graph)
        {
            Queue<Integer> q= new LinkedList<>();
            boolean vis[]=new boolean[graph.length];
            q.add(0);//source =0
            while(!q.isEmpty())
            {
                int curr = q.remove();

                if(!vis[curr])//visit curr
                {
                    System.out.println(curr+"");
                    vis[curr]=true;
                    for(int i=0;i<graph[curr].size();i++)
                    {
                        edge e=graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
            }
}
}