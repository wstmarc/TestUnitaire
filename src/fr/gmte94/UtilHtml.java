package fr.gmte94;

import java.util.stream.IntStream;

public class UtilHtml {

    /** retourne une représentation HTML d'un tableau...
     * @param tab le tableau
     * @param maxRows le nombre maximum de lignes souhaité (doit être >= 0)
     * @return Si le tableau est vide, la méthode retourne la chaine "(vide)"
     *
     * si le tableau contient moins de maxRows lignes, le deuxième
     * paramètre). Il y a autant de <tr>
     * que d'éléments dans le tableau à concurrence de maxRows lignes,
     * s'il le nombre d'éléments dans le tableau est supérieur à maxRows,
     * la dernière ligne sera définie par "..."
     * <pre>
     *     toHtmlTab({"A", "B"}, 2)
     *     => "<table><tr><td>A</td></tr><tr><td>B</td></tr></table>"
     *     toHtmlTab({}, 2)
     *     => "(vide)"
     * </pre>
     */

    public String toHtmlTab(Object[] tab, int maxRows) {

        //=================================  FINAL TEST OK
/*        if(tab.length==0){
            return "(vide)";
        }else if (tab.length==1){
            if(maxRows==0){
                return "";
            }
            return "<table><tr><td>A</td></tr></table>";
        }else if (tab.length>maxRows){
            if (maxRows==1){
                return "<table><tr><td>...</td></tr></table>";
            }if (maxRows==2){
                return "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
            }
        }
        if (maxRows==4){
            return "<table><tr><td>2</td></tr><tr><td>2</td></tr><tr><td>0</td></tr><tr><td>...</td></tr></table>";
        }
        return "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
    }*///====================================FIN FINAL TEST OK


        /* Code de Maurice */
//    public String toHtmlTab(Object[] tab, int maxRows) {
//        if (tab.length == 0) return "(vide)";
//        if (maxRows == 0) return "";
//        StringBuilder sb = new StringBuilder("<table>");
//        final int max = Math.min(maxRows, tab.length);
//        for (int i = 0; i < max; i++) {
//            if ((i >= maxRows - 1) && (i < tab.length - 1)) {
//                sb.append("<tr><td>...</td></tr>");
//            } else {
//                sb.append("<tr><td>" + tab[i] + "</td></tr>");
//            }
//        }
//        sb.append("</table>");
//        return sb.toString();
//    }

        /*Code de Patrick*/

//    public String toHtmlTab(Object[] tab, int maxRows) {
//        //on test les cas expeptionel
//        if (
//                tab.length == 0) {
//            return "(vide)";
//        }
//        if (
//                maxRows == 0) {
//            return "";
//        }
//        // On retire la dernier valeur pour la remplacer par 3 petit points
//        if (
//                tab.length > maxRows) {
//            maxRows = maxRows - 1;
//        }
//        String resultat = "<table>";
//        for (int i = 0; i < maxRows; i++) {
//            resultat += "<tr><td>" + tab[i] + "</td></tr>";
//        }
//        if (tab.length > maxRows) {
//            resultat += "<tr><td>...</td></tr>";
//        }
//        resultat += "</table>";
//        return resultat;
//
//    }


        //CODE MAURICE 2 BB
        if (tab.length == 0){
            throw new IllegalArgumentException("call toHtmlTab with maxRow <= 0");
        } if(tab.length == 0) return "(vide)";
        if (maxRows == 0) return "";
        StringBuilder sb = new StringBuilder("<table>");
        final int max = Math.min(maxRows, tab.length);
        for (int i = 0; i < max; i++) {
            // équivalent de la boucle for
            //IntStream.range(0, max).forEachOrdered(i -> {
            if ((i >= maxRows - 1) && (i < tab.length - 1)) {
                sb.append("<tr><td>...</td></tr>");
            } else {
                sb.append("<tr><td>" + tab[i] + "</td></tr>");
            }
        }
        sb.append("</table>");
        return sb.toString();
        //FIN CODE MAURICE BB
    }
}

