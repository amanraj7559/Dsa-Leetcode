import java.util.*;
public class Mygraph1{
    int vertice;
    boolean[][] matrix;
    Mygraph1(int vertice){
        this.vertice=vertice;
        matrix=new boolean[vertice][vertice];
    }
    public void add(int i,int j){
        if(i>=0 && i<vertice && j>=0&&j<vertice){
            matrix[i][j]=true;
            matrix[j][i]=true;
        }
    
        else{
             System.out.println("Please enter correct value");

        }
        return;
    }
    public void print(){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<vertice;i++){
            s.append(i+": ");
            for(int j=0;j<vertice;j++){
                 s.append(matrix[i][j]?1:0);
               
            }
            System.out.print(s.toString());
        }

    }
    public void removeEdge(int i,int j){
        if(i>=0 && i<vertice && j>=0&&j<vertice){
            matrix[i][j]=false;
            matrix[j][i]=false;
        }
        else{
             System.out.println("Please enter correct value");

        }
        return;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of vertices");
        int ver=sc.nextInt();
        Mygraph1 g=new Mygraph1(ver);
       System.out.println("Enter no of edges");
       int edge=sc.nextInt();
       for(int i=0;i<edge;i++){
            g.add(sc.nextInt(),sc.nextInt());
       }
        g.print();
        g.removeEdge(2,1);
        g.print();
   

    }
}
