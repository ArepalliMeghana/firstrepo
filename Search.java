import java.util.*;
class Search{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>set=new ArrayList<>();
        int t=s.nextInt();
        int c=0;
        for (int j=0;j<t;j++){
        
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            c=1;
            for(int k=i+1;k<n;k++){
                if(a[i]!=-1){
            if(a[i]==a[k])
            {
                c=c+1;
                a[k]=-1;
            }
        }
        }
        
        if(c==1)
        {
            set.add(a[i]);
        }
        }
    }
    for(int k=0;k<set.size();k++)
    {
        int n=set.get(k);
        if(n!=-1){
        
        System.out.println(set.get(k));}
    }
    s.close();
}
}