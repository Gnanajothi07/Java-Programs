class Rectangle{
    int length;
    int breadth;
    
    Rectangle(){
        length=breadth=2;
    }
    Rectangle(int x,int y){
        length=breadth=2;
    }
    
}
class Cuboid extends Rectangle{
    int height;
    
    Cuboid(){
        height=5;
    }
    Cuboid(int x,int y){
        height=10;
    }
    public int volume(){
        return length*breadth*height;
    }
}

public class Main{
    public static void main(String args[]){
        Cuboid c = new Cuboid();
        System.out.println(c.volume());
    }
}
