package BuliderModel;

public class ConcentratorCentor implements Builder {
    private Product product = new Product();

    @Override
    public void bulidProduct1() {
        product.setProduct1("go product1");
    }

    @Override
    public void bulidProduct2() {
        product.setProduct2("go product2");
    }

    @Override
    public Product resultProduct() {
        return product;
    }
}
