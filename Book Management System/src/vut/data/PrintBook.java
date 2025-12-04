/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

/**
 *
 * @author 223232327 CHAUKE VL 223307211 MOELETSI E 223389706 SHANGULE NT
 */
public class PrintBook extends Book {

    private int noOfPages;
    private float weight;

    public PrintBook() {
    }

    public PrintBook(String title, String author, String isbnNo, int noOfPages, float weight) {
        super(title, author, isbnNo);
        setNoOfPages(noOfPages);
        setWeight(weight);
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String getSizeDetails() {
        return "Printbook: " + super.getTitle() + ", " + noOfPages + ", " + String.format("%.0f", weight) + "g";
    }

    @Override
    public String toString() {
        return super.getTitle() + ", " + super.getAuthor() + ", " + super.getIsbnNo() + ", " + noOfPages + ", " + String.format("%.2f", weight / 1000);
    }

}
