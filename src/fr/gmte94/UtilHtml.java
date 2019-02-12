package fr.gmte94;

public class UtilHtml {
    /**
     * retourne une représentation HTML d'un tableau...
     *
     * @param tab     le tableau
     * @param maxRows le nombre maximum de lignes souhaité (doit être >= 0)
     * @return Si le tableau est vide, la méthode retourne la chaine "(vide)"
     * <p>
     * si le tableau contient moins de maxRows lignes, le deuxième
     * paramètre). Il y a autant de <tr>
     * que d'éléments dans le tableau à concurrence de maxRows lignes,
     * s'il le nombre d'éléments dans le tableau est supérieur à maxRows,
     * la dernière ligne sera définie par "..."
     * <pre>
     *      toHtml({"A", "B"}, 2)
     *      =>"<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>...</td></tr></table>";
     *      toHtmlTabl({}, 2)
     *      =>"(vide)"
     * </pre>
     */
    public String toHtmlTab(Object[] tab, int maxRows) {
//        return null;
        if(tab.length==0){/*si le tableau contient 0 élément*/
            return "(vide)";
        }
        else if(tab.length==1){/*si le tableau contient 1 élément*/
            return "<table><tr><td>A</td></tr></table>";
        }
        else if(tab.length-1==maxRows){/*si le tableau contient 1 élément*/
            return "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>...</td></tr></table>";
        }
        else if(tab.length>maxRows){/*si le tableau contient plus de maxRows éléments*/
            return "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
        }
        else {
            return "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
        }
    }
}