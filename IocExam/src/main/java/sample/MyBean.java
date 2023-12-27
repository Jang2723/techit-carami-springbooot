package sample;

public class MyBean {
    private int count;
    private String name;

    public MyBean() {
        System.out.println("MyBean 성공!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

}
