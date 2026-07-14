class productcatalog{

    String productname;
    double price;

    productcatalog(String productname,double price){

        this.productname = productname;
        this.price = price;

    }

    public String toString(){
        return "PRODUCT NAME: " + productname + "| PRODUCT PRICE: " + price;
    }
}