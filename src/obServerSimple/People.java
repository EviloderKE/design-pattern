package obServerSimple;

public class People implements ObServer{

    private String name;


    public People(String name) {
        this.name = name;
    }

    @Override
    public void update(float price) {
        System.out.println(name + ": 当前价: " + price);
    }
}
