public class objclasses {

    public static void main(String[] args) {
        Dot aPoint = new Dot();
        Dot anotherPoint = new Dot();
        anotherPoint.setCoordinates();
        aPoint.display();
        anotherPoint.display();
        aPoint.xcoordinate = 10;
        aPoint.ycoordinate = 20;
        aPoint.display();
        aPoint.setCoordinates(25, 35);
        aPoint.display();
        aPoint.add(10);
        aPoint.display();
    }

}

class Dot {
    int xcoordinate;
    int ycoordinate;

    void display() {
        System.out.println("(" + xcoordinate + " , " + ycoordinate + ")");
    }

    void setCoordinates() {
        xcoordinate = -1;
        ycoordinate = -1;
    }

    void setCoordinates(int x, int y) {
        xcoordinate = x;
        ycoordinate = y;
    }

    void add(int inc) {
        xcoordinate = xcoordinate + inc;
        ycoordinate = ycoordinate + inc;
    }
}