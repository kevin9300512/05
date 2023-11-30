package class03;
class ex01{
    private int width;
    private int height;
    private String name;
    public ex01 (int w, int h, String s){
        width=w;
        height=h;
        name=s;
    }
    public void show(){
        System.out.println("Name="+name);
        System.out.println("W="+width+", H="+height);
    }
    public class class03{
        public static void main(String[] args){
            ex01 w1=new ex01(3, 5, "Big windows");
            w1.show();
        };
    }
}
