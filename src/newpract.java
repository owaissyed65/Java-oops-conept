class Square{
    int side;

    public int Area() {
        return side*side;
    }
    public int Perimemter(int n) {
        return n*side;
    }

}
public class newpract {
    public static void main(String[] args) {
       Square sq = new Square();
       int n = 4;
       sq.side=4;
        System.out.println(sq.Area());
        System.out.println(sq.Perimemter(n));
    }
}
