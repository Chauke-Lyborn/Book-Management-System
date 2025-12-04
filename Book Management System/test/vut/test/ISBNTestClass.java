/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.test;

import org.junit.Assert;
import org.junit.Test;
import vut.data.EBook;
import vut.data.PrintBook;

/**
 *
 * @author 223232327 CHAUKE VL 223307211 MOELETSI E 223389706 SHANGULE NT
 */
public class ISBNTestClass {

    EBook objEBook = new EBook();
    PrintBook objPBook = new PrintBook();

    @Test
    public void testSetIsbno067001617B() {

        objEBook.setIsbnNo("067001617B");
        Assert.assertEquals("067001617B", objEBook.getIsbnNo());
    }

    @Test
    public void testSetIsbno1367823245() {

        objPBook.setIsbnNo("1367823245");
        Assert.assertEquals("1367823245", objPBook.getIsbnNo());
    }

    @Test
    public void testSetIsbno198734561B() {

        objPBook.setIsbnNo("198734561B");
        Assert.assertEquals("198734561B", objPBook.getIsbnNo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIsbno192156844() {

        objPBook.setIsbnNo("192156844");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIsbno032156B840() {

        objEBook.setIsbnNo("032156B840");
    }

    @Test
    public void testSetIsbno032156840b() {

        objEBook.setIsbnNo("032156840b");
        Assert.assertEquals("032156840b", objEBook.getIsbnNo());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetIsbno198734561K() {

        objPBook.setIsbnNo("198734561K");
    }
}
