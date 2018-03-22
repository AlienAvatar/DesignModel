package BuliderModel;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcentratorCentor();
        Director director = new Director(builder);
        director.doSomething();
        Product product = builder.resultProduct();
        System.out.println(product.getProduct1());
        System.out.println(product.getProduct2());
    }
}
