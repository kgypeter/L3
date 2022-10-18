package Fabrik;
import java.util.ArrayList;
import java.util.*;

public class Product {

    String productName;
    int quantityYear1, nrSoldYear1,quantityYear2, nrSoldYear2,quantityYear3, nrSoldYear3;
    double demand1, demand2, demand3;

    public Product(String productName, int quantityYear1, int quantityYear2, int quantityYear3,
                   int nrSoldYear1, int nrSoldYear2, int nrSoldYear3, double demand1, double demand2, double demand3){
        this.productName = productName;
        this.quantityYear1 = quantityYear1;
        this.quantityYear2 = quantityYear2;
        this.quantityYear3 = quantityYear3;
        this.nrSoldYear1 = nrSoldYear1;
        this.nrSoldYear2 = nrSoldYear2;
        this.nrSoldYear3 = nrSoldYear3;
        this.demand1 = quantityYear1%nrSoldYear1;
        this.demand2 = quantityYear2%nrSoldYear2;
        this.demand3 = quantityYear3%nrSoldYear3;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityYear1() {
        return quantityYear1;
    }

    public int getNrSoldYear1() {
        return nrSoldYear1;
    }

    public int getQuantityYear2() {
        return quantityYear2;
    }

    public int getNrSoldYear2() {
        return nrSoldYear2;
    }

    public int getQuantityYear3() {
        return quantityYear3;
    }

    public int getNrSoldYear3() {
        return nrSoldYear3;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantityYear1(int quantityYear1) {
        this.quantityYear1 = quantityYear1;
    }

    public void setNrSoldYear1(int nrSoldYear1) {
        this.nrSoldYear1 = nrSoldYear1;
    }

    public void setQuantityYear2(int quantityYear2) {
        this.quantityYear2 = quantityYear2;
    }

    public void setNrSoldYear2(int nrSoldYear2) {
        this.nrSoldYear2 = nrSoldYear2;
    }

    public void setQuantityYear3(int quantityYear3) {
        this.quantityYear3 = quantityYear3;
    }

    public void setNrSoldYear3(int nrSoldYear3) {
        this.nrSoldYear3 = nrSoldYear3;
    }
    public double getDemand1() {
        return demand1;
    }

    public double getDemand2() {
        return demand2;
    }

    public double getDemand3() {
        return demand3;
    }
    public void setDemand1(double demand1) {
        this.demand1 = demand1;
    }

    public void setDemand2(double demand2) {
        this.demand2 = demand2;
    }

    public void setDemand3(double demand3) {
        this.demand3 = demand3;
    }

    void printProd(ArrayList<Product> products){
            for(Product product: products){
                System.out.println(product.toString());
            }
    }

    void sortArrDemand(ArrayList<Product> product){
            int n = product.size();
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (product.get(j).getDemand1() > product.get(j + 1).getDemand1()) {
                        Collections.swap(product, 1, 2);
                    }
    }

//    void prodNextYear(ArrayList<Product> product){
//        int n = product.size();
//        for (int i = 0; i < n - 1; i++) {
//            product.get(i).getQuantityYear1().set((product.get(i).getDemand1() * 0.5), i);
//        }
//    }

}
