public class Area {
    int r;
    int l;
    int b;

    void circle(int r){
        System.out.println("Area of Circle is : " + Math.PI*r*r);
    }

    void rectangle(int l,int b){
        System.out.println("Area of Rectangle is : " + l*b);
    }
    public static void main(String[] args){
        Area area = new Area();
        area.circle(5);
        area.rectangle(5,5);



    }
}
