import java.util.Arrays;


public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;


    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    };

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    };

    public String getName() {
       return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String str = "";
        for(Author tmp : authors) {
            str += "Author[name = " + tmp.getName() + ", email = " + tmp.getEmail() + ", gender = " + tmp.getGender() + "], ";
        }
        str = str.substring(0, str.lastIndexOf(","));
        return "Book" + "[name = " + name + ", authors = {" + str + "}, price = " + price + ", qty = " + qty + "]";
    }

    public String getAuthorNames() {
        String str = "";
        for(Author tmp : authors) {
            str += tmp.getName() + ", ";
        }
        str = str.substring(0, str.lastIndexOf(","));
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book right = (Book) obj;
        return price == right.price &&
                qty == right.qty &&
                name.equals(right.name) &&
                Arrays.equals(authors, right.authors);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + qty;
        long longValue = Double.doubleToLongBits(price);
        result = 37 * result + (int)(longValue - (longValue >>> 32));
        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + Arrays.hashCode(authors);
        return result;
    }
}



class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Author right = (Author) obj;
        return gender == right.gender &&
                name.equals(right.name) &&
                email.equals(right.email);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (int) gender;
        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + (email == null ? 0 : email.hashCode());
        return result;
    }
}