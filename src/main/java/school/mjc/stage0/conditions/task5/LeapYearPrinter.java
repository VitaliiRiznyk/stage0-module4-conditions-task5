package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String result;

        switch (year % 4) {
            case 0:
                switch (year % 100) {
                    case 0:
                        switch (year % 400) {
                            case 0:
                                result = "leap";
                                break;
                            default:
                                result = "not leap";
                                break;
                        }
                        break;
                    default:
                        result = "leap";
                        break;
                }
                break;
            default:
                result = "not leap";
                break;
        }
        System.out.println(result);
    }
}
