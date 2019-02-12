package fr.gmte94;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilHtmlTest {

    static UtilHtml uh;
    static {
        uh = new UtilHtml();
        System.out.println("call initTest");
    }

    static void initTest(){
        uh = new UtilHtml();
        System.out.println("call initTest");
    }

    @Test
    void toHtmlTab() {
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab =
                "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
    }

    @Test
    void toHtmlTabVide() {
//        UtilHtml uh = new UtilHtml();
        String arg[] = {};
        String expectedHtmlTab = "(vide)";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 10));
    }

    @Test
    void toHtmlTabUnElem() {
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"A"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
    }

    @Test
    void toHtmlTabNElemToNMoinsUnElem() {
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length-1));
    }

    @Test
    void toHtmlTabWithOne(){
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"A"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
    }

    @Test
    void toHtmlTabWithOneRequestZero(){
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"A"};
        String expectedHtmlTab = "";
        String result=uh.toHtmlTab(arg, 0);
        System.out.println(result);
        try{
            assertEquals(expectedHtmlTab, result);
            fail("Exception expected !");
        } catch(IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    void toHtmlTabWithTwoRequestOne(){
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"A","B"};
        String expectedHtmlTab = "<table><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 1));
    }

    @Test
    void toHtmlTabWithNRequestTwo(){
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"A","B","C","D","E"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 2));
    }

    @Test
    void toHtmlTabNRequestNmoins1(){
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab =  "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length-1));
    }

    @Test
    void toHtmlTabNRequestNDiviser2(){
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab = "<table><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length/2));
    }

    @Test
    void toHtmlTabAutresData() {
//        UtilHtml uh = new UtilHtml();
        String arg[] = {"2", "2", "0", "0", "0"};
        String expectedHtmlTab =
                "<table><tr><td>2</td></tr>" +
                        "<tr><td>2</td></tr>" +
                        "<tr><td>0</td></tr>" +
                        "<tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 4));
    }
}