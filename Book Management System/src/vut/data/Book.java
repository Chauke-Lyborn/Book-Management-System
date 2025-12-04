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
public abstract class Book implements ProcessBook {

    private String title;
    private String author;
    private String isbnNo;

    public Book() {

    }

    public Book(String title, String author, String isbnNo) {
        setTitle(title);
        setAuthor(author);
        setIsbnNo(isbnNo);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbnNo(String isbnNo) {

        if (isbnNo.length() == 10) {

            if (isbnNo.substring(0, 9).matches("\\d+")) {

                if (isbnNo.matches("\\d+") || isbnNo.substring(9).toLowerCase().equals("b")) {

                    this.isbnNo = isbnNo;

                } else {

                    throw new IllegalArgumentException("Invalid ISBN: The last character may only be B or b. ISBN = " + isbnNo);
                }

            } else {
                throw new IllegalArgumentException("Invalid ISBN: The first 9 characters must digits only. ISBN = " + isbnNo);
            }

        } else {
            throw new IllegalArgumentException("Invalid ISBN: Must be 10 characters. ISBN = " + isbnNo);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    @Override
    public abstract String getSizeDetails();

}
