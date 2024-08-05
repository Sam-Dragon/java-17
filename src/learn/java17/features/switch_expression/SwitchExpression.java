package learn.java17.features.switch_expression;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchExpression {

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = LocalDate.now()
            .getDayOfWeek();
        boolean freeDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println("working day is " + dayOfWeek);
                yield false;
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("weekend is " + dayOfWeek);
                yield true;
            }
        };

        System.out.println("Is it weekend ? " + freeDay);
    }
}
