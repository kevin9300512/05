package class07;

public class bbb {
    private int sum=0;
    private int end;
    private double avg;
    public bbb(int e){
        end=0;
    }
    public double bbb(){
        for(int i=1;i<=end;i++)
            sum+=i;
        avg=(double)sum/end;
        return avg;
    }
 }
