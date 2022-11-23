public class Main {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.FRIDAY;
        weekDay.isHolliday();
        System.out.println(weekDay.isHolliday());
        System.out.println(weekDay.isWeekday());
    }
}