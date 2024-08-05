package learn.java17.features.record_class;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        EmployeeRecord record = new EmployeeRecord(1L, "Rahul", 35, BigDecimal.valueOf(1000000), true);
        System.out.println(record);
        System.out.println(record.id().equals(1L));

        // Static variables
        System.out.println(EmployeeRecord.object + " , " + EmployeeRecord.DESCRIPTION + " , "
                + EmployeeRecord.volatileVariable + " , " + EmployeeRecord.transientVariable);

        // Implements Interface
        EmployeeRecord second = record.clone();
        System.out.println("Are first and second record equal :: " + record.equals(second));

        // Change one of the value --- TRY
        System.out.println("Are first and second record equal :: " + record.equals(second));
    }
}