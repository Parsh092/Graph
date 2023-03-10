import java.util.*;

class Disjoints{
    List<Integer> size = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    public Disjoints(int n){
        for(int i=0;i<=n;i++){
            size.add(0);
            parent.add(i);
        }
    }
    public int findUltimateParent(int u){
        if(parent.get(u)==u) return u;
        int ulti_par = findUltimateParent(parent.get(u));
        parent.set(u,ulti_par);
        return parent.get(u);
    }
    public void unionBySize(int u,int v){
        int ultimate_prt_u = findUltimateParent(u);
        int ultimate_prt_v = findUltimateParent(v);
        if(ultimate_prt_u==ultimate_prt_v) return;
        if (size.get(ultimate_prt_u)< size.get(ultimate_prt_v)){
            parent.set(ultimate_prt_u,ultimate_prt_v);
            size.set(size.get(ultimate_prt_v),size.get(ultimate_prt_v)+size.get(ultimate_prt_u));
        }
        else if (size.get(ultimate_prt_v)< size.get(ultimate_prt_u)){
            parent.set(ultimate_prt_v,ultimate_prt_u);
            size.set(size.get(ultimate_prt_u),size.get(ultimate_prt_v)+size.get(ultimate_prt_u));
        }
        else{
            parent.set(ultimate_prt_v,ultimate_prt_u);
            size.set(size.get(ultimate_prt_u),size.get(ultimate_prt_v)+size.get(ultimate_prt_u));
        }
    }
}
public class DisjointBySize {
    public static void main(String[] args) {
        Disjoints ds = new Disjoints(7);
        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);

        //check if the node 3 and 7 from same or not
        if(ds.findUltimateParent(3)==ds.findUltimateParent(7)) System.out.println("same");
        else System.out.println("not same");
        System.out.println(ds.parent.get(3));
        System.out.println(ds.parent.get(7));

        ds.unionBySize(3,7);
        if(ds.findUltimateParent(3)==ds.findUltimateParent(7)) System.out.println("same");
        else System.out.println("not same");
        System.out.println(ds.parent.get(3));
        System.out.println(ds.parent.get(7));
    }
}
