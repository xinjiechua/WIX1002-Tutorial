package T08_Q3;

public class Coordinate {
    int x=0, y=0;

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX (){
        return x;
    }

    public int getY (){
        return y;
    }

    public void setX(int x){
        this.x =x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void print(){
        System.out.println("The coordinate is (" + getX() + "," + getY() +")");
    }

}
