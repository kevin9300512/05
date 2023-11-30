package class04;


class Diag{
    private int width;
    private int height;
    public Diag  (int w, int h, String s){
        width=w;
        height=h;
    }
    public void show(){
        System.out.println("W="+width+", H="+height);
        System.out.printf("length=%5.2f\n",dia());
    }
    public double dia(){
        return Math.sqrt(width*width+height*height);
    }
    public class class04{
        public static void main(String[] args){
            Diag d1=new Diag(8, 4, null);
            d1.show();
        };
    }
}
