/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

/**
 *
 * author 223232327 CHAUKE VL 223307211 MOELETSI E 223389706 SHANGULE NT
 */
public class EBook extends Book {

    private int fileSize;

    public EBook() {
    }

    public EBook(String title, String author, String isbnNo, int fileSize) {
        super(title, author, isbnNo);
        setFileSize(fileSize);
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public String getSizeDetails() {

        return "EBook: " + super.getTitle() + ", " + fileSize + " KB";
    }

    @Override
    public String toString() {
        return super.getTitle() + ", " + super.getAuthor() + ", " + super.getIsbnNo() + ", " + fileSize;
    }

}
