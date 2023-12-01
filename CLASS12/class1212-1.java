class Factor{
    public int fac(int n){
        if(n>=1)
           return n*fac(n-1);
        else return 1;   
    }
}

class Sum{
    private int sum = 0;
    public int add(int n){
        for(int i=1;i<=n;i++)
            sum+=i;
        return sum;
    }
}