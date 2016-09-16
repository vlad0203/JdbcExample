/**
 * Created by Влад on 9/9/2016.
 */
public class User {
    private int id;
    private int age;
    private String first;
    private String last;

    public User(int id, int age, String first, String last){
        this.id = id;
        this.age = age;
        this.first = first;
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
