public class Main {
    public static void main(String[] args) {
        //Circle cl1 = new Circle(5, "white");
        //Circle cl2 = new Circle(6, "white");
        //System.out.println(cl2.getArea());
    Author a1 = new Author("Petya", "34234", 'm');
    Author a2 = new Author("Vasya", "748374",'m');
    Author a3 = new Author("Anna", "34234", 'f');
    Author[] array = new Author[] {a1, a2, a3};
    Book bk1 = new Book("HarryP", array, 230.5);

        Author a1_ = new Author("Sasha", "34234", 'm');
        Author a2_ = new Author("Vasya", "748374",'m');
        Author a3_ = new Author("Anna", "34234", 'f');
        Author[] array_ = new Author[] {a1_, a2_, a3_};
        Book bk1_ = new Book("HarryP", array_, 230.5);


        System.out.println(bk1.toString());
        System.out.println(bk1_.toString());
        MyPoint mp = new MyPoint(3, 0);
        System.out.println(mp.distance(new MyPoint(12, 21)));
        System.out.println(mp.toString());
        MyPoint mp1 = new MyPoint(0, 0);
        MyPoint mp2 = new MyPoint(0, 3);
        MyPoint mp2_ = new MyPoint(1, 3);
        MyTriangle tr = new MyTriangle(mp, mp1, mp2);
        MyTriangle tr1 = new MyTriangle(mp, mp1, mp2_);
        System.out.println(tr.getType());
        System.out.println(bk1.equals(bk1_));
        System.out.println(tr.equals(tr1));
    }
}
