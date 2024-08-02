package learn.java17.feature.record;

import java.io.Serializable;
import java.math.BigDecimal;

public record EmployeeRecord(Long id, String name, int age, BigDecimal salary,
                             boolean male) implements Cloneable, Serializable {

    // Static variables, static final variables,
    public static String object = "Static";
    public static final String DESCRIPTION = "CONSTANT";

    public static transient String transientVariable = "Transient";
    public static volatile String volatileVariable = "Volatile";

    @Override
    public EmployeeRecord clone() throws CloneNotSupportedException {
        return (EmployeeRecord) super.clone();
    }
}

// Inheritance fails, as final class (record) cannot be subclassed
/*
class InheritEmployeeRecord extends EmployeeRecord(Long id,String name, int age, BigDecimal salary, boolean male){
}
*/
