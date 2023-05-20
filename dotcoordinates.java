public class dotcoordinates {
    public static void main(String[] args) {
        dot s = new dot();
        dot p = new dot();
        System.out.println(s.x);
        System.out.println(s.y);
        s.x=50;
        s.y=100;
        s.display();
        p.display();

    }
}
class dot{
    int x;
    int y;

    void display(){
        System.out.println("("+this.x+", "+this.y+")"); 
    }
}
