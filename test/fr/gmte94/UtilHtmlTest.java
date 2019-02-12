package fr.gmte94;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilHtmlTest {

    @Test
    void toHtmlTab() {
        UtilHtml uh = new UtilHtml();
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab =
                "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
        //        assertEquals(0,(1/0));
        //        fail("Not implemented !");
    }

    @Test
    void toHtmlTabVide(){
        UtilHtml uh = new UtilHtml();
        String arg[] = {};
        String expectedHtmlTab = "(vide)";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, 10));
    }

    @Test
    void toHtmlTabUneLigne(){
        UtilHtml uh = new UtilHtml();
        String arg[] = {"A"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
    }

    @Test
    void toHtmlTabNMoinsUn() {
        UtilHtml uh = new UtilHtml();
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length-1));
    }

    @Test
    void toHtmlTabNSurDeux() {
        UtilHtml uh = new UtilHtml();
        String arg[] = {"A", "B", "C"};
        String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
        assertEquals(expectedHtmlTab, uh.toHtmlTab(arg, arg.length/2));
    }
}