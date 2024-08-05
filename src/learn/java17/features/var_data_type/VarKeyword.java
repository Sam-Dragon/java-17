package learn.java17.features.var_data_type;

import java.util.Arrays;

/**
 * var datatype:
 * - generic datatype applied to data but once assigned datatype cant be reassigned to another datatype unlike in python
 * - Not possible to assign to lamda expression but can be used inside it
 * - cannot be initialized to "null"
 */

public class VarKeyword {

    public static void main(String[] args) {
        String string = "String datatype";
        System.out.println(string);

        var v = "common VAR datatype";
        System.out.println(v);

        var list = Arrays.asList(1, 2, 3);
        System.out.println("var as list :: " + list);

//        Wont work for lamda expression as it is not interface
//        var lamda = () -> System.out.println("var keyword");

//        var cannot be assigned to null reference
//        var nullRef = null;
    }
}
