import java.util.*;
class Disjoint{
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    public Disjoint(int n){
        for(int i=0;i<=n;i++){
            rank.add(0);
            parent.add(i);
        }
    }
    public int findUltimateParent(int u){
        if(parent.get(u)==u) return u;
        int ulti_par = findUltimateParent(parent.get(u));
        parent.set(u,ulti_par);
        return parent.get(u);
    }
    public void unionByRank(int u,int v){
        int ultimate_prt_u = findUltimateParent(u);
        int ultimate_prt_v = findUltimateParent(v);
        if(ultimate_prt_u==ultimate_prt_v) return;
        if (rank.get(ultimate_prt_u)< rank.get(ultimate_prt_v)){
            parent.set(ultimate_prt_u,ultimate_prt_v);
        }
        else if (rank.get(ultimate_prt_v)< rank.get(ultimate_prt_u)){
            parent.set(ultimate_prt_v,ultimate_prt_u);
        }
        else{
            parent.set(ultimate_prt_v,ultimate_prt_u);
            rank.set(ultimate_prt_u, rank.get(ultimate_prt_u)+1);
        }
    }
}
public class Graph {
    public static void main(String[] args) {
        Disjoint ds = new Disjoint(7);
        ds.unionByRank(1,2);
        ds.unionByRank(2,3);
        ds.unionByRank(4,5);
        ds.unionByRank(6,7);
        ds.unionByRank(5,6);

        //check if the node 3 and 7 from same or not
        if(ds.findUltimateParent(3)==ds.findUltimateParent(7)) System.out.println("same");
        else System.out.println("not same");

        ds.unionByRank(3,7);
        if(ds.findUltimateParent(3)==ds.findUltimateParent(7)) System.out.println("same");
        else System.out.println("not same");
    }
}
